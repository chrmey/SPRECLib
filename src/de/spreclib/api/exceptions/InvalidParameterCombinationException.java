package de.spreclib.api.exceptions;

public class InvalidParameterCombinationException extends RuntimeException {

  /**
   * Exception that is thrown when the combination of parameters is no valid combination for a SPREC
   * part.
   *
   * @author Christopher Meyer
   */
  private static final long serialVersionUID = 1938663728233464641L;

  public InvalidParameterCombinationException(String errorMessage) {
    super(errorMessage);
  }
}
