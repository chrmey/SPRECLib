package de.spreclib.model.exceptions;

public class InvalidParameterCombinationException extends RuntimeException {

  /** */
  private static final long serialVersionUID = 1938663728233464641L;
  
  public InvalidParameterCombinationException(String errorMessage) {
    super(errorMessage);
  }
}
