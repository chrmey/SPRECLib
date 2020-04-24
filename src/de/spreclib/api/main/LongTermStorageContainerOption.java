package de.spreclib.api.main;

import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;

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
  protected LongTermStorageContainer getContainedObject() {
    return this.longTermStorageContainer;
  }
}
