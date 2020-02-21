package de.spreclib.java.interfaces;

import de.spreclib.java.spreclib.Sprec;

public interface ISprec {

  boolean isFluidSample();

  boolean isSolidSample();

  ISprecPart getLongTermStorage();

  String toString();
  
  Sprec getSprec();
}
