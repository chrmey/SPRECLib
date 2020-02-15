package de.spreclib.spreclib;

import java.util.Map;

import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprec;
import de.spreclib.interfaces.ISprecPart;

public abstract class Sprec implements ISprec {

  private Map<ISprecPart, ICodePart> sprecCodeParts;

  public Sprec() {}
}
