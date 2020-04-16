package de.spreclib.api.lists;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;

/**
 * SecondCentrifugationDurationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SecondCentrifugationDurationOption extends AbstractListOption {
  private final SecondCentrifugationDuration secondCentrifugationDuration;

  SecondCentrifugationDurationOption(
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

  protected boolean hasDuration(int durationMinutes) {
    if (this.secondCentrifugationDuration.hasValueFor(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
