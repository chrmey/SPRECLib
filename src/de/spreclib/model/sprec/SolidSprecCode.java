package de.spreclib.model.sprec;

import de.spreclib.model.enums.ColdIschemiaTime;
import de.spreclib.model.enums.Fixation;
import de.spreclib.model.enums.FixationTime;
import de.spreclib.model.enums.SolidSampleType;
import de.spreclib.model.enums.TypeOfCollection;
import de.spreclib.model.enums.WarmIschemiaTime;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.longtermstorage.LongTermStorage;

public final class SolidSprecCode extends AbstractSprecCode {

  private final ICodePart solidSampleTypeCode;
  private final ICodePart typeOfCollectionCode;
  private final ICodePart warmIschemiaTimeCode;
  private final ICodePart coldIschemiaTimeCode;
  private final ICodePart fixationCode;
  private final ICodePart fixationTimeCode;
  private final ICodePart longTermStorageCode;

  private SolidSprecCode(SolidSprecCodeBuilder solidSprecCodeBuilder) {
    super();
    this.solidSampleTypeCode = solidSprecCodeBuilder.solidSampleTypeCode;
    this.typeOfCollectionCode = solidSprecCodeBuilder.typeOfCollectionCode;
    this.warmIschemiaTimeCode = solidSprecCodeBuilder.warmIschemiaTimeCode;
    this.coldIschemiaTimeCode = solidSprecCodeBuilder.coldIschemiaTimeCode;
    this.fixationCode = solidSprecCodeBuilder.fixationCode;
    this.fixationTimeCode = solidSprecCodeBuilder.fixationTimeCode;
    this.longTermStorageCode = solidSprecCodeBuilder.longTermStorageCode;
  }

  public ICodePart getSolidSampleTypeCode() {
    return this.solidSampleTypeCode;
  }

  public ICodePart getTypeOfCollectionCode() {
    return this.typeOfCollectionCode;
  }

  public ICodePart getWarmIschemiaTimeCode() {
    return this.warmIschemiaTimeCode;
  }

  public ICodePart getColdIschemiaTimeCode() {
    return this.coldIschemiaTimeCode;
  }

  public ICodePart getFixationCode() {
    return this.fixationCode;
  }

  public ICodePart getFixationTimeCode() {
    return this.fixationTimeCode;
  }

  public ICodePart getLongTermStorageCode() {
    return this.longTermStorageCode;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder code = new StringBuilder();
    code.append(
            this.solidSampleTypeCode != null
                ? this.solidSampleTypeCode.getStringRepresentation()
                : this.placeholderThreeCharacters)
        .append(
            this.typeOfCollectionCode != null
                ? this.typeOfCollectionCode.getStringRepresentation()
                : this.placeholderThreeCharacters)
        .append(
            this.warmIschemiaTimeCode != null
                ? this.warmIschemiaTimeCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.coldIschemiaTimeCode != null
                ? this.coldIschemiaTimeCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.fixationCode != null
                ? this.fixationCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.fixationTimeCode != null
                ? this.fixationTimeCode.getStringRepresentation()
                : this.placeholderOneCharacter)
        .append(
            this.longTermStorageCode != null
                ? this.longTermStorageCode.getStringRepresentation()
                : this.placeholderOneCharacter);

    return code.toString();
  }

  protected static final class SolidSprecCodeBuilder {

    private ICodePart solidSampleTypeCode;
    private ICodePart typeOfCollectionCode;
    private ICodePart warmIschemiaTimeCode;
    private ICodePart coldIschemiaTimeCode;
    private ICodePart fixationCode;
    private ICodePart fixationTimeCode;
    private ICodePart longTermStorageCode;

    public SolidSprecCodeBuilder withSolidSampleType(SolidSampleType solidSampleType) {
      if (solidSampleType != null) {
        this.solidSampleTypeCode = solidSampleType.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCodeBuilder withTypeOfCollection(TypeOfCollection typeOfCollection) {
      if (typeOfCollection != null) {
        this.typeOfCollectionCode = typeOfCollection.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCodeBuilder withWarmIschemiaTime(WarmIschemiaTime warmIschemiaTime) {
      if (warmIschemiaTime != null) {
        this.warmIschemiaTimeCode = warmIschemiaTime.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCodeBuilder withColdIschemiaTime(ColdIschemiaTime coldIschemiaTime) {
      if (coldIschemiaTime != null) {
        this.coldIschemiaTimeCode = coldIschemiaTime.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCodeBuilder withFixation(Fixation fixation) {
      if (fixation != null) {
        this.fixationCode = fixation.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCodeBuilder withFixationTime(FixationTime fixationTime) {
      if (fixationTime != null) {
        this.fixationTimeCode = fixationTime.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCodeBuilder withLongTermStorage(LongTermStorage longTermStorage) {
      if (longTermStorage != null) {
        this.longTermStorageCode = longTermStorage.getCodeFromSprecPart();
      }
      return this;
    }

    public SolidSprecCode build() {
      return new SolidSprecCode(this);
    }
  }
}
