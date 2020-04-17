package de.spreclib.api.lists;

import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PreCentrifugationDelayOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.PreCentrifugationDelayOption
 */
public final class PreCentrifugationDelayListProvider
    extends AbstractListProvider<PreCentrifugationDelayOption> {

  public PreCentrifugationDelayListProvider() {
    super();
  }

  @Override
  public List<PreCentrifugationDelayOption> generateList() {
    List<PreCentrifugationDelayOption> preCentrifugationDelayOptions = new ArrayList<>();
    for (PreCentrifugationDelay preCentrifugationDelay : PreCentrifugationDelay.values()) {
      PreCentrifugationDelayOption preCentrifugationDelayOption =
          new PreCentrifugationDelayOption(preCentrifugationDelay);
      preCentrifugationDelayOptions.add(preCentrifugationDelayOption);
    }
    return preCentrifugationDelayOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a PreCentrifugationDelayOption if a
   * PreCentrifugationDelayOption with that timespan is found. Returns null otherwise.
   *
   * @param collectionTimeMillis timestamp milliseconds EPOCH time
   * @param firstCentrifugationStartTimeMillis timestamp milliseconds EPOCH time
   * @return PreCentrifugationDelayOption
   * @see #valueOf(int)
   */
  public PreCentrifugationDelayOption valueOf(
      long collectionTimeMillis, long firstCentrifugationStartTimeMillis) {

    int delayMinutes =
        new Timespan(collectionTimeMillis, firstCentrifugationStartTimeMillis).getTimespanMinutes();

    return this.valueOf(delayMinutes);
  }

  /**
   * Takes a duration in minutes and returns a PreCentrifugationDelayOption if a
   * PreCentrifugationDelayOption with that duration is found. Returns null otherwise
   *
   * @param delayMinutes delay in Minutes
   * @return PreCentrifugationDelayOption
   */
  public PreCentrifugationDelayOption valueOf(int delayMinutes) {

    for (PreCentrifugationDelayOption preCentrifugationDelayOption : this.listOptions) {

      if (preCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return preCentrifugationDelayOption;
      }
    }
    return null;
  }
}
