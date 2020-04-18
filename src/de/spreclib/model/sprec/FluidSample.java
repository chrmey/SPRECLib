package de.spreclib.model.sprec;

import de.spreclib.api.sprec.FluidSampleSprec;
import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.FirstCentrifugationList;
import de.spreclib.model.centrifugation.SecondCentrifugationList;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.exceptions.InvalidPartRelationException;
import de.spreclib.model.exceptions.InvalidPartValueException;
import de.spreclib.model.interfaces.ISample;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import de.spreclib.model.postcentrifugation.PostCentrifugation;
import de.spreclib.model.postcentrifugation.PostCentrifugationList;
import de.spreclib.model.precentrifugation.PreCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugationList;

public final class FluidSample implements ISample {

  private final FluidSampleType fluidSampleType;
  private final PrimaryContainer primaryContainer;
  private final PreCentrifugation preCentrifugation;
  private final Centrifugation firstCentrifugation;
  private final Centrifugation secondCentrifugation;
  private final PostCentrifugation postCentrifugation;
  private final LongTermStorage longTermStorage;

  private FluidSample(FluidSampleBuilder fluidSampleBuilder) {
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
          this.fluidSampleType, "Selected FluidSampleType cannot be found in SPREC.");
    }

    if (this.primaryContainer != null && !PrimaryContainer.contains(this.primaryContainer)) {
      throw new InvalidPartValueException(
          this.primaryContainer, "Selected PrimaryContainer cannot be found in SPREC.");
    }

    if (this.preCentrifugation != null
        && !PreCentrifugationList.PRE_CENTRIFUGATIONS.contains(this.preCentrifugation)) {
      throw new InvalidPartValueException(
          this.preCentrifugation, "Selected PreCentrifugation cannot be found in SPREC.");
    }

    if (this.firstCentrifugation != null
        && !FirstCentrifugationList.CENTRIFUGATIONS.contains(this.firstCentrifugation)) {
      throw new InvalidPartValueException(
          this.firstCentrifugation, "Selected FirstCentrifugation cannot be found in SPREC.");
    }

    if (this.secondCentrifugation != null
        && !SecondCentrifugationList.CENTRIFUGATIONS.contains(this.secondCentrifugation)) {
      throw new InvalidPartValueException(
          this.secondCentrifugation, "Selected SecondCentrifugation cannot be found in SPREC.");
    }

    if (this.postCentrifugation != null
        && !PostCentrifugationList.POST_CENTRIFUGATIONS.contains(this.postCentrifugation)) {
      throw new InvalidPartValueException(
          this.postCentrifugation, "Selected PostCentrifugations cannot be found in SPREC.");
    }

    if (this.longTermStorage != null
        && !LongTermStorageList.LONG_TERM_STORAGES.contains(this.longTermStorage)) {
      throw new InvalidPartValueException(
          this.longTermStorage, "Selected LongTermStorage cannot be found in SPREC.");
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

  @Override
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

  public static final class FluidSampleBuilder {

    private final FluidSampleType fluidSampleType;
    private final PrimaryContainer primaryContainer;
    private final PreCentrifugation preCentrifugation;
    private final Centrifugation firstCentrifugation;
    private final Centrifugation secondCentrifugation;
    private final PostCentrifugation postCentrifugation;
    private final LongTermStorage longTermStorage;

    public FluidSampleBuilder(FluidSampleSprec fluidSampleSprec) {

      if (fluidSampleSprec == null) {
        throw new IllegalArgumentException("FluidSampleSprec cannot be null");
      }

      this.fluidSampleType = fluidSampleSprec.getFluidSampleType();
      this.primaryContainer = fluidSampleSprec.getPrimaryContainer();
      this.preCentrifugation = fluidSampleSprec.getPreCentrifugation();
      this.firstCentrifugation = fluidSampleSprec.getFirstCentrifugation();
      this.secondCentrifugation = fluidSampleSprec.getSecondCentrifugation();
      this.postCentrifugation = fluidSampleSprec.getPostCentrifugation();
      this.longTermStorage = fluidSampleSprec.getLongTermStorage();
    }

    public FluidSample build() {
      return new FluidSample(this);
    }
  }
}
