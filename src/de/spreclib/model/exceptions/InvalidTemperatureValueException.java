package de.spreclib.model.exceptions;

public class InvalidTemperatureValueException extends RuntimeException {

  /** */
  private static final long serialVersionUID = -1899885482318406374L;

  private float temperatureValue;

  public InvalidTemperatureValueException(float temperatureValue, String errorMessage) {
    super(errorMessage);
    this.temperatureValue = temperatureValue;
  }

  public float getTemperatureValue() {
    return this.temperatureValue;
  }  
}
