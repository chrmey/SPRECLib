package de.spreclib.api.main;

import de.spreclib.model.enums.PrimaryContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PrimaryContainerOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.PrimaryContainerOption
 */
public final class PrimaryContainerListProvider
    extends AbstractListProvider<PrimaryContainerOption> {

  public PrimaryContainerListProvider() {
    super();
  }

  @Override
  protected List<PrimaryContainerOption> generateList() {
    List<PrimaryContainerOption> primaryContainerOptions = new ArrayList<>();
    for (PrimaryContainer primaryContainer : PrimaryContainer.values()) {
      PrimaryContainerOption primaryContainerOption = new PrimaryContainerOption(primaryContainer);
      primaryContainerOptions.add(primaryContainerOption);
    }
    return primaryContainerOptions;
  }
}
