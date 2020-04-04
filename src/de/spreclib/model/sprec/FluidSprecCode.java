package de.spreclib.model.sprec;

import de.spreclib.model.interfaces.ICodePart;

public final class FluidSprecCode {

  private final ICodePart fluidSampleTypeCode;
  private final ICodePart primaryContainerCode;
  private final ICodePart preCentrifugationCode;
  private final ICodePart firstCentrifugationCode;
  private final ICodePart secondCentrifugationCode;
  private final ICodePart postCentrifugationCode;
  private final ICodePart longTermStorageCode;

  protected FluidSprecCode(
      ICodePart fluidSampleTypeCode,
      ICodePart primaryContainerCode,
      ICodePart preCentrifugationCode,
      ICodePart firstCentrifugationCode,
      ICodePart secondCentrifugationCode,
      ICodePart postCentrifugationCode,
      ICodePart longTermStorageCode) {
    this.fluidSampleTypeCode = fluidSampleTypeCode;
    this.primaryContainerCode = primaryContainerCode;
    this.preCentrifugationCode = preCentrifugationCode;
    this.firstCentrifugationCode = firstCentrifugationCode;
    this.secondCentrifugationCode = secondCentrifugationCode;
    this.postCentrifugationCode = postCentrifugationCode;
    this.longTermStorageCode = longTermStorageCode;
  }

  public ICodePart getFluidSampleTypeCode() {
    return fluidSampleTypeCode;
  }

  public ICodePart getPrimaryContainerCode() {
    return primaryContainerCode;
  }

  public ICodePart getPreCentrifugationCode() {
    return preCentrifugationCode;
  }

  public ICodePart getFirstCentrifugationCode() {
    return firstCentrifugationCode;
  }

  public ICodePart getSecondCentrifugationCode() {
    return secondCentrifugationCode;
  }

  public ICodePart getPostCentrifugationCode() {
    return postCentrifugationCode;
  }

  public ICodePart getLongTermStorageCode() {
    return longTermStorageCode;
  }
}
