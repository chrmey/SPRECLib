package de.spreclib.model.sprec;

import de.spreclib.api.sprec.SolidSampleSprec;
import de.spreclib.model.enums.ColdIschemiaTime;
import de.spreclib.model.enums.Fixation;
import de.spreclib.model.enums.FixationTime;
import de.spreclib.model.enums.SolidSampleType;
import de.spreclib.model.enums.TypeOfCollection;
import de.spreclib.model.enums.WarmIschemiaTime;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;

public class SolidSample {

  private final SolidSampleType solidSampleType;
  private final TypeOfCollection typeOfCollection;
  private final WarmIschemiaTime warmIschemiaTime;
  private final ColdIschemiaTime coldIschemiaTime;
  private final Fixation fixation;
  private final FixationTime fixationTime;
  private final LongTermStorage longTermStorage;

  private SolidSample(SolidSampleBuilder solidSampleBuilder) {
    this.solidSampleType = solidSampleBuilder.solidSampleType;
    this.typeOfCollection = solidSampleBuilder.typeOfCollection;
    this.warmIschemiaTime = solidSampleBuilder.warmIschemiaTime;
    this.coldIschemiaTime = solidSampleBuilder.coldIschemiaTime;
    this.fixation = solidSampleBuilder.fixation;
    this.fixationTime = solidSampleBuilder.fixationTime;
    this.longTermStorage = solidSampleBuilder.longTermStorage;

    // this.validateParts();
  }

  // private void validateParts() {}

  public SolidSprecCode getSprecCode() {

    return new SolidSprecCode.SolidSprecCodeBuilder()
        .withSolidSampleType(this.solidSampleType)
        .withTypeOfCollection(this.typeOfCollection)
        .withWarmIschemiaTime(this.warmIschemiaTime)
        .withColdIschemiaTime(this.coldIschemiaTime)
        .withFixation(this.fixation)
        .withFixationTime(this.fixationTime)
        .withLongTermStorage(this.longTermStorage)
        .build();
  }

  public static final class SolidSampleBuilder {
    private final SolidSampleType solidSampleType;
    private final TypeOfCollection typeOfCollection;
    private final WarmIschemiaTime warmIschemiaTime;
    private final ColdIschemiaTime coldIschemiaTime;
    private final Fixation fixation;
    private final FixationTime fixationTime;
    private final LongTermStorage longTermStorage;

    public SolidSampleBuilder(SolidSampleSprec solidSampleSprec) {

      if (solidSampleSprec == null) {
        throw new IllegalArgumentException("SolidSampleSprec cannot be null");
      }

      this.solidSampleType = solidSampleSprec.getSolidSampleType();
      this.typeOfCollection = solidSampleSprec.getTypeOfCollection();
      this.warmIschemiaTime = solidSampleSprec.getWarmIschemiaTime();
      this.coldIschemiaTime = solidSampleSprec.getColdIschemiaTime();
      this.fixation = solidSampleSprec.getFixation();
      this.fixationTime = solidSampleSprec.getFixationTime();
      this.longTermStorage = solidSampleSprec.getLongTermStorage();
    }

    public SolidSample build() {
      return new SolidSample(this);
    }
  }
}
