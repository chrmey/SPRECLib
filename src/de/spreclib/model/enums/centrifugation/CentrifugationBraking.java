package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListProvideable;

public enum CentrifugationBraking implements IListProvideable {
  NO_BRAKING(false),
  WITH_BRAKING(true);

  private boolean braking;

  private CentrifugationBraking(boolean braking) {
    this.braking = braking;
  }

  public static CentrifugationBraking valueOf(boolean braking) {

    for (CentrifugationBraking brakingEnum : CentrifugationBraking.values()) {
      if (braking == brakingEnum.braking) {
        return brakingEnum;
      }
    }
    return null;
  }

  public boolean hasValue(boolean braking) {

    if (this.braking == braking) {
      return true;
    } else {
      return false;
    }
  }
}
