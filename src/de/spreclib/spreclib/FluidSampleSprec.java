package de.spreclib.spreclib;

import de.spreclib.interfaces.IFluidSampleSprec;
import de.spreclib.interfaces.ISprecPart;

public class FluidSampleSprec extends Sprec implements IFluidSampleSprec {

  public FluidSampleSprec() {}

  public boolean isFluidSample() {
    return true;
  }

  public boolean isSolidSample() {
    return false;
  }

  public ISprecPart getFluidSampleType() {
    // TODO implement here
    return null;
  }

  public ISprecPart getPrimaryContainer() {
    // TODO implement here
    return null;
  }

  public ISprecPart getPreCentrifugation() {
    // TODO implement here
    return null;
  }

  public ISprecPart getFirstCentrifugation() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSecondCentrifugation() {
    // TODO implement here
    return null;
  }

  public ISprecPart getPostCentrifugation() {
    // TODO implement here
    return null;
  }

  @Override
  public ISprecPart getLongTermStorage() { // TODO Auto-generated method stub
    return null;
  }
}
