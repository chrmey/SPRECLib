package de.spreclib.java.enums.precentrifugation;

public enum PreCentrifugationTemperature {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10),
  THIRTYFIVE_TO_THIRTYEIGHT_DEGREES(35, 38);

  PreCentrifugationTemperature(int lowerBound, int upperBound) {
	// TODO Bounds überarbeiten
  }

}
