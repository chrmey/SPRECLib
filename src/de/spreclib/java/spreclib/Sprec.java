package de.spreclib.java.spreclib;

import java.util.Map;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprec;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class Sprec implements ISprec {

  private Map<ISprecPart, ICodePart> sprecCodeParts;

  public Sprec() {}
}
