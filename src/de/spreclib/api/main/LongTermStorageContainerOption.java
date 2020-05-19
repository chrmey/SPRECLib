package de.spreclib.api.main;

import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;

/**
 * LongTermStorageContainerOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class LongTermStorageContainerOption extends AbstractListOption {

  private final LongTermStorageContainer longTermStorageContainer;

  LongTermStorageContainerOption(LongTermStorageContainer longTermStorageContainer) {
    this.longTermStorageContainer = longTermStorageContainer;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.longTermStorageContainer.name());
  }

  @Override
  LongTermStorageContainer getContainedObject() {
    return this.longTermStorageContainer;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result
            + ((longTermStorageContainer == null) ? 0 : longTermStorageContainer.hashCode());
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
    LongTermStorageContainerOption other = (LongTermStorageContainerOption) obj;
    if (longTermStorageContainer != other.longTermStorageContainer) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "LongTermStorageContainerOption [longTermStorageContainer="
        + longTermStorageContainer
        + "]";
  }
}
