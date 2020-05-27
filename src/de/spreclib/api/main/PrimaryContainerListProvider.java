package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.model.primarycontainer.PrimaryContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PrimaryContainerOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.PrimaryContainerOption
 */
public final class PrimaryContainerListProvider extends AbstractListProvider<PrimaryContainerOption>
    implements IFactorListProvider<PrimaryContainerOption> {

  public PrimaryContainerListProvider() {
    super();
  }

  @Override
  List<PrimaryContainerOption> generateList() {
    List<PrimaryContainerOption> primaryContainerOptions = new ArrayList<>();
    for (PrimaryContainer primaryContainer : PrimaryContainer.values()) {
      PrimaryContainerOption primaryContainerOption = new PrimaryContainerOption(primaryContainer);
      primaryContainerOptions.add(primaryContainerOption);
    }
    return primaryContainerOptions;
  }

  @Override
public PrimaryContainerOption getOptionFromCodeString(String codeString) {
    for (PrimaryContainerOption primaryContainerOption : this.listOptions) {
      if (primaryContainerOption.hasCodeString(codeString)) {
        return primaryContainerOption;
      }
    }
    return null;
  }
}
