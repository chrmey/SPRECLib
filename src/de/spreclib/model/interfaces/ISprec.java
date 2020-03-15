package de.spreclib.model.interfaces;

public interface ISprec {

  boolean isFluidSample();

  boolean isSolidSample();

  ISprecPart getLongTermStorage();

  String getSprecCode();
}
