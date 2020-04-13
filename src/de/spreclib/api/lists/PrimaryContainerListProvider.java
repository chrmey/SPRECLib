package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PrimaryContainerOption;
import de.spreclib.model.enums.PrimaryContainer;
import java.util.ArrayList;

/**
 * ListProvider for PrimaryContainerOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.PrimaryContainerOption
 */
public final class PrimaryContainerListProvider {

  private static final ArrayList<PrimaryContainerOption> PRIMARY_CONTAINER_OPTIONS;

  static {
    PRIMARY_CONTAINER_OPTIONS = new ArrayList<>();
    for (PrimaryContainer primaryContainer : PrimaryContainer.values()) {
      PrimaryContainerOption primaryContainerOption = new PrimaryContainerOption(primaryContainer);
      PRIMARY_CONTAINER_OPTIONS.add(primaryContainerOption);
    }
  }

  public static ArrayList<PrimaryContainerOption> getList() {
    return PRIMARY_CONTAINER_OPTIONS;
  }
}
