package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FixationOption;
import de.spreclib.model.enums.Fixation;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FixationOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.FixationOption
 */
public final class FixationListProvider {

  private final List<FixationOption> fixationOptions;

  public FixationListProvider() {
    this.fixationOptions = generateList();
  }

  private List<FixationOption> generateList() {
    List<FixationOption> fixationOptions = new ArrayList<>();
    for (Fixation fixation : Fixation.values()) {
      FixationOption fixationOption = new FixationOption(fixation);
      fixationOptions.add(fixationOption);
    }
    return fixationOptions;
  }

  public List<FixationOption> getList() {
    return this.fixationOptions;
  }
}
