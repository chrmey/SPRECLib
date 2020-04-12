package de.spreclib.api.lists;

import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.WarmIschemiaTime;
import java.util.ArrayList;

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

  public static WarmIschemiaTimeOption valueOf(
      long vascularClampTimeMillis, long collectionTimeMillis) {

    int durationMinutes =
        new Timespan(vascularClampTimeMillis, collectionTimeMillis).getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  public static WarmIschemiaTimeOption valueOf(int durationMinutes) {

    for (WarmIschemiaTimeOption warmIschemiaTimeOption : WARM_ISCHEMIA_TIME_OPTIONS) {

      if (warmIschemiaTimeOption.hasDuration(durationMinutes)) {
        return warmIschemiaTimeOption;
      }
    }
    return null;
  }
}
