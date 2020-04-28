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
  protected FluidSampleType getContainedObject() {
    return this.fluidSampleType;
  }
}
