package de.spreclib.api.lists.fluidsampletype;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.enums.FluidSampleType;

public final class FluidSampleTypeOption implements IListOption {

  private FluidSampleType fluidSampleType;

  protected FluidSampleTypeOption(FluidSampleType fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return null;
  }
}
