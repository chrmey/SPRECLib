package de.spreclib.api.main;

import de.spreclib.model.centrifugation.enums.FirstCentrifugationDuration;

/**
 * FirstCentrifugationDurationOption.
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FirstCentrifugationDurationOption extends AbstractListOption {

  private final FirstCentrifugationDuration firstCentrifugationDuration;

  FirstCentrifugationDurationOption(FirstCentrifugationDuration firstCentrifugationDuration) {
    this.firstCentrifugationDuration = firstCentrifugationDuration;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.firstCentrifugationDuration.name());
  }

  @Override
  protected FirstCentrifugationDuration getContainedObject() {
    return this.firstCentrifugationDuration;
  }

  protected boolean hasDuration(int durationMinutes) {
    if (this.firstCentrifugationDuration.hasValue(durationMinutes)) {
      return true;
    } else {
      return false;
    }
  }
}
