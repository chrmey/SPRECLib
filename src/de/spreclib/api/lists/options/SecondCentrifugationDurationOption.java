package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;


public final class SecondCentrifugationDurationOption extends AbstractListOption {
  private final SecondCentrifugationDuration secondCentrifugationDurationOption;

  public SecondCentrifugationDurationOption(
      SecondCentrifugationDuration secondCentrifugationDurationOption) {
    this.secondCentrifugationDurationOption = secondCentrifugationDurationOption;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationDurationOption.name());
  }

  @Override
  public SecondCentrifugationDuration getContainedObject() {
    return this.secondCentrifugationDurationOption;
  }
}
