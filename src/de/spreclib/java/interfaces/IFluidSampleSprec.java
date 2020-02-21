package de.spreclib.java.interfaces;

public interface IFluidSampleSprec {

  public ISprecPart getFluidSampleType();

  public ISprecPart getPrimaryContainer();

  public ISprecPart getPreCentrifugation();

  public ISprecPart getFirstCentrifugation();

  public ISprecPart getSecondCentrifugation();

  public ISprecPart getPostCentrifugation();
}
