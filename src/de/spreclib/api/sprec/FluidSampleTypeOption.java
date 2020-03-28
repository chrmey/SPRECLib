package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.enums.FluidSampleType;

public final class FluidSampleTypeOption implements IListOption {

  private FluidSampleType fluidSampleType;

  public FluidSampleTypeOption(FluidSampleType fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return this.fluidSampleType.getCodeFromSprecPart().getStringRepresentation();
  }
}
