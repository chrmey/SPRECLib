package de.spreclib.model.sprec;

import de.spreclib.api.sprec.SolidSampleBuilder;
import de.spreclib.model.enums.ColdIschemiaTime;
import de.spreclib.model.enums.Fixation;
import de.spreclib.model.enums.FixationTime;
import de.spreclib.model.enums.SolidSampleType;
import de.spreclib.model.enums.TypeOfCollection;
import de.spreclib.model.enums.WarmIschemiaTime;
import de.spreclib.model.exceptions.InvalidPartValueException;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import de.spreclib.model.sprec.interfaces.ISample;

public class SolidSample implements ISample {

  private final SolidSampleType solidSampleType;
  private final TypeOfCollection typeOfCollection;
  private final WarmIschemiaTime warmIschemiaTime;
  private final ColdIschemiaTime coldIschemiaTime;
  private final Fixation fixation;
  private final FixationTime fixationTime;
  private final LongTermStorage longTermStorage;

  private final SolidSprecCode solidSprecCode;

  public SolidSample(SolidSampleBuilder solidSampleBuilder) {

    if (solidSampleBuilder == null) {
      throw new IllegalArgumentException("SolidSampleBuilder cannot be null.");
    }

    this.solidSampleType = solidSampleBuilder.getSolidSampleType();
    this.typeOfCollection = solidSampleBuilder.getTypeOfCollection();
    this.warmIschemiaTime = solidSampleBuilder.getWarmIschemiaTime();
    this.coldIschemiaTime = solidSampleBuilder.getColdIschemiaTime();
    this.fixation = solidSampleBuilder.getFixation();
    this.fixationTime = solidSampleBuilder.getFixationTime();
    this.longTermStorage = solidSampleBuilder.getLongTermStorage();

    this.validateParts();

    this.solidSprecCode =
        new SolidSprecCode.SolidSprecCodeBuilder()
            .withSolidSampleType(this.solidSampleType)
            .withTypeOfCollection(this.typeOfCollection)
            .withWarmIschemiaTime(this.warmIschemiaTime)
            .withColdIschemiaTime(this.coldIschemiaTime)
            .withFixation(this.fixation)
            .withFixationTime(this.fixationTime)
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

    if (this.solidSampleType != null && !SolidSampleType.contains(this.solidSampleType)) {
      throw new InvalidPartValueException(
          this.solidSampleType, "Selected SolidSampleType cannot be found in SPREC.");
    }

    if (this.typeOfCollection != null && !TypeOfCollection.contains(this.typeOfCollection)) {
      throw new InvalidPartValueException(
          this.typeOfCollection, "Selected TypeOfCollection cannot be found in SPREC.");
    }

    if (this.warmIschemiaTime != null && !WarmIschemiaTime.contains(this.warmIschemiaTime)) {
      throw new InvalidPartValueException(
          this.warmIschemiaTime, "Selected WarmIschemiaTime cannot be found in SPREC.");
    }

    if (this.coldIschemiaTime != null && !ColdIschemiaTime.contains(this.coldIschemiaTime)) {
      throw new InvalidPartValueException(
          this.coldIschemiaTime, "Selected ColdIschmemiaTime cannot be found in SPREC.");
    }

    if (this.fixation != null && !Fixation.contains(this.fixation)) {
      throw new InvalidPartValueException(
          this.fixation, "Selected Fixation cannot be found in SPREC.");
    }

    if (this.fixationTime != null && !FixationTime.contains(this.fixationTime)) {
      throw new InvalidPartValueException(
          this.fixationTime, "Selected FixationTime cannot be found in SPREC.");
    }

    if (this.longTermStorage != null
        && !LongTermStorageList.LONG_TERM_STORAGES.contains(this.longTermStorage)) {
      throw new InvalidPartValueException(
          this.longTermStorage, "Selected LongTermStorage cannot be found in SPREC.");
    }
  }

  @Override
  public SolidSprecCode getSprecCode() {
    return this.solidSprecCode;
  }
}
