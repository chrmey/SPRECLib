package de.spreclib.model.spreclib;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.interfaces.ISprec;
import de.spreclib.model.interfaces.ISprecPart;
import java.util.HashMap;
import java.util.Map;

public abstract class Sprec implements ISprec {

  public Map<SprecPartType, ISprecPart> sprecParts;

  public Sprec() {
    this.sprecParts = new HashMap<>();
  }

  @Override
  public ISprecPart getLongTermStorage() {
    return this.sprecParts.get(SprecPartType.LONG_TERM_STORAGE);
  }
}
