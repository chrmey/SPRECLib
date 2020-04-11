package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import de.spreclib.api.parameters.TimespanCalculator;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import java.util.ArrayList;

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

  public static SecondCentrifugationDurationOption valueOf(
      long secondCentrifugationStartTimeMillis, long secondCentrifugationEndTimeMillis) {

    int durationMinutes =
        new TimespanCalculator(
                secondCentrifugationStartTimeMillis, secondCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return valueOf(durationMinutes);
  }

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
