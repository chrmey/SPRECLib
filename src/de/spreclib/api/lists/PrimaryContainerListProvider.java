package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PrimaryContainerOption;
import de.spreclib.model.enums.PrimaryContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PrimaryContainerOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.PrimaryContainerOption
 */
public final class PrimaryContainerListProvider {

  private final List<PrimaryContainerOption> primaryContainerOptions;

  public PrimaryContainerListProvider() {
    this.primaryContainerOptions = generateList();
  }

  private List<PrimaryContainerOption> generateList() {
    List<PrimaryContainerOption> primaryContainerOptions = new ArrayList<>();
    for (PrimaryContainer primaryContainer : PrimaryContainer.values()) {
      PrimaryContainerOption primaryContainerOption = new PrimaryContainerOption(primaryContainer);
      primaryContainerOptions.add(primaryContainerOption);
    }
    return primaryContainerOptions;
  }

  public List<PrimaryContainerOption> getList() {
    return this.primaryContainerOptions;
  }
}
