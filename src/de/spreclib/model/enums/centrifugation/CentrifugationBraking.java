package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListProvideable;

public enum CentrifugationBraking implements IListProvideable {
  NO_BRAKING(false),
  WITH_BRAKING(true);

  private final boolean braking;

  private CentrifugationBraking(boolean braking) {
    this.braking = braking;
  }

  public boolean hasValue(boolean braking) {

    if (this.braking == braking) {
      return true;
    } else {
      return false;
    }
  }
}
