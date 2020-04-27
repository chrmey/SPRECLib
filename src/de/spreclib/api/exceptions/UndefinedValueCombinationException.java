package de.spreclib.api.exceptions;

public class UndefinedValueCombinationException extends Exception {

  /**
   * Exception that is thrown when the combination of values is no valid combination for a SPREC
   * part.
   *
   * <p>Example:
   *
   * <p>If a PreCentrifugationDuration and a PreCentrifugationDelay are combined and that
   * combination is not in the SPREC standard, this exception is thrown.
   *
   * @author Christopher Meyer
   */
  private static final long serialVersionUID = 1938663728233464641L;

  public UndefinedValueCombinationException(String errorMessage) {
    super(errorMessage);
  }
}
