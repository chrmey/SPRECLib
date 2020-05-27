package de.spreclib.api.main;

import de.spreclib.model.primarycontainer.PrimaryContainer;

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
  PrimaryContainer getContainedObject() {
    return this.primaryContainer;
  }

  boolean hasCodeString(String codeString) {
    if (this.primaryContainer
        .getCodeFromSprecFactor()
        .getStringRepresentation()
        .equals(codeString)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((primaryContainer == null) ? 0 : primaryContainer.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    PrimaryContainerOption other = (PrimaryContainerOption) obj;
    if (primaryContainer != other.primaryContainer) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "PrimaryContainerOption [primaryContainer=" + primaryContainer + "]";
  }
}
