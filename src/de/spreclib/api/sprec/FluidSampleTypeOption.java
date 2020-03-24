package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.interfaces.ICodePart;

public final class FluidSampleTypeOption implements IListOption {

  private FluidSampleType fluidSampleType;

  public FluidSampleTypeOption(FluidSampleType fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return null;
  }

  protected ICodePart getCodePartFromOption() {
    return this.fluidSampleType.getCodeFromSprecPart();
  }
}
