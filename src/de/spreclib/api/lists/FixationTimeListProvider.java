package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FixationTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.FixationTime;
import java.util.ArrayList;

/**
 * ListProvider for FixationTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FixationOption
 */
public final class FixationTimeListProvider {

  private static final ArrayList<FixationTimeOption> FIXATION_TIME_OPTIONS;

  static {
    FIXATION_TIME_OPTIONS = new ArrayList<>();
    for (FixationTime fixationTime : FixationTime.values()) {
      FixationTimeOption fixationOption = new FixationTimeOption(fixationTime);
      FIXATION_TIME_OPTIONS.add(fixationOption);
    }
  }

  public static ArrayList<FixationTimeOption> getList() {
    return FIXATION_TIME_OPTIONS;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a FixationTimeOption if a
   * FixationTimeOption with that timespan is found. Returns null otherwise.
   *
   * @param startOfFixationTimeMillis timestamp milliseconds EPOCH time
   * @param endOfFixationTimeMillis timestamp milliseconds EPOCH time
   * @return FixationTimeOption
   * @see #valueOf(int)
   */
  public static FixationTimeOption valueOf(
      long startOfFixationTimeMillis, long endOfFixationTimeMillis) {

    int durationMinutes =
        new Timespan(startOfFixationTimeMillis, endOfFixationTimeMillis).getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a FixationTimeOption if a FixationTimeOption with that
   * duration is found. Returns null otherwise
   *
   * @param durationMinutes durationMinutes
   * @return FixationTimeOption
   */
  public static FixationTimeOption valueOf(int durationMinutes) {

    for (FixationTimeOption fixationTimeOption : FIXATION_TIME_OPTIONS) {

      if (fixationTimeOption.hasDuration(durationMinutes)) {
        return fixationTimeOption;
      }
    }
    return null;
  }
}
