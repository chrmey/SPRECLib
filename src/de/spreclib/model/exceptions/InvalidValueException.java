package de.spreclib.model.exceptions;

public class InvalidValueException extends RuntimeException {

  /** */
  private static final long serialVersionUID = -1899885482318406374L;

  public InvalidValueException(String errorMessage) {
    super(errorMessage);
  }
}
