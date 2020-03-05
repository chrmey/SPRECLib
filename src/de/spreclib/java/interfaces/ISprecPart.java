package de.spreclib.java.interfaces;

import de.spreclib.java.enums.SprecPartType;

public interface ISprecPart {

  public ICodePart getCodeFromSprecPart();

  public SprecPartType getSprecPartType();
}
