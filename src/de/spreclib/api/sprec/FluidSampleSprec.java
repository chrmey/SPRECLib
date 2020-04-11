package de.spreclib.api.sprec;

import de.spreclib.api.lists.options.FirstCentrifugationOption;
import de.spreclib.api.lists.options.FluidSampleTypeOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PrimaryContainerOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.sprec.FluidSample;
import de.spreclib.model.sprec.FluidSprecCode;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.FirstCentrifugationList;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugationList;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;

public final class FluidSampleSprec {

  private FluidSampleType fluidSampleType;
  private PrimaryContainer primaryContainer;
  private PreCentrifugation preCentrifugation;
  private Centrifugation firstCentrifugation;
  private Centrifugation secondCentrifugation;
  private PostCentrifugation postCentrifugation;
  private LongTermStorage longTermStorage;

  public FluidSampleSprec withFluidSampleType(FluidSampleTypeOption fluidSampleTypeOption) {
    if (fluidSampleTypeOption != null) {
      this.fluidSampleType = fluidSampleTypeOption.getContainedObject();
    }
    return this;
  }

  public FluidSampleSprec withPrimaryContainer(PrimaryContainerOption primaryContainerOption) {
    if (primaryContainerOption != null) {
      this.primaryContainer = primaryContainerOption.getContainedObject();
    }
    return this;
  }
  public FluidSampleSprec withPreCentrifugation(PreCentrifugationOption preCentrifugationOption) {

    if (preCentrifugationOption != null) {
      this.preCentrifugation = preCentrifugationOption.getContainedObject();
    }
    return this;
  }

  public FluidSampleSprec withOtherPreCentrifugation() {
    this.preCentrifugation = PreCentrifugationList.getOtherPreCentrifugation();
    return this;
  }
  
  public FluidSampleSprec withUnknownPreCentrifugation() {
    this.preCentrifugation = PreCentrifugationList.getUnknownPreCentrifugation();
    return this;
  }
  
  public FluidSampleSprec withFirstCentrifugation(
      FirstCentrifugationOption firstCentrifugationOption) {
    if (firstCentrifugationOption != null) {
      this.firstCentrifugation = firstCentrifugationOption.getContainedObject();
    }
    return this;
  }

  public FluidSampleSprec withUnknownFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getUnknownFirstCentrifugation();
    return this;
  }

  public FluidSampleSprec withOtherFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getOtherFirstCentrifugation();
    return this;
  }

  public FluidSampleSprec withNoFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getNoFirstCentrifugation();
    return this;
  }

  public FluidSampleSprec withSecondCentrifugation(
      SecondCentrifugationOption secondCentrifugationOption) {
    if (secondCentrifugationOption != null) {
      this.secondCentrifugation = secondCentrifugationOption.getContainedObject();
    }
    return this;
  }

  public FluidSampleSprec withUnknownSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getUnknownSecondCentrifugation();
    return this;
  }

  public FluidSampleSprec withOtherSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getOtherSecondCentrifugation();
    return this;
  }

  public FluidSampleSprec withNoSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getNoSecondCentrifugation();
    return this;
  }

  public FluidSampleSprec withPostCentrifugation(
      PostCentrifugationOption postCentrifugationOption) {
    if (postCentrifugationOption != null) {
      this.postCentrifugation = postCentrifugationOption.getContainedObject();
    }
    return this;
  }

  public FluidSampleSprec withNoApplicablePostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getNoApplicablePostCentrifugation();
    return this;
  }

  public FluidSampleSprec withUnknownPostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getUnknownPostCentrifugation();
    return this;
  }

  public FluidSampleSprec withOtherPostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getOtherPostCentrifugation();
    return this;
  }

  public FluidSampleSprec withLongTermStorage(LongTermStorageOption longTermStorageOption) {
    if (longTermStorageOption != null) {
      this.longTermStorage = longTermStorageOption.getContainedObject();
    }
    return this;
  }

  public FluidSampleSprec withUnknownLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getUnknownLongTermStorage();
    return this;
  }

  public FluidSampleSprec withOtherLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getOtherLongTermStorage();
    return this;
  }

  public FluidSprecCode getFluidSampleSprecCode() {
    return new FluidSample.FluidSampleBuilder(this).build().getSprecCode();
  }

  public FluidSampleType getFluidSampleType() {
    return fluidSampleType;
  }

  public PrimaryContainer getPrimaryContainer() {
    return primaryContainer;
  }

  public PreCentrifugation getPreCentrifugation() {
    return preCentrifugation;
  }

  public Centrifugation getFirstCentrifugation() {
    return firstCentrifugation;
  }

  public Centrifugation getSecondCentrifugation() {
    return secondCentrifugation;
  }

  public PostCentrifugation getPostCentrifugation() {
    return postCentrifugation;
  }

  public LongTermStorage getLongTermStorage() {
    return longTermStorage;
  }
}
