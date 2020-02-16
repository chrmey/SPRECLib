package de.spreclib.java.enums;

public enum PreCentrifugationTemperature {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10),
  THIRTYFIVE_TO_THIRYEIGHT_DEGREES(35, 38);

  private int lower;
  private int upper;

  PreCentrifugationTemperature(int lowerBound, int upperBound) {
    this.lower = lowerBound;
    this.upper = upperBound;
  }

  public static PreCentrifugationTemperature getPreCentrifugationTemperature(int temperature) {
    for (PreCentrifugationTemperature pct : PreCentrifugationTemperature.values()) {
      if (temperature >= pct.lower && temperature < pct.upper) {
        return pct;
      }
    }
    return null;
  }
}
