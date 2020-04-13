package de.spreclib.api.lists.options;

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
