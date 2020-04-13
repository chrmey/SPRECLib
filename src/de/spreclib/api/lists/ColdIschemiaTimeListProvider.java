package de.spreclib.api.lists;

import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.ColdIschemiaTime;
import java.util.ArrayList;

/**
 * ListProvider for ColdIschemiaTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.ColdIschemiaTimeOption
 */
public final class ColdIschemiaTimeListProvider {

  private static final ArrayList<ColdIschemiaTimeOption> Cold_ISCHEMIA_TIME_OPTIONS;

  static {
    Cold_ISCHEMIA_TIME_OPTIONS = new ArrayList<>();
    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      ColdIschemiaTimeOption coldIschemiaTimeOption = new ColdIschemiaTimeOption(coldIschemiaTime);
      Cold_ISCHEMIA_TIME_OPTIONS.add(coldIschemiaTimeOption);
    }
  }

  public static ArrayList<ColdIschemiaTimeOption> getList() {
    return Cold_ISCHEMIA_TIME_OPTIONS;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a ColdIschemiaTimeOption if a
   * ColdIschemiaTimeOption with that timespan is found. Returns null otherwise.
   *
   * @param colletionTimeMillis timestamp milliseconds EPOCH time
   * @param startOfFixationMillis timestamp milliseconds EPOCH time
   * @return ColdIschemiaTimeOption
   * @see #valueOf(int)
   */
  public static ColdIschemiaTimeOption valueOf(
      long colletionTimeMillis, long startOfFixationMillis) {

    int durationMinutes =
        new Timespan(colletionTimeMillis, startOfFixationMillis).getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a ColdIschemiaTimeOption if a ColdIschemiaTimeOption
   * with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return ColdIschemiaTimeOption
   */
  public static ColdIschemiaTimeOption valueOf(int durationMinutes) {

    for (ColdIschemiaTimeOption coldIschemiaTimeOption : Cold_ISCHEMIA_TIME_OPTIONS) {

      if (coldIschemiaTimeOption.hasDuration(durationMinutes)) {
        return coldIschemiaTimeOption;
      }
    }
    return null;
  }
}
