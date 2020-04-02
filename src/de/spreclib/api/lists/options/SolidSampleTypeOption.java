package de.spreclib.api.lists.options;

import de.spreclib.model.enums.SolidSampleType;

public final class SolidSampleTypeOption extends AbstractListOption {

  private final SolidSampleType solidSampleType;

  public SolidSampleTypeOption(SolidSampleType solidSampleType) {
    this.solidSampleType = solidSampleType;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.solidSampleType.name());
  }

  @Override
  public SolidSampleType getContainedObject() {
    return this.solidSampleType;
  }
}
