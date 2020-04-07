package de.spreclib.api.sprec;

import de.spreclib.api.lists.options.FirstCentrifugationOption;
import de.spreclib.api.lists.options.FluidSampleTypeOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PrimaryContainerOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
import de.spreclib.api.parameters.PreCentrifugationParameter;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.sprec.FluidSample;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.FirstCentrifugationList;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugationList;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;

public final class FluidSampleBuilder {

  public FluidSampleType fluidSampleType;
  public PrimaryContainer primaryContainer;
  public PreCentrifugation preCentrifugation;
  public Centrifugation firstCentrifugation;
  public Centrifugation secondCentrifugation;
  public PostCentrifugation postCentrifugation;
  public LongTermStorage longTermStorage;

  public FluidSampleBuilder withFluidSampleType(FluidSampleTypeOption fluidSampleTypeOption) {

    if (fluidSampleTypeOption == null) {
      throw new IllegalArgumentException("FluidSampleTypeOption cannot be null");
    }

    this.fluidSampleType = fluidSampleTypeOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withPrimaryContainer(PrimaryContainerOption primaryContainerOption) {

    if (primaryContainerOption == null) {
      throw new IllegalArgumentException("PrimaryContainerOption cannot be null");
    }

    this.primaryContainer = primaryContainerOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withPreCentrifugation(PreCentrifugationOption preCentrifugationOption) {

    if (preCentrifugationOption == null) {
      throw new IllegalArgumentException("PreCentrifugationOption cannot be null");
    }

    this.preCentrifugation = preCentrifugationOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withPreCentrifugation(
      PreCentrifugationParameter preCentrifugationParameter) {

    if (preCentrifugationParameter == null) {
      throw new IllegalArgumentException("PreCentrifguationParameter cannot be null");
    }

    this.preCentrifugation = preCentrifugationParameter.getPreCentrifugation();
    return this;
  }

  public FluidSampleBuilder withOtherPreCentrifugation() {
    this.preCentrifugation = PreCentrifugationList.getOtherPreCentrifugation();
    return this;
  }

  public FluidSampleBuilder withUnknownPreCentrifugation() {
    this.preCentrifugation = PreCentrifugationList.getUnknownPreCentrifugation();
    return this;
  }

  public FluidSampleBuilder withFirstCentrifugation(
      FirstCentrifugationOption firstCentrifugationOption) {

    if (firstCentrifugationOption == null) {
      throw new IllegalArgumentException("FirstCentrifugationOption cannot be null");
    }

    this.firstCentrifugation = firstCentrifugationOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withUnknownFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getUnknownFirstCentrifugation();
    return this;
  }

  public FluidSampleBuilder withOtherFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getOtherFirstCentrifugation();
    return this;
  }

  public FluidSampleBuilder withNoFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getNoFirstCentrifugation();
    return this;
  }

  public FluidSampleBuilder withSecondCentrifugation(
      SecondCentrifugationOption secondCentrifugationOption) {

    if (secondCentrifugationOption == null) {
      throw new IllegalArgumentException("SecondCentrifugationOption cannot be null");
    }

    this.secondCentrifugation = secondCentrifugationOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withUnknownSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getUnknownSecondCentrifugation();
    return this;
  }

  public FluidSampleBuilder withOtherSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getOtherSecondCentrifugation();
    return this;
  }

  public FluidSampleBuilder withNoSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getNoSecondCentrifugation();
    return this;
  }

  public FluidSampleBuilder withPostCentrifugation(
      PostCentrifugationOption postCentrifugationOption) {

    if (postCentrifugationOption == null) {
      throw new IllegalArgumentException("PostCentrifugationOption cannot be null");
    }

    this.postCentrifugation = postCentrifugationOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withNoApplicablePostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getNoApplicablePostCentrifugation();
    return this;
  }

  public FluidSampleBuilder withUnknownPostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getUnknownPostCentrifugation();
    return this;
  }

  public FluidSampleBuilder withOtherPostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getOtherPostCentrifugation();
    return this;
  }

  public FluidSampleBuilder withLongTermStorage(LongTermStorageOption longTermStorageOption) {

    if (longTermStorageOption == null) {
      throw new IllegalArgumentException("LongTermStorageOption cannot be null");
    }

    this.longTermStorage = longTermStorageOption.getContainedObject();
    return this;
  }

  public FluidSampleBuilder withUnknownLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getUnknownLongTermStorage();
    return this;
  }

  public FluidSampleBuilder withOtherLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getOtherLongTermStorage();
    return this;
  }

  public FluidSample build() {
    return new FluidSample.FluidSampleBuild(this).build();
  }
}
