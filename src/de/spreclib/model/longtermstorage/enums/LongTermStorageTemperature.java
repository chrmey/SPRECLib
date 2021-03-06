package de.spreclib.model.longtermstorage.enums;

import de.spreclib.model.interfaces.IListProvideable;

public enum LongTermStorageTemperature implements IListProvideable {
  MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES(-85, -60),
  LIQUID_NITROGEN,
  LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES(-273, -135),
  PROGRAMMABLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
  MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES(-35, -18),
  LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10),
  ;

  private final Float lowerBoundCelsius;
  private final Float upperBoundCelsius;

  private LongTermStorageTemperature() {
    // Constructor for LIQUID_NITROGEN which has no Temperature in SPRECv2
    this.lowerBoundCelsius = null;
    this.upperBoundCelsius = null;
  }

  LongTermStorageTemperature(float lowerBound, float upperBound) {
    this.lowerBoundCelsius = lowerBound;
    this.upperBoundCelsius = upperBound;
  }

  // TODO handle values for LN

  public boolean hasValue(float temperatureCelsius) {

    if (this.lowerBoundCelsius == null || this.upperBoundCelsius == null) {
      return false;
    }

    // lowerBoundCelsius - 1 because of negative values
    if (temperatureCelsius > this.lowerBoundCelsius - 1
        && temperatureCelsius < this.upperBoundCelsius + 1) {
      return true;
    } else {
      return false;
    }
  }
}
