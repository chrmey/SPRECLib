package de.spreclib.model.exceptions;

public class InvalidSpeedValueException extends RuntimeException {

  /** */
  private static final long serialVersionUID = 6666419949291249334L;

  private int speedValue;

  public InvalidSpeedValueException(int speedValue, String errorMessage) {
    super(errorMessage);
    this.speedValue = speedValue;
  }

  public float getSpeedValue() {
    return this.speedValue;
  }
}
