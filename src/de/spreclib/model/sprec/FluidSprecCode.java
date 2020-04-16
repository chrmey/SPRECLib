package de.spreclib.model.sprec;

import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.postcentrifugation.PostCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugation;

public final class FluidSprecCode extends AbstractSprecCode {

  private final ICodePart fluidSampleTypeCode;
  private final ICodePart primaryContainerCode;
  private final ICodePart preCentrifugationCode;
  private final ICodePart firstCentrifugationCode;
  private final ICodePart secondCentrifugationCode;
  private final ICodePart postCentrifugationCode;
  private final ICodePart longTermStorageCode;

  private FluidSprecCode(FluidSprecCodeBuilder fluidSprecCodeBuilder) {
    super();
    this.fluidSampleTypeCode = fluidSprecCodeBuilder.fluidSampleTypeCode;
    this.primaryContainerCode = fluidSprecCodeBuilder.primaryContainerCode;
    this.preCentrifugationCode = fluidSprecCodeBuilder.preCentrifugationCode;
    this.firstCentrifugationCode = fluidSprecCodeBuilder.firstCentrifugationCode;
    this.secondCentrifugationCode = fluidSprecCodeBuilder.secondCentrifugationCode;
    this.postCentrifugationCode = fluidSprecCodeBuilder.postCentrifugationCode;
    this.longTermStorageCode = fluidSprecCodeBuilder.longTermStorageCode;
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
    code.append(
            this.fluidSampleTypeCode != null
                ? this.fluidSampleTypeCode.getStringRepresentation()
                : this.placeholderThreeCharacters)
        .append(
            this.primaryContainerCode != null
                ? this.primaryContainerCode.getStringRepresentation()
                : this.placeholderThreeCharacters)
        .append(
            this.preCentrifugationCode != null
                ? this.preCentrifugationCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.firstCentrifugationCode != null
                ? this.firstCentrifugationCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.secondCentrifugationCode != null
                ? this.secondCentrifugationCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.postCentrifugationCode != null
                ? this.postCentrifugationCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.longTermStorageCode != null
                ? this.longTermStorageCode.getStringRepresentation()
                : this.placeholderOneCharacter);

    return code.toString();
  }

  public static final class FluidSprecCodeBuilder {

    private ICodePart fluidSampleTypeCode;
    private ICodePart primaryContainerCode;
    private ICodePart preCentrifugationCode;
    private ICodePart firstCentrifugationCode;
    private ICodePart secondCentrifugationCode;
    private ICodePart postCentrifugationCode;
    private ICodePart longTermStorageCode;

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
