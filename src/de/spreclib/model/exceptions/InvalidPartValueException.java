package de.spreclib.model.exceptions;

import de.spreclib.model.interfaces.ISprecPart;

public class InvalidPartValueException extends RuntimeException {

  /** */
  private static final long serialVersionUID = 6629731958053317468L;

  private final ISprecPart sprecPart;

  public InvalidPartValueException(ISprecPart sprecPart, String message) {
    super(message);
    this.sprecPart = sprecPart;
  }

  public ISprecPart getSprecPart() {
    return this.sprecPart;
  }
}
