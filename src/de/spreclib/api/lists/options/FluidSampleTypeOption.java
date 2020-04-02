package de.spreclib.api.lists.options;

import de.spreclib.model.enums.FluidSampleType;

public final class FluidSampleTypeOption extends AbstractListOption {

  private final FluidSampleType fluidSampleType;

  public FluidSampleTypeOption(FluidSampleType fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.fluidSampleType.name());
  }

  @Override
  public FluidSampleType getContainedObject() {
    return this.fluidSampleType;
  }
}
