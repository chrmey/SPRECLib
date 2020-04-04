package de.spreclib.model.sprec;

import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;

public final class FluidSample extends Sample {

  private FluidSampleType fluidSampleType;
  private PrimaryContainer primaryContainer;
  private PreCentrifugation preCentrifugation;
  private Centrifugation firstCentrifugation;
  private Centrifugation secondCentrifugation;
  private PostCentrifugation postCentrifugation;
  private LongTermStorage longTermStorage;

  public FluidSample() {
    super();
  }

  public boolean isFluidSample() {
    return true;
  }

  public boolean isSolidSample() {
    return false;
  }

  public void setFluidSampleType(FluidSampleType fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  public void setPrimaryContainer(PrimaryContainer primaryContainer) {
    this.primaryContainer = primaryContainer;
  }

  public void setPreCentrifugation(PreCentrifugation preCentrifugation) {
    this.preCentrifugation = preCentrifugation;
  }

  public void setFirstCentrifugation(Centrifugation firstCentrifugation) {
    this.firstCentrifugation = firstCentrifugation;
  }

  public void setSecondCentrifugation(Centrifugation secondCentrifugation) {
    this.secondCentrifugation = secondCentrifugation;
  }

  public void setPostCentrifugation(PostCentrifugation postCentrifugation) {
    this.postCentrifugation = postCentrifugation;
  }

  public void setLongTermStorage(LongTermStorage longTermStorage) {
    this.longTermStorage = longTermStorage;
  }

  public FluidSprecCode getSprecCode() {

    return new FluidSprecCode.FluidSprecCodeBuilder()
        .withFluidSampleType(this.fluidSampleType)
        .withPrimaryContainer(this.primaryContainer)
        .withPreCentrifugation(this.preCentrifugation)
        .withFirstCentrifugation(this.firstCentrifugation)
        .withSecondCentrifugation(this.secondCentrifugation)
        .withPostCentrifugation(this.postCentrifugation)
        .withLongTermStorage(this.longTermStorage)
        .build();
  }
}
