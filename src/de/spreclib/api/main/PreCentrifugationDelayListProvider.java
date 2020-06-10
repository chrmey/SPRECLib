package de.spreclib.api.main;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PreCentrifugationDelayOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.PreCentrifugationDelayOption
 */
public final class PreCentrifugationDelayListProvider
    extends AbstractListProvider<PreCentrifugationDelayOption> {

  public PreCentrifugationDelayListProvider() {
    super();
  }

  @Override
  List<PreCentrifugationDelayOption> generateList() {
    List<PreCentrifugationDelayOption> preCentrifugationDelayOptions = new ArrayList<>();
    for (PreCentrifugationDelay preCentrifugationDelay : PreCentrifugationDelay.values()) {
      PreCentrifugationDelayOption preCentrifugationDelayOption =
          new PreCentrifugationDelayOption(preCentrifugationDelay);
      preCentrifugationDelayOptions.add(preCentrifugationDelayOption);
    }
    return preCentrifugationDelayOptions;
  }

  /**
   * Takes instants and returns a PreCentrifugationDelayOption if a PreCentrifugationDelayOption
   * with that timespan is found.
   *
   * @param collectionTime Instant
   * @param firstCentrifugationStartTime Instant
   * @return PreCentrifugationDelayOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public PreCentrifugationDelayOption valueOf(
      Instant collectionTime, Instant firstCentrifugationStartTime) throws UndefinedValueException {

    long delayMinutes =
        new Timespan(collectionTime, firstCentrifugationStartTime).getTimespanMinutes();

    return this.valueOf(delayMinutes);
  }

  /**
   * Takes a duration in minutes and returns a PreCentrifugationDelayOption if a
   * PreCentrifugationDelayOption with that duration is found.
   *
   * @param delayMinutes delay in Minutes
   * @return PreCentrifugationDelayOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   */
  public PreCentrifugationDelayOption valueOf(long delayMinutes) throws UndefinedValueException {

    for (PreCentrifugationDelayOption preCentrifugationDelayOption : this.listOptions) {

      if (preCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return preCentrifugationDelayOption;
      }
    }
    throw new UndefinedValueException(
        delayMinutes,
        "PostCentrifugationDelay",
        "Value " + delayMinutes + "minutes undefined for PreCentrifugationDelay.");
  }
}
