package de.spreclib.model.sprec;

import de.spreclib.api.sprec.interfaces.ISprecCode;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;


public final class FluidSprecCode implements ISprecCode {

  // SprecCode kann nur über den Builder erzeugt werden, da private Constructor.
  // Wird nach Validierung von FluidSample erzeugt

  private final ICodePart fluidSampleTypeCode;
  private final ICodePart primaryContainerCode;
  private final ICodePart preCentrifugationCode;
  private final ICodePart firstCentrifugationCode;
  private final ICodePart secondCentrifugationCode;
  private final ICodePart postCentrifugationCode;
  private final ICodePart longTermStorageCode;

  private FluidSprecCode(FluidSprecCodeBuilder builder) {
    this.fluidSampleTypeCode = builder.fluidSampleTypeCode;
    this.primaryContainerCode = builder.primaryContainerCode;
    this.preCentrifugationCode = builder.preCentrifugationCode;
    this.firstCentrifugationCode = builder.firstCentrifugationCode;
    this.secondCentrifugationCode = builder.secondCentrifugationCode;
    this.postCentrifugationCode = builder.postCentrifugationCode;
    this.longTermStorageCode = builder.longTermStorageCode;
  }

  public ICodePart getFluidSampleTypeCode() {
    return this.fluidSampleTypeCode;
  }

  public ICodePart getPrimaryContainerCode() {
    return this.primaryContainerCode;
  }

  public ICodePart getPreCentrifugationCode() {
    return this.preCentrifugationCode;
  }

  public ICodePart getFirstCentrifugationCode() {
    return this.firstCentrifugationCode;
  }

  public ICodePart getSecondCentrifugationCode() {
    return this.secondCentrifugationCode;
  }

  public ICodePart getPostCentrifugationCode() {
    return this.postCentrifugationCode;
  }

  public ICodePart getLongTermStorageCode() {
    return this.longTermStorageCode;
  }

  @Override
  public String getCodeString() {
    StringBuilder code = new StringBuilder();
    code.append(this.fluidSampleTypeCode.getStringRepresentation())
        .append(this.primaryContainerCode.getStringRepresentation())
        .append(this.preCentrifugationCode.getStringRepresentation())
        .append(this.firstCentrifugationCode.getStringRepresentation())
        .append(this.secondCentrifugationCode.getStringRepresentation())
        .append(this.postCentrifugationCode.getStringRepresentation())
        .append(this.longTermStorageCode.getStringRepresentation());

    return code.toString();
  }

  public static final class FluidSprecCodeBuilder {

    private ICodePart fluidSampleTypeCode = null;
    private ICodePart primaryContainerCode = null;
    private ICodePart preCentrifugationCode = null;
    private ICodePart firstCentrifugationCode = null;
    private ICodePart secondCentrifugationCode = null;
    private ICodePart postCentrifugationCode = null;
    private ICodePart longTermStorageCode = null;

    public FluidSprecCodeBuilder withFluidSampleType(FluidSampleType fluidSampleType) {
      if (fluidSampleType != null) {
        this.fluidSampleTypeCode = fluidSampleType.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCodeBuilder withPrimaryContainer(PrimaryContainer primaryContainer) {
      if (primaryContainer != null) {
        this.primaryContainerCode = primaryContainer.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCodeBuilder withPreCentrifugation(PreCentrifugation preCentrifugation) {
      if (preCentrifugation != null) {
        this.preCentrifugationCode = preCentrifugation.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCodeBuilder withFirstCentrifugation(Centrifugation firstCentrifugation) {
      if (firstCentrifugation != null) {
        this.firstCentrifugationCode = firstCentrifugation.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCodeBuilder withSecondCentrifugation(Centrifugation secondCentrifugation) {
      if (secondCentrifugation != null) {
        this.secondCentrifugationCode = secondCentrifugation.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCodeBuilder withPostCentrifugation(PostCentrifugation postCentrifugation) {
      if (postCentrifugation != null) {
        this.postCentrifugationCode = postCentrifugation.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCodeBuilder withLongTermStorage(LongTermStorage longTermStorage) {
      if (longTermStorage != null) {
        this.longTermStorageCode = longTermStorage.getCodeFromSprecPart();
      }
      return this;
    }

    public FluidSprecCode build() {
      return new FluidSprecCode(this);
    }
  }
}
