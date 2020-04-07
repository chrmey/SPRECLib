package de.spreclib.model.exceptions;

public final class InvalidParameterRelationException extends RuntimeException {

  /** */
  private static final long serialVersionUID = -6799632359511504184L;

  public InvalidParameterRelationException(String errorMessage) {
    super(errorMessage);
  }
}
