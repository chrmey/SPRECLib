package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.parameters.TimespanCalculator;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import java.util.ArrayList;

public final class PreCentrifugationDelayListProvider {

  private static final ArrayList<PreCentrifugationDelayOption> PRE_CENTRIFUGATION_DELAY_OPTIONS;

  static {
    PRE_CENTRIFUGATION_DELAY_OPTIONS = new ArrayList<>();
    for (PreCentrifugationDelay preCentrifugationDelay : PreCentrifugationDelay.values()) {
      PreCentrifugationDelayOption preCentrifugationDelayOption =
          new PreCentrifugationDelayOption(preCentrifugationDelay);
      PRE_CENTRIFUGATION_DELAY_OPTIONS.add(preCentrifugationDelayOption);
    }
  }

  public static ArrayList<PreCentrifugationDelayOption> getList() {
    return PRE_CENTRIFUGATION_DELAY_OPTIONS;
  }

  public static PreCentrifugationDelayOption valueOf(
      long collectionTimeMillis, long firstCentrifugationStartTimeMillis) {

    int delayMinutes =
        new TimespanCalculator(collectionTimeMillis, firstCentrifugationStartTimeMillis)
            .getTimespanMinutes();

    return valueOf(delayMinutes);
  }

  public static PreCentrifugationDelayOption valueOf(int delayMinutes) {

    for (PreCentrifugationDelayOption preCentrifugationDelayOption :
        PRE_CENTRIFUGATION_DELAY_OPTIONS) {

      if (preCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return preCentrifugationDelayOption;
      }
    }
    return null;
  }
}
