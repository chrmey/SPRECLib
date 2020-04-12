package de.spreclib.api.lists;

import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.ColdIschemiaTime;
import java.util.ArrayList;

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

  public static ColdIschemiaTimeOption valueOf(
      long colletionTimeMillis, long startOfFixationMillis) {

    int durationMinutes =
        new Timespan(colletionTimeMillis, startOfFixationMillis).getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  public static ColdIschemiaTimeOption valueOf(int durationMinutes) {

    for (ColdIschemiaTimeOption coldIschemiaTimeOption : Cold_ISCHEMIA_TIME_OPTIONS) {

      if (coldIschemiaTimeOption.hasDuration(durationMinutes)) {
        return coldIschemiaTimeOption;
      }
    }
    return null;
  }
}
