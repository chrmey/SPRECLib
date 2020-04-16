package de.spreclib.api.lists;

import de.spreclib.model.enums.Fixation;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FixationOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.FixationOption
 */
public final class FixationListProvider extends AbstractListProvider<FixationOption> {

  public FixationListProvider() {
    super();
  }

  @Override
  protected List<FixationOption> generateList() {
    List<FixationOption> fixationOptions = new ArrayList<>();
    for (Fixation fixation : Fixation.values()) {
      FixationOption fixationOption = new FixationOption(fixation);
      fixationOptions.add(fixationOption);
    }
    return fixationOptions;
  }
}
