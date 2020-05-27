package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.model.fixation.Fixation;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FixationOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.FixationOption
 */
public final class FixationListProvider extends AbstractListProvider<FixationOption>
    implements IFactorListProvider<FixationOption> {

  public FixationListProvider() {
    super();
  }

  @Override
  List<FixationOption> generateList() {
    List<FixationOption> fixationOptions = new ArrayList<>();
    for (Fixation fixation : Fixation.values()) {
      FixationOption fixationOption = new FixationOption(fixation);
      fixationOptions.add(fixationOption);
    }
    return fixationOptions;
  }

  @Override
public FixationOption getOptionFromCodeString(String codeString) {
    for (FixationOption fixationOption : this.listOptions) {
      if (fixationOption.hasCodeString(codeString)) {
        return fixationOption;
      }
    }
    return null;
  }
}
