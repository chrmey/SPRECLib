package de.spreclib.java.spreclib;

import de.spreclib.java.enums.FluidSampleType;
import de.spreclib.java.enums.PrimaryContainer;
import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.IFluidSampleSprec;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.centrifugation.FirstCentrifugation;
import de.spreclib.java.spreclib.centrifugation.SecondCentrifugation;
import de.spreclib.java.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.java.spreclib.precentrifugation.PreCentrifugation;

public class FluidSampleSprec extends Sprec implements IFluidSampleSprec {

  private FluidSampleType fluidSampleType;
  private PrimaryContainer primaryContainer;
  private PreCentrifugation preCentrifugation;
  private FirstCentrifugation firstCentrifugation;
  private SecondCentrifugation secondCentrifugation;
  private PostCentrifugation postCentrifugation;

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
}
