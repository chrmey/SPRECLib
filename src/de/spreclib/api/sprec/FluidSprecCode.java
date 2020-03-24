package de.spreclib.api.sprec;

import de.spreclib.api.sprec.interfaces.ISprecCode;
import de.spreclib.model.interfaces.ICodePart;

public class FluidSprecCode implements ISprecCode {

  private ICodePart fluidSampleType;
  private ICodePart primaryContainer;
  private ICodePart preCentrifugation;
  private ICodePart firstCentrifugation;
  private ICodePart secondCentrifugation;
  private ICodePart postCentrifugation;
  private ICodePart longTermStorage;

  protected ICodePart getFluidSampleType() {
    return fluidSampleType;
  }

  protected void setFluidSampleType(ICodePart fluidSampleType) {
    this.fluidSampleType = fluidSampleType;
  }

  protected ICodePart getPrimaryContainer() {
    return primaryContainer;
  }

  protected void setPrimaryContainer(ICodePart primaryContainer) {
    this.primaryContainer = primaryContainer;
  }

  protected ICodePart getPreCentrifugation() {
    return preCentrifugation;
  }

  protected void setPreCentrifugation(ICodePart preCentrifugation) {
    this.preCentrifugation = preCentrifugation;
  }

  protected ICodePart getFirstCentrifugation() {
    return firstCentrifugation;
  }

  protected void setFirstCentrifugation(ICodePart firstCentrifugation) {
    this.firstCentrifugation = firstCentrifugation;
  }

  protected ICodePart getSecondCentrifugation() {
    return secondCentrifugation;
  }

  protected void setSecondCentrifugation(ICodePart secondCentrifugation) {
    this.secondCentrifugation = secondCentrifugation;
  }

  protected ICodePart getPostCentrifugation() {
    return postCentrifugation;
  }

  protected void setPostCentrifugation(ICodePart postCentrifugation) {
    this.postCentrifugation = postCentrifugation;
  }

  protected ICodePart getLongTermStorage() {
    return longTermStorage;
  }

  protected void setLongTermStorage(ICodePart longTermStorage) {
    this.longTermStorage = longTermStorage;
  }

  @Override
  public ISprecCode getStringRepresentation() {
    // TODO Implement
    return null;
  }
}
