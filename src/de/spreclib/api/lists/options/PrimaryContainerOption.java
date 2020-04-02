package de.spreclib.api.lists.options;

import de.spreclib.model.enums.PrimaryContainer;

public final class PrimaryContainerOption extends AbstractListOption {

  private final PrimaryContainer primaryContainer;

  public PrimaryContainerOption(PrimaryContainer primaryContainer) {
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
