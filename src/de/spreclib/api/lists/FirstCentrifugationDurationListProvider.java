package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import java.util.ArrayList;

/**
 * ListProvider for FirstCentrifugationDurationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FirstCentrifugationDurationOption
 */
public final class FirstCentrifugationDurationListProvider {

  private static final ArrayList<FirstCentrifugationDurationOption>
      FIRST_CENTRIFUGATION_DURATION_OPTIONS;

  static {
    FIRST_CENTRIFUGATION_DURATION_OPTIONS = new ArrayList<>();
    for (FirstCentrifugationDuration firstCentrifugationDuration :
        FirstCentrifugationDuration.values()) {
      FirstCentrifugationDurationOption firstCentrifugationDurationOption =
          new FirstCentrifugationDurationOption(firstCentrifugationDuration);
      FIRST_CENTRIFUGATION_DURATION_OPTIONS.add(firstCentrifugationDurationOption);
    }
  }

  public static ArrayList<FirstCentrifugationDurationOption> getList() {
    return FIRST_CENTRIFUGATION_DURATION_OPTIONS;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a FirstCentrifugationDurationOption if
   * a FirstCentrifugationDurationOption with that timespan is found. Returns null otherwise.
   *
   * @param firstCentrifugationStartTimeMillis timestamp milliseconds EPOCH time
   * @param firstCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @return FirstCentrifugationDurationOption
   * @see #valueOf(int)
   */
  public static FirstCentrifugationDurationOption valueOf(
      long firstCentrifugationStartTimeMillis, long firstCentrifugationEndTimeMillis) {

    int durationMinutes =
        new Timespan(firstCentrifugationStartTimeMillis, firstCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a FirstCentrifugationDurationOption if a
   * FirstCentrifugationDurationOption with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return FirstCentrifugationDurationOption
   */
  public static FirstCentrifugationDurationOption valueOf(int durationMinutes) {
    for (FirstCentrifugationDurationOption firstCentrifugationDurationOption :
        FIRST_CENTRIFUGATION_DURATION_OPTIONS) {

      if (firstCentrifugationDurationOption.hasDuration(durationMinutes)) {
        return firstCentrifugationDurationOption;
      }
    }
    return null;
  }
}
