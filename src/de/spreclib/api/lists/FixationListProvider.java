package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FixationOption;
import de.spreclib.model.enums.Fixation;
import java.util.ArrayList;

/**
 * ListProvider for FixationOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FixationOption
 */
public final class FixationListProvider {

  private static final ArrayList<FixationOption> FIXATION_OPTIONS;

  static {
    FIXATION_OPTIONS = new ArrayList<>();
    for (Fixation fixation : Fixation.values()) {
      FixationOption fixationOption = new FixationOption(fixation);
      FIXATION_OPTIONS.add(fixationOption);
    }
  }

  public static ArrayList<FixationOption> getList() {
    return FIXATION_OPTIONS;
  }
}
