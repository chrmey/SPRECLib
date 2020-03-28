package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;

public final class LongTermStorageOption implements IListOption {

  private LongTermStorage longTermStorage;

  public LongTermStorageOption(LongTermStorage longTermStorage) {
    this.longTermStorage = longTermStorage;
  }

  @Override
  public String getStringRepresentation() {
    // TODO Implement
    return null;
  }
}
