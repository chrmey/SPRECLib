package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.interfaces.ICodePart;

public class PrimaryContainerOption implements IListOption {

  private PrimaryContainer primaryContainer;

  public PrimaryContainerOption(PrimaryContainer primaryContainer) {
    this.primaryContainer = primaryContainer;
  }

  @Override
  public String getStringRepresentation() {
    // TODO Implement
    return null;
  }

}
