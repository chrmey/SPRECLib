package de.spreclib.model.exceptions;

public final class InvalidPartRelationException extends RuntimeException {

  /** */
  private static final long serialVersionUID = -6799632359511504184L;

  public InvalidPartRelationException(String errorMessage) {
    super(errorMessage);
  }
}
