package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import java.util.ArrayList;

/**
 * ListProvider for PreCentrifugationDelayOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.PreCentrifugationDelayOption
 */
public final class PreCentrifugationDelayListProvider {

  private static final ArrayList<PreCentrifugationDelayOption> PRE_CENTRIFUGATION_DELAY_OPTIONS;

  static {
    PRE_CENTRIFUGATION_DELAY_OPTIONS = new ArrayList<>();
    for (PreCentrifugationDelay preCentrifugationDelay : PreCentrifugationDelay.values()) {
      PreCentrifugationDelayOption preCentrifugationDelayOption =
          new PreCentrifugationDelayOption(preCentrifugationDelay);
      PRE_CENTRIFUGATION_DELAY_OPTIONS.add(preCentrifugationDelayOption);
    }
  }

  public static ArrayList<PreCentrifugationDelayOption> getList() {
    return PRE_CENTRIFUGATION_DELAY_OPTIONS;
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
  public static PreCentrifugationDelayOption valueOf(
      long collectionTimeMillis, long firstCentrifugationStartTimeMillis) {

    int delayMinutes =
        new Timespan(collectionTimeMillis, firstCentrifugationStartTimeMillis)
            .getTimespanMinutes();

    return valueOf(delayMinutes);
  }

  /**
   * Takes a duration in minutes and returns a PreCentrifugationDelayOption if a
   * PreCentrifugationDelayOption with that duration is found. Returns null otherwise
   *
   * @param delayMinutes delay in Minutes
   * @return PreCentrifugationDelayOption
   */
  public static PreCentrifugationDelayOption valueOf(int delayMinutes) {

    for (PreCentrifugationDelayOption preCentrifugationDelayOption :
        PRE_CENTRIFUGATION_DELAY_OPTIONS) {

      if (preCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return preCentrifugationDelayOption;
      }
    }
    return null;
  }
}
