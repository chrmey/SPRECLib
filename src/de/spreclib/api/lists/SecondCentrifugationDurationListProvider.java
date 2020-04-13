package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import java.util.ArrayList;

/**
 * ListProvider for SecondCentrifugationDurationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SecondCentrifugationDurationOption
 */
public final class SecondCentrifugationDurationListProvider {

  private static final ArrayList<SecondCentrifugationDurationOption>
      SECOND_CENTRIFUGATION_DURATION_OPTIONS;

  static {
    SECOND_CENTRIFUGATION_DURATION_OPTIONS = new ArrayList<>();
    for (SecondCentrifugationDuration secondCentrifugationDuration :
        SecondCentrifugationDuration.values()) {
      SecondCentrifugationDurationOption secondCentrifugationDurationOption =
          new SecondCentrifugationDurationOption(secondCentrifugationDuration);
      SECOND_CENTRIFUGATION_DURATION_OPTIONS.add(secondCentrifugationDurationOption);
    }
  }

  public static ArrayList<SecondCentrifugationDurationOption> getList() {
    return SECOND_CENTRIFUGATION_DURATION_OPTIONS;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a SecondCentrifugationDurationOption
   * if a SecondCentrifugationDurationOption with that timespan is found. Returns null otherwise.
   *
   * @param secondCentrifugationStartTimeMillis timestamp milliseconds EPOCH time
   * @param secondCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @return SecondCentrifugationDurationOption
   * @see #valueOf(int)
   */
  public static SecondCentrifugationDurationOption valueOf(
      long secondCentrifugationStartTimeMillis, long secondCentrifugationEndTimeMillis) {

    int durationMinutes =
        new Timespan(
                secondCentrifugationStartTimeMillis, secondCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a SecondCentrifugationDurationOption if a
   * SecondCentrifugationDurationOption with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return SecondCentrifugationDurationOption
   */
  public static SecondCentrifugationDurationOption valueOf(int durationMinutes) {
    for (SecondCentrifugationDurationOption secondCentrifugationDurationOption :
        SECOND_CENTRIFUGATION_DURATION_OPTIONS) {

      if (secondCentrifugationDurationOption.hasDuration(durationMinutes)) {
        return secondCentrifugationDurationOption;
      }
    }
    return null;
  }
}
