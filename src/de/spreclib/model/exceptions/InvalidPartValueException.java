package de.spreclib.model.exceptions;

import de.spreclib.model.interfaces.ISprecFactor;

public class InvalidPartValueException extends RuntimeException {

  /** */
  private static final long serialVersionUID = 6629731958053317468L;

  private final ISprecFactor sprecPart;

  public InvalidPartValueException(ISprecFactor sprecPart, String message) {
    super(message);
    this.sprecPart = sprecPart;
  }

  public ISprecFactor getSprecPart() {
    return this.sprecPart;
  }
}
