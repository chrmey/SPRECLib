package de.spreclib.api.main;

import de.spreclib.model.solidsampletype.SolidSampleType;

/**
 * SolidSampleTypeOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SolidSampleTypeOption extends AbstractListOption {

  private final SolidSampleType solidSampleType;

  SolidSampleTypeOption(SolidSampleType solidSampleType) {
    this.solidSampleType = solidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.solidSampleType.name());
  }

  @Override
  SolidSampleType getContainedObject() {
    return this.solidSampleType;
  }

  boolean hasCodeString(String codeString) {
    if (this.solidSampleType
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
    result = prime * result + ((solidSampleType == null) ? 0 : solidSampleType.hashCode());
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
    SolidSampleTypeOption other = (SolidSampleTypeOption) obj;
    if (solidSampleType != other.solidSampleType) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "SolidSampleTypeOption [solidSampleType=" + solidSampleType + "]";
  }
}
