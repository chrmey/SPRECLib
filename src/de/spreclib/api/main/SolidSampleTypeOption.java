package de.spreclib.api.main;

import de.spreclib.model.enums.SolidSampleType;

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
  protected SolidSampleType getContainedObject() {
    return this.solidSampleType;
  }
}
