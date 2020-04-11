package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FixationTimeOption;
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
}
