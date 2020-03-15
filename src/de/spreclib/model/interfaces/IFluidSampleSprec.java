package de.spreclib.model.interfaces;

public interface IFluidSampleSprec {

  ISprecPart getFluidSampleType();

  ISprecPart getPrimaryContainer();

  ISprecPart getPreCentrifugation();

  ISprecPart getFirstCentrifugation();

  ISprecPart getSecondCentrifugation();

  ISprecPart getPostCentrifugation();
}
