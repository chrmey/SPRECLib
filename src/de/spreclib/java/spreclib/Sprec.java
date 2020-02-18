package de.spreclib.java.spreclib;

import java.util.HashMap;
import java.util.Map;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISprec;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class Sprec implements ISprec {

  protected Map<SprecPartType, ISprecPart> sprecParts;

  public Sprec() {
    this.sprecParts = new HashMap<>();
  }
}
