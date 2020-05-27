package de.spreclib.api.main;

import de.spreclib.model.fluidsampletype.FluidSampleType;

/**
 * FluidSampleTypeOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FluidSampleTypeOption extends AbstractListOption {

  private final FluidSampleType fluidSampleType;

  FluidSampleTypeOption(FluidSampleType fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.fluidSampleType.name());
  }

  @Override
  FluidSampleType getContainedObject() {
    return this.fluidSampleType;
  }

  boolean hasCodeString(String codeString) {
    if (this.fluidSampleType
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
    result = prime * result + ((fluidSampleType == null) ? 0 : fluidSampleType.hashCode());
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
    FluidSampleTypeOption other = (FluidSampleTypeOption) obj;
    if (fluidSampleType != other.fluidSampleType) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FluidSampleTypeOption [fluidSampleType=" + fluidSampleType + "]";
  }
}
