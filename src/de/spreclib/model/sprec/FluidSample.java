package de.spreclib.model.sprec;

import de.spreclib.api.sprec.FluidSampleSprec;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.exceptions.InvalidPartRelationException;
import de.spreclib.model.exceptions.InvalidPartValueException;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.FirstCentrifugationList;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugationList;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;

public final class FluidSample extends Sample {

  private final FluidSampleType fluidSampleType;
  private final PrimaryContainer primaryContainer;
  private final PreCentrifugation preCentrifugation;
  private final Centrifugation firstCentrifugation;
  private final Centrifugation secondCentrifugation;
  private final PostCentrifugation postCentrifugation;
  private final LongTermStorage longTermStorage;

  private FluidSample(FluidSampleBuild fluidSampleBuilder) {
    this.fluidSampleType = fluidSampleBuilder.fluidSampleType;
    this.primaryContainer = fluidSampleBuilder.primaryContainer;
    this.preCentrifugation = fluidSampleBuilder.preCentrifugation;
    this.firstCentrifugation = fluidSampleBuilder.firstCentrifugation;
    this.secondCentrifugation = fluidSampleBuilder.secondCentrifugation;
    this.postCentrifugation = fluidSampleBuilder.postCentrifugation;
    this.longTermStorage = fluidSampleBuilder.longTermStorage;

    this.validateParts();
    this.validateParameterRelations();
  }

  private void validateParts() {

    if (this.fluidSampleType != null && !FluidSampleType.contains(this.fluidSampleType)) {
      throw new InvalidPartValueException(
          this.fluidSampleType, "Value for FluidSampleType is not in SPREC standard.");
    }

    if (this.primaryContainer != null && !PrimaryContainer.contains(this.primaryContainer)) {
      throw new InvalidPartValueException(
          this.primaryContainer, "Value for PrimaryContainer is not in SPREC standard.");
    }

    if (this.preCentrifugation != null
        && !PreCentrifugationList.PRE_CENTRIFUGATIONS.contains(this.preCentrifugation)) {
      throw new InvalidPartValueException(
          this.preCentrifugation, "Value for PreCentrifugation is not in SPREC standard.");
    }

    if (this.firstCentrifugation != null
        && !FirstCentrifugationList.CENTRIFUGATIONS.contains(this.firstCentrifugation)) {
      throw new InvalidPartValueException(
          this.firstCentrifugation, "Value for FirstCentrifugation is not in SPREC standard.");
    }

    if (this.secondCentrifugation != null
        && !SecondCentrifugationList.CENTRIFUGATIONS.contains(this.secondCentrifugation)) {
      throw new InvalidPartValueException(
          this.secondCentrifugation, "Value for SecondCentrifugation is not in SPREC standard.");
    }

    if (this.postCentrifugation != null
        && !PostCentrifugationList.POST_CENTRIFUGATIONS.contains(this.postCentrifugation)) {
      throw new InvalidPartValueException(
          this.postCentrifugation, "Value for PostCentrifugation is not in SPREC standard.");
    }

    if (this.longTermStorage != null
        && !LongTermStorageList.LONG_TERM_STORAGES.contains(this.longTermStorage)) {
      throw new InvalidPartValueException(
          this.longTermStorage, "Value for LongTermStorage is not in SPREC standard.");
    }
  }

  private void validateParameterRelations() {

    if (this.firstCentrifugation != null && this.secondCentrifugation != null) {

      if (this.firstCentrifugation.getCentrifugationType() == CentrifugationType.NO
          && this.secondCentrifugation.getCentrifugationType() != CentrifugationType.NO) {

        throw new InvalidPartRelationException(
            "Cannot set SecondCentrifugation to other than NO when there is no FirstCentrifugation");
      }

      if (this.firstCentrifugation.getCentrifugationType() == CentrifugationType.NO
          && this.secondCentrifugation.getCentrifugationType() == CentrifugationType.NO
          && this.postCentrifugation != null) {

        if (this.postCentrifugation.getPostCentrifugationType()
            != PostCentrifugationType.NOT_APPLICABLE) {

          throw new InvalidPartRelationException(
              "Cannot set PostCentrifugationType to other than NOT_APPLICABLE when there is no Centrifugation");
        }
      }
    }
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

  public static final class FluidSampleBuild {

    private final FluidSampleType fluidSampleType;
    private final PrimaryContainer primaryContainer;
    private final PreCentrifugation preCentrifugation;
    private final Centrifugation firstCentrifugation;
    private final Centrifugation secondCentrifugation;
    private final PostCentrifugation postCentrifugation;
    private final LongTermStorage longTermStorage;

    public FluidSampleBuild(FluidSampleSprec fluidSampleBuilder) {

      if (fluidSampleBuilder == null) {
        throw new IllegalArgumentException("FluidSampleBuilder cannot be null");
      }

      this.fluidSampleType = fluidSampleBuilder.getFluidSampleType();
      this.primaryContainer = fluidSampleBuilder.getPrimaryContainer();
      this.preCentrifugation = fluidSampleBuilder.getPreCentrifugation();
      this.firstCentrifugation = fluidSampleBuilder.getFirstCentrifugation();
      this.secondCentrifugation = fluidSampleBuilder.getSecondCentrifugation();
      this.postCentrifugation = fluidSampleBuilder.getPostCentrifugation();
      this.longTermStorage = fluidSampleBuilder.getLongTermStorage();
    }

    public FluidSample build() {
      return new FluidSample(this);
    }
  }
}
