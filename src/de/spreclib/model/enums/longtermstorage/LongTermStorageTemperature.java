package de.spreclib.model.enums.longtermstorage;

public enum LongTermStorageTemperature {
  MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES(-85, -60),
  LIQUID_NITROGEN,
  LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES(-999, -135),
  PROGRAMMBLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
  MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES(-35, -18),
  LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGRESS(2, 10),
  ;

  LongTermStorageTemperature() {
    // Constructor for LIQUID_NITROGEN which has no Temperature in SPRECv2
  }

  LongTermStorageTemperature(float lowerBound, float upperBound) {
    // TODO Bounds überarbeiten
  }
}
