package de.spreclib.model.exceptions;

public class InvalidTimeValueException extends RuntimeException {

  /** */
  private static final long serialVersionUID = 1071636442591131230L;

  private int timeValueMinutes;

  public InvalidTimeValueException(int timeValueMinutes, String errorMessage) {
    super(errorMessage);
    this.timeValueMinutes = timeValueMinutes;
  }

  public float getTimeValue() {
    return this.timeValueMinutes;
  }
}
