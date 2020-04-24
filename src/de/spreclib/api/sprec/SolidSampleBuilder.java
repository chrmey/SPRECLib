package de.spreclib.api.sprec;

import de.spreclib.api.lists.ColdIschemiaTimeOption;
import de.spreclib.api.lists.FixationOption;
import de.spreclib.api.lists.FixationTimeOption;
import de.spreclib.api.lists.LongTermStorageOption;
import de.spreclib.api.lists.SolidSampleTypeOption;
import de.spreclib.api.lists.TypeOfCollectionOption;
import de.spreclib.api.lists.WarmIschemiaTimeOption;
import de.spreclib.model.enums.ColdIschemiaTime;
import de.spreclib.model.enums.Fixation;
import de.spreclib.model.enums.FixationTime;
import de.spreclib.model.enums.SolidSampleType;
import de.spreclib.model.enums.TypeOfCollection;
import de.spreclib.model.enums.WarmIschemiaTime;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import de.spreclib.model.sprec.SolidSample;
import de.spreclib.model.sprec.SolidSprecCode;

/**
 * FluentInterface to get the SPREC Code of a solid Sample. The ListOptions for the different parts
 * can be obtained from the ListProviders.
 *
 * <p>"with..." Methods return this instance of SolidSampleSprec. To obtain the SPREC Code Object
 * call {@code .getSprecCode();}
 *
 * <p>Methods can be called with null parameters.
 *
 * <p>Example:
 *
 * <pre>{@code
 * ArrayList<SolidSampleTypeOption> solidSampleTypeOptions = SolidSampleTypeListProvider.getList();
 * SolidSampleTypeOption solidSampleTypeOption = solidSampleTypeOptions.get(0);
 *
 * SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
 *
 * SolidSprecCode solidSprecCode =
 *   solidSampleSprec
 *     .withFluidSampleType(solidampleTypeOption)
 *     .getSprecCode();
 * }</pre>
 *
 * <p>To use values <code>Unknown</code>, <code>Other</code>, <code>No</code>, <code>Not applicable
 * </code> for <code>WarmIschemiaTime</code>, <code>ColdIschemiaTime</code>, <code>FixationTime
 * </code>, <code>LongTermStorage</code> the <code>
 * withUnknown...</code> methods should be used. It is also possible to pass a ListOption containing
 * these values.
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public class SolidSampleBuilder {

  private SolidSampleType solidSampleType;
  private TypeOfCollection typeOfCollection;
  private WarmIschemiaTime warmIschemiaTime;
  private ColdIschemiaTime coldIschemiaTime;
  private Fixation fixation;
  private FixationTime fixationTime;
  private LongTermStorage longTermStorage;

  /**
   * Adds SolidSampleType to SolidSample.
   *
   * @param solidSampleTypeOption
   * @see de.spreclib.api.lists.SolidSampleTypeListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withSolidSampleType(SolidSampleTypeOption solidSampleTypeOption) {
    if (solidSampleTypeOption != null) {
      this.solidSampleType = solidSampleTypeOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds TypeOfCollection to SolidSample.
   *
   * @param typeOfCollectionOption
   * @see de.spreclib.api.lists.TypeOfCollectionListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withTypeOfCollection(TypeOfCollectionOption typeOfCollectionOption) {
    if (typeOfCollectionOption != null) {
      this.typeOfCollection = typeOfCollectionOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds WarmIschemiaTime to SolidSample.
   *
   * @param warmIschemiaTimeOption
   * @see de.spreclib.api.lists.WarmIschemiaTimeListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withWarmIschemiaTime(WarmIschemiaTimeOption warmIschemiaTimeOption) {
    if (warmIschemiaTimeOption != null) {
      this.warmIschemiaTime = warmIschemiaTimeOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds WarmIschemiaTime "Unknown" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withUnknownWarmIschemiaTime() {
    this.warmIschemiaTime = WarmIschemiaTime.UNKNOWN;
    return this;
  }

  /**
   * Adds WarmIschemiaTime "Other" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withOtherWarmIschemiaTime() {
    this.warmIschemiaTime = WarmIschemiaTime.OTHER;
    return this;
  }

  /**
   * Adds WarmIschemiaTime "Not applicable" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withNoApplicableWarmIschemiaTime() {
    this.warmIschemiaTime = WarmIschemiaTime.NOT_APPLICABLE;
    return this;
  }

  /**
   * Adds ColdIschemiaTime to SolidSample.
   *
   * @param coldIschemiaTimeOption
   * @see de.spreclib.api.lists.ColdIschemiaTimeListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withColdIschemiaTime(ColdIschemiaTimeOption coldIschemiaTimeOption) {
    if (coldIschemiaTimeOption != null) {
      this.coldIschemiaTime = coldIschemiaTimeOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds ColdIschemiaTime "Unknown" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withUnknownColdIschemiaTime() {
    this.coldIschemiaTime = ColdIschemiaTime.UNKNOWN;
    return this;
  }

  /**
   * Adds ColdIschemiaTime "Other" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withOtherColdIschemiaTime() {
    this.coldIschemiaTime = ColdIschemiaTime.OTHER;
    return this;
  }

  /**
   * Adds ColdIschemiaTime "Not applicable" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withNoApplicableColdIschemiaTime() {
    this.coldIschemiaTime = ColdIschemiaTime.NOT_APPLICABLE;
    return this;
  }

  /**
   * Adds Fixation to SolidSample.
   *
   * @param fixationOption
   * @see de.spreclib.api.lists.FixationListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withFixation(FixationOption fixationOption) {
    if (fixationOption != null) {
      this.fixation = fixationOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds FixationTime to SolidSample.
   *
   * @param fixationTimeOption
   * @see de.spreclib.api.lists.FixationTimeListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withFixationTime(FixationTimeOption fixationTimeOption) {
    if (fixationTimeOption != null) {
      this.fixationTime = fixationTimeOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds FixationTime "Unknown" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withUnknownFixationTime() {
    this.fixationTime = FixationTime.UNKNOWN;
    return this;
  }

  /**
   * Adds FixationTime "Other" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withOtherFixationTime() {
    this.fixationTime = FixationTime.OTHER;
    return this;
  }

  /**
   * Adds FixationTime "Not applicable" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withNoApplicableFixationTime() {
    this.fixationTime = FixationTime.NOT_APPLICABLE;
    return this;
  }

  /**
   * Adds LongTermStorage to SolidSample.
   *
   * @param longTermStorageOption
   * @see de.spreclib.api.lists.LongTermStorageListProvider
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withLongTermStorage(LongTermStorageOption longTermStorageOption) {
    if (longTermStorageOption != null) {
      this.longTermStorage = longTermStorageOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds LongTermStorage "Unknown" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withUnknownLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getUnknownLongTermStorage();
    return this;
  }

  /**
   * Adds LongTermStorage "Other" to SolidSample.
   *
   * @return SolidSampleSprec Returns itself
   */
  public SolidSampleBuilder withOtherLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getOtherLongTermStorage();
    return this;
  }

  /**
   * Returns SPREC Code of SolidSample.
   *
   * @return SolidSprecCode Returns new instance of SolidSprecCode
   */
  public SolidSprecCode getSprecCode() {
    return new SolidSample(this).getSprecCode();
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
