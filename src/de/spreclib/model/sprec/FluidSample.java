package de.spreclib.model.sprec;

import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.interfaces.ICodePart;
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

  public FluidSprecCode buildSprecCode() {

    ICodePart fluidSampleTypeCode = null;
    ICodePart primaryContainerCode = null;
    ICodePart preCentrifugationCode = null;
    ICodePart firstCentrifugationCode = null;
    ICodePart secondCentrifugationCode = null;
    ICodePart postCentrifugationCode = null;
    ICodePart longTermStorageCode = null;

    if (this.fluidSampleType != null) {
      fluidSampleTypeCode = this.fluidSampleType.getCodeFromSprecPart();
    }
    if (this.primaryContainer != null) {
      primaryContainerCode = this.primaryContainer.getCodeFromSprecPart();
    }
    if (this.preCentrifugation != null) {
      preCentrifugationCode = this.preCentrifugation.getCodeFromSprecPart();
    }
    if (this.firstCentrifugation != null) {
      firstCentrifugationCode = this.firstCentrifugation.getCodeFromSprecPart();
    }
    if (this.secondCentrifugation != null) {
      secondCentrifugationCode = this.secondCentrifugation.getCodeFromSprecPart();
    }
    if (this.postCentrifugation != null) {
      postCentrifugationCode = this.postCentrifugation.getCodeFromSprecPart();
    }
    if (this.longTermStorage != null) {
      longTermStorageCode = this.longTermStorage.getCodeFromSprecPart();
    }
    return new FluidSprecCode(
        fluidSampleTypeCode,
        primaryContainerCode,
        preCentrifugationCode,
        firstCentrifugationCode,
        secondCentrifugationCode,
        postCentrifugationCode,
        longTermStorageCode);
  }
}
