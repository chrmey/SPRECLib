package de.spreclib.java.interfaces;

public interface IFluidSampleSprec {

  ISprecPart getFluidSampleType();

  ISprecPart getPrimaryContainer();

  ISprecPart getPreCentrifugation();

  ISprecPart getFirstCentrifugation();

  ISprecPart getSecondCentrifugation();

  ISprecPart getPostCentrifugation();
}
