package de.spreclib.api.lists;

import de.spreclib.model.enums.PrimaryContainer;

/**
 * PrimaryContainerOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class PrimaryContainerOption extends AbstractListOption {

  private final PrimaryContainer primaryContainer;

  PrimaryContainerOption(PrimaryContainer primaryContainer) {
    this.primaryContainer = primaryContainer;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.primaryContainer.name());
  }

  @Override
  public PrimaryContainer getContainedObject() {
    return this.primaryContainer;
  }
}
