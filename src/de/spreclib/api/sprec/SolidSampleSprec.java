package de.spreclib.api.sprec;

import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import de.spreclib.api.lists.options.FixationOption;
import de.spreclib.api.lists.options.FixationTimeOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.SolidSampleTypeOption;
import de.spreclib.api.lists.options.TypeOfCollectionOption;
import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
import de.spreclib.model.enums.ColdIschemiaTime;
import de.spreclib.model.enums.Fixation;
import de.spreclib.model.enums.FixationTime;
import de.spreclib.model.enums.SolidSampleType;
import de.spreclib.model.enums.TypeOfCollection;
import de.spreclib.model.enums.WarmIschemiaTime;
import de.spreclib.model.sprec.SolidSample;
import de.spreclib.model.sprec.SolidSprecCode;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;

public class SolidSampleSprec {

  private SolidSampleType solidSampleType;
  private TypeOfCollection typeOfCollection;
  private WarmIschemiaTime warmIschemiaTime;
  private ColdIschemiaTime coldIschemiaTime;
  private Fixation fixation;
  private FixationTime fixationTime;
  private LongTermStorage longTermStorage;

  public SolidSampleSprec withSolidSampleType(SolidSampleTypeOption solidSampleTypeOption) {
    if (solidSampleTypeOption != null) {
      this.solidSampleType = solidSampleTypeOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withTypeOfCollection(TypeOfCollectionOption typeOfCollectionOption) {
    if (typeOfCollectionOption != null) {
      this.typeOfCollection = typeOfCollectionOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withWarmIschemiaTime(WarmIschemiaTimeOption warmIschemiaTimeOption) {
    if (warmIschemiaTimeOption != null) {
      this.warmIschemiaTime = warmIschemiaTimeOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withUnknownWarmIschemiaTime() {
    this.warmIschemiaTime = WarmIschemiaTime.UNKNOWN;
    return this;
  }

  public SolidSampleSprec withOtherWarmIschemiaTime() {
    this.warmIschemiaTime = WarmIschemiaTime.OTHER;
    return this;
  }

  public SolidSampleSprec withNoApplicableWarmIschemiaTime() {
    this.warmIschemiaTime = WarmIschemiaTime.NOT_APPLICABLE;
    return this;
  }

  public SolidSampleSprec withColdIschemiaTime(ColdIschemiaTimeOption coldIschemiaTimeOption) {
    if (coldIschemiaTimeOption != null) {
      this.coldIschemiaTime = coldIschemiaTimeOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withUnknownColdIschemiaTime() {
    this.coldIschemiaTime = ColdIschemiaTime.UNKNOWN;
    return this;
  }

  public SolidSampleSprec withOtherColdIschemiaTime() {
    this.coldIschemiaTime = ColdIschemiaTime.OTHER;
    return this;
  }

  public SolidSampleSprec withNoApplicableColdIschemiaTime() {
    this.coldIschemiaTime = ColdIschemiaTime.NOT_APPLICABLE;
    return this;
  }

  public SolidSampleSprec withFixation(FixationOption fixationOption) {
    if (fixationOption != null) {
      this.fixation = fixationOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withFixationTime(FixationTimeOption fixationTimeOption) {
    if (fixationTimeOption != null) {
      this.fixationTime = fixationTimeOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withUnknownFixationTime() {
    this.fixationTime = FixationTime.UNKNOWN;
    return this;
  }

  public SolidSampleSprec withOtherFixationTime() {
    this.fixationTime = FixationTime.OTHER;
    return this;
  }

  public SolidSampleSprec withNoApplicableFixationTime() {
    this.fixationTime = FixationTime.NOT_APPLICABLE;
    return this;
  }

  public SolidSampleSprec withLongTermStorage(LongTermStorageOption longTermStorageOption) {
    if (longTermStorageOption != null) {
      this.longTermStorage = longTermStorageOption.getContainedObject();
    }
    return this;
  }

  public SolidSampleSprec withUnknownLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getUnknownLongTermStorage();
    return this;
  }

  public SolidSampleSprec withOtherLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getOtherLongTermStorage();
    return this;
  }

  public SolidSprecCode getSolidSampleSprecCode() {
    return new SolidSample.SolidSampleBuilder(this).build().getSprecCode();
  }

  public SolidSampleType getSolidSampleType() {
    return solidSampleType;
  }

  public TypeOfCollection getTypeOfCollection() {
    return typeOfCollection;
  }

  public WarmIschemiaTime getWarmIschemiaTime() {
    return warmIschemiaTime;
  }

  public ColdIschemiaTime getColdIschemiaTime() {
    return coldIschemiaTime;
  }

  public Fixation getFixation() {
    return fixation;
  }

  public FixationTime getFixationTime() {
    return fixationTime;
  }

  public LongTermStorage getLongTermStorage() {
    return longTermStorage;
  }
}
