package de.spreclib.api.lists.options;

import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;

public final class LongTermStorageContainerOption extends AbstractListOption {

  private final LongTermStorageContainer longTermStorageContainer;

  public LongTermStorageContainerOption(LongTermStorageContainer longTermStorageContainer) {
    this.longTermStorageContainer = longTermStorageContainer;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.longTermStorageContainer.name());
  }

  @Override
  public LongTermStorageContainer getContainedObject() {
    return this.longTermStorageContainer;
  }
}
