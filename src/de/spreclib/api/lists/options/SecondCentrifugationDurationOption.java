package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;


public final class SecondCentrifugationDurationOption extends AbstractListOption {
  private final SecondCentrifugationDuration secondCentrifugationDuration;

  public SecondCentrifugationDurationOption(
      SecondCentrifugationDuration secondCentrifugationDurationOption) {
    this.secondCentrifugationDuration = secondCentrifugationDurationOption;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.secondCentrifugationDuration.name());
  }

  @Override
  public SecondCentrifugationDuration getContainedObject() {
    return this.secondCentrifugationDuration;
  }

  public boolean hasDuration(int durationMinutes) {
    if (this.secondCentrifugationDuration.hasValueFor(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
