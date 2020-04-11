package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
import de.spreclib.api.parameters.TimespanCalculator;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import java.util.ArrayList;

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

  public static FirstCentrifugationDurationOption valueOf(
      long firstCentrifugationStartTimeMilis, long firstCentrifugationEndTimeMillis) {

    int durationMinutes =
        new TimespanCalculator(firstCentrifugationStartTimeMilis, firstCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return valueOf(durationMinutes);
  }

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
