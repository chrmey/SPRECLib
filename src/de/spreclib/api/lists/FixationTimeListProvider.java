package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FixationTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.FixationTime;
import java.util.ArrayList;

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

  public static FixationTimeOption valueOf(
      long startOfFixationTimeMillis, long endOfFixationTimeMillis) {

    int durationMinutes =
        new Timespan(startOfFixationTimeMillis, endOfFixationTimeMillis).getTimespanMinutes();

    return valueOf(durationMinutes);
  }

  public static FixationTimeOption valueOf(int durationMinutes) {

    for (FixationTimeOption fixationTimeOption : FIXATION_TIME_OPTIONS) {

      if (fixationTimeOption.hasDuration(durationMinutes)) {
        return fixationTimeOption;
      }
    }
    return null;
  }
}
