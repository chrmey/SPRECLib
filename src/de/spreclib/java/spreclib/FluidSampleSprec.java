package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.IFluidSampleSprec;
import de.spreclib.java.interfaces.ISprecPart;

public class FluidSampleSprec extends Sprec implements IFluidSampleSprec {

  public FluidSampleSprec() {}

  public boolean isFluidSample() {
    return true;
  }

  public boolean isSolidSample() {
    return false;
  }

  public ISprecPart getFluidSampleType() {
    return this.sprecParts.get(SprecPartType.FLUID_SAMPLE_TYPE);
  }

  public ISprecPart getPrimaryContainer() {
    return this.sprecParts.get(SprecPartType.PRIMARY_CONTAINER);
  }

  public ISprecPart getPreCentrifugation() {
    return this.sprecParts.get(SprecPartType.PRE_CENTRIFUGATION);
  }

  public ISprecPart getFirstCentrifugation() {
    return this.sprecParts.get(SprecPartType.FIRST_CENTRIFUGATION);
  }

  public ISprecPart getSecondCentrifugation() {
    return this.sprecParts.get(SprecPartType.SECOND_CENTRIFUGATION);
  }

  public ISprecPart getPostCentrifugation() {
    return this.sprecParts.get(SprecPartType.POST_CENTRIFUGATION);
  }

  @Override
  public ISprecPart getLongTermStorage() {
    return this.sprecParts.get(SprecPartType.LONG_TERM_STORAGE);
  }

  @Override
  public String getSprecCode() {
    // TODO Auto-generated method stub
    return null;
  }
}
