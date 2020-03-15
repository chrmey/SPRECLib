package de.spreclib.model.interfaces;

import de.spreclib.model.enums.SprecPartType;

public interface ISprecPart {

  ICodePart getCodeFromSprecPart();

  SprecPartType getSprecPartType();
}
