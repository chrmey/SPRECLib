package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISprec;
import de.spreclib.java.interfaces.ISprecPart;
import java.util.HashMap;
import java.util.Map;

public abstract class Sprec implements ISprec {

  protected Map<SprecPartType, ISprecPart> sprecParts;

  public Sprec() {
    this.sprecParts = new HashMap<>();
  }

  @Override
  public ISprecPart getLongTermStorage() {
    return this.sprecParts.get(SprecPartType.LONG_TERM_STORAGE);
  }
}
