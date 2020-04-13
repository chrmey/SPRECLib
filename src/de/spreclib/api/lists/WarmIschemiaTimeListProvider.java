package de.spreclib.api.lists;

import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.WarmIschemiaTime;
import java.util.ArrayList;

/**
 * ListProvider for WarmIschemiaTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.WarmIschemiaTimeOption
 */
public final class WarmIschemiaTimeListProvider {

  private static final ArrayList<WarmIschemiaTimeOption> WARM_ISCHEMIA_TIME_OPTIONS;

  static {
    WARM_ISCHEMIA_TIME_OPTIONS = new ArrayList<>();
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      WarmIschemiaTimeOption warmIschemiaTimeOption = new WarmIschemiaTimeOption(warmIschemiaTime);
      WARM_ISCHEMIA_TIME_OPTIONS.add(warmIschemiaTimeOption);
    }
  }

  public static ArrayList<WarmIschemiaTimeOption> getList() {
    return WARM_ISCHEMIA_TIME_OPTIONS;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a WarmIschemiaTimeOption if a
   * WarmIschemiaTimeOption with that timespan is found. Returns null otherwise.
   *
   * @param vascularClampTimeMillis timestamp milliseconds EPOCH time
   * @param collectionTimeMillis timestamp milliseconds EPOCH time
   * @return WarmIschemiaTimeOption
   * @see #valueOf(int)
   */
  public static WarmIschemiaTimeOption valueOf(
      long vascularClampTimeMillis, long collectionTimeMillis) {

    int durationMinutes =
        new Timespan(vascularClampTimeMillis, collectionTimeMillis).getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a WarmIschemiaTimeOption if a WarmIschemiaTimeOption
   * with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return WarmIschemiaTimeOption
   */
  public static WarmIschemiaTimeOption valueOf(int durationMinutes) {

    for (WarmIschemiaTimeOption warmIschemiaTimeOption : WARM_ISCHEMIA_TIME_OPTIONS) {

      if (warmIschemiaTimeOption.hasDuration(durationMinutes)) {
        return warmIschemiaTimeOption;
      }
    }
    return null;
  }
}
