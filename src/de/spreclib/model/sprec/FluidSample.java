package de.spreclib.model.sprec;

import de.spreclib.api.sprec.FluidSampleBuilder;
import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.FirstCentrifugationList;
import de.spreclib.model.centrifugation.SecondCentrifugationList;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.exceptions.InvalidPartValueException;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import de.spreclib.model.postcentrifugation.PostCentrifugation;
import de.spreclib.model.postcentrifugation.PostCentrifugationList;
import de.spreclib.model.precentrifugation.PreCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugationList;
import de.spreclib.model.sprec.interfaces.ISample;

public final class FluidSample implements ISample {

  private final FluidSampleType fluidSampleType;
  private final PrimaryContainer primaryContainer;
  private final PreCentrifugation preCentrifugation;
  private final Centrifugation firstCentrifugation;
  private final Centrifugation secondCentrifugation;
  private final PostCentrifugation postCentrifugation;
  private final LongTermStorage longTermStorage;
  private final FluidSprecCode fluidSprecCode;

  public FluidSample(FluidSampleBuilder fluidSampleBuilder) {

    if (fluidSampleBuilder == null) {
      throw new IllegalArgumentException("FluidSampleBuilde cannot be null.");
    }

    this.fluidSampleType = fluidSampleBuilder.getFluidSampleType();
    this.primaryContainer = fluidSampleBuilder.getPrimaryContainer();
    this.preCentrifugation = fluidSampleBuilder.getPreCentrifugation();
    this.firstCentrifugation = fluidSampleBuilder.getFirstCentrifugation();
    this.secondCentrifugation = fluidSampleBuilder.getSecondCentrifugation();
    this.postCentrifugation = fluidSampleBuilder.getPostCentrifugation();
    this.longTermStorage = fluidSampleBuilder.getLongTermStorage();

    this.validateParts();

    this.fluidSprecCode =
        new FluidSprecCode.FluidSprecCodeBuilder()
            .withFluidSampleType(this.fluidSampleType)
            .withPrimaryContainer(this.primaryContainer)
            .withPreCentrifugation(this.preCentrifugation)
            .withFirstCentrifugation(this.firstCentrifugation)
            .withSecondCentrifugation(this.secondCentrifugation)
            .withPostCentrifugation(this.postCentrifugation)
            .withLongTermStorage(this.longTermStorage)
            .build();
  }

  /**
   * Validates if passed parts are in the sprec standard. Throws InvalidPartValueException if part
   * is not in SPREC to prevent "selfmade" part values.
   *
   * @throws InvalidPartValueException if a passed part is not in SPREC.
   */
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

  @Override
  public FluidSprecCode getSprecCode() {
    return this.fluidSprecCode;
  }
}
