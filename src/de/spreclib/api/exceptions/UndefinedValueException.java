package de.spreclib.api.exceptions;

/**
 * Is thrown when a value that is passed to a valueOf() method cannot be found in the SPREC
 * standard.
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public class UndefinedValueException extends Exception {

  private static final long serialVersionUID = 3393747428714252797L;

  private final Object value;
  private final String part;

  public UndefinedValueException(Object value, String part, String message) {
    super(message);
    this.value = value;
    this.part = part;
  }

  public Object getValue() {
    return this.value;
  }

  public String getPart() {
    return this.part;
  }
}
