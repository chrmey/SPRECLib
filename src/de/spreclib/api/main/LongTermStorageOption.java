package de.spreclib.api.main;

import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.ParameterizedLongTermStorage;
import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
import de.spreclib.model.longtermstorage.enums.LongTermStorageType;

/**
 * LongTermStorageOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class LongTermStorageOption extends AbstractListOption {

  private final LongTermStorage longTermStorage;

  LongTermStorageOption(LongTermStorage longTermStorage) {
    this.longTermStorage = longTermStorage;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    LongTermStorageType longTermStorageType = this.longTermStorage.getLongTermStorageType();

    name.append(NAMES_DEFAULT.getString(longTermStorageType.name()));

    if (this.longTermStorage.isParameterizedLongTermStorage()) {

      ParameterizedLongTermStorage normalLongTermStorage =
          (ParameterizedLongTermStorage) this.longTermStorage;

      LongTermStorageContainer longTermStorageContainer =
          normalLongTermStorage.getLongTermStorageContainer();
      LongTermStorageTemperature longTermStorageTemperature =
          normalLongTermStorage.getLongTermStorageTemperature();

      name.append(NAMES_DEFAULT.getString(longTermStorageContainer.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(longTermStorageTemperature.name()));
    }

    return name.toString();
  }

  @Override
  LongTermStorage getContainedObject() {
    return this.longTermStorage;
  }

  protected boolean hasLongTermStorage(
      LongTermStorageContainerOption longTermStorageContainerOption,
      LongTermStorageTemperatureOption longTermStorageTemperatureOption) {

    if (longTermStorageTemperatureOption == null) {
      return false;
    }
    if (longTermStorageContainerOption == null) {
      return false;
    }

    if (this.longTermStorage.isParameterizedLongTermStorage()) {

      LongTermStorageTemperature longTermStorageTemperature =
          longTermStorageTemperatureOption.getContainedObject();
      LongTermStorageContainer longTermStorageContainer =
          longTermStorageContainerOption.getContainedObject();

      ParameterizedLongTermStorage normalLongTermStorage =
          (ParameterizedLongTermStorage) this.longTermStorage;

      if (normalLongTermStorage.contains(longTermStorageContainer, longTermStorageTemperature)) {
        return true;
      }
    }
    return false;
  }

  boolean hasCodeString(String codeString) {
    if (this.longTermStorage
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
    result = prime * result + ((longTermStorage == null) ? 0 : longTermStorage.hashCode());
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
    LongTermStorageOption other = (LongTermStorageOption) obj;
    if (longTermStorage == null) {
      if (other.longTermStorage != null) {
        return false;
      }
    } else if (!longTermStorage.equals(other.longTermStorage)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "LongTermStorageOption [longTermStorage=" + longTermStorage + "]";
  }
}
