package de.spreclib.api.sprec;

import de.spreclib.api.lists.FirstCentrifugationOption;
import de.spreclib.api.lists.FluidSampleTypeOption;
import de.spreclib.api.lists.LongTermStorageOption;
import de.spreclib.api.lists.PostCentrifugationOption;
import de.spreclib.api.lists.PreCentrifugationOption;
import de.spreclib.api.lists.PrimaryContainerOption;
import de.spreclib.api.lists.SecondCentrifugationOption;
import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.FirstCentrifugationList;
import de.spreclib.model.centrifugation.SecondCentrifugationList;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import de.spreclib.model.postcentrifugation.PostCentrifugation;
import de.spreclib.model.postcentrifugation.PostCentrifugationList;
import de.spreclib.model.precentrifugation.PreCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugationList;
import de.spreclib.model.sprec.FluidSample;
import de.spreclib.model.sprec.FluidSprecCode;

/**
 * FluentInterface to get the SPREC Code of a fluid Sample. The ListOptions for the different parts
 * can be obtained from the ListProviders.
 *
 * <p>"with..." Methods return this instance of FluidSampleSprec. To obtain the SPREC Code Object
 * call {@code .getSprecCode();}
 *
 * <p>Methods can be called with null parameters.
 *
 * <p>Example:
 *
 * <pre>{@code
 * ArrayList<FluidSampleTypeOption> fluidSampleTypeOptions = FluidSampleTypeListProvider.getList();
 * FluidSampleTypeOption fluidSampleTypeOption = fluidSampleTypeOptions.get(0);
 *
 * FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
 *
 * FluidSprecCode fluidSprecCode =
 *   fluidSampleSprec
 *     .withFluidSampleType(fluidSampleTypeOption)
 *     .getSprecCode();
 * }</pre>
 *
 * <p>To use values <code>Unknown</code>, <code>Other</code>, <code>No</code>, <code>Not applicable
 * </code> for <code>PreCentrifugation</code>, <code>FirstCentrifugation</code>, <code>
 * SecondCentrifugation
 * </code>, <code>PostCentrifugation
 * </code>, <code>LongTermStorage</code> the <code>
 * withUnknown...</code> methods should be used. It is also possible to pass a ListOption containing
 * these values.
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FluidSampleSprec {

  private FluidSampleType fluidSampleType;
  private PrimaryContainer primaryContainer;
  private PreCentrifugation preCentrifugation;
  private Centrifugation firstCentrifugation;
  private Centrifugation secondCentrifugation;
  private PostCentrifugation postCentrifugation;
  private LongTermStorage longTermStorage;

  /**
   * Adds FluidSampleType to FluidSample.
   *
   * @param fluidSampleTypeOption FluidSampleTypeOption
   * @see de.spreclib.api.lists.FluidSampleTypeListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withFluidSampleType(FluidSampleTypeOption fluidSampleTypeOption) {
    if (fluidSampleTypeOption != null) {
      this.fluidSampleType = fluidSampleTypeOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds PrimaryContainer to FluidSample.
   *
   * @param primaryContainerOption
   * @see de.spreclib.api.lists.PrimaryContainerListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withPrimaryContainer(PrimaryContainerOption primaryContainerOption) {
    if (primaryContainerOption != null) {
      this.primaryContainer = primaryContainerOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds PreCentrifugation to FluidSample.
   *
   * @param preCentrifugationOption
   * @see de.spreclib.api.lists.PreCentrifugationListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withPreCentrifugation(PreCentrifugationOption preCentrifugationOption) {

    if (preCentrifugationOption != null) {
      this.preCentrifugation = preCentrifugationOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds PreCentrifugation "Other" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withOtherPreCentrifugation() {
    this.preCentrifugation = PreCentrifugationList.getOtherPreCentrifugation();
    return this;
  }

  /**
   * Adds PreCentrifugation "Unknown" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withUnknownPreCentrifugation() {
    this.preCentrifugation = PreCentrifugationList.getUnknownPreCentrifugation();
    return this;
  }

  /**
   * Adds FirstCentrifugation to FluidSample.
   *
   * @param firstCentrifugationOption
   * @see de.spreclib.api.lists.FirstCentrifugationListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withFirstCentrifugation(
      FirstCentrifugationOption firstCentrifugationOption) {
    if (firstCentrifugationOption != null) {
      this.firstCentrifugation = firstCentrifugationOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds FirstCentrifugation "Unknown" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withUnknownFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getUnknownFirstCentrifugation();
    return this;
  }

  /**
   * Adds FirstCentrifugation "Other" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withOtherFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getOtherFirstCentrifugation();
    return this;
  }

  /**
   * Adds FirstCentrifugation "No" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withNoFirstCentrifugation() {
    this.firstCentrifugation = FirstCentrifugationList.getNoFirstCentrifugation();
    return this;
  }

  /**
   * Adds SecondCentrifugation to FluidSample.
   *
   * @param secondCentrifugationOption
   * @see de.spreclib.api.lists.SecondCentrifugationListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withSecondCentrifugation(
      SecondCentrifugationOption secondCentrifugationOption) {
    if (secondCentrifugationOption != null) {
      this.secondCentrifugation = secondCentrifugationOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds SecondCentrifugation "Unknown" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withUnknownSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getUnknownSecondCentrifugation();
    return this;
  }

  /**
   * Adds SecondCentrifugation "other" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withOtherSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getOtherSecondCentrifugation();
    return this;
  }

  /**
   * Adds SecondCentrifugation "No" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withNoSecondCentrifugation() {
    this.secondCentrifugation = SecondCentrifugationList.getNoSecondCentrifugation();
    return this;
  }

  /**
   * Adds PostCentrifugation to FluidSample.
   *
   * @param postCentrifugationOption
   * @see de.spreclib.api.lists.PostCentrifugationListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withPostCentrifugation(
      PostCentrifugationOption postCentrifugationOption) {
    if (postCentrifugationOption != null) {
      this.postCentrifugation = postCentrifugationOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds PostCentrifugation "Not Applicable" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withNoApplicablePostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getNoApplicablePostCentrifugation();
    return this;
  }

  /**
   * Adds PostCentrifugation "Unknown" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withUnknownPostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getUnknownPostCentrifugation();
    return this;
  }

  /**
   * Adds PostCentrifugation "Other" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withOtherPostCentrifugation() {
    this.postCentrifugation = PostCentrifugationList.getOtherPostCentrifugation();
    return this;
  }

  /**
   * Adds LongTermStorage to FluidSample.
   *
   * @param longTermStorageOption
   * @see de.spreclib.api.lists.LongTermStorageListProvider
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withLongTermStorage(LongTermStorageOption longTermStorageOption) {
    if (longTermStorageOption != null) {
      this.longTermStorage = longTermStorageOption.getContainedObject();
    }
    return this;
  }

  /**
   * Adds LongTermStorage "Unknown" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withUnknownLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getUnknownLongTermStorage();
    return this;
  }

  /**
   * Adds LongTermStorage "Other" to FluidSample.
   *
   * @return FluidSampleSprec Returns itself
   */
  public FluidSampleSprec withOtherLongTermStorage() {
    this.longTermStorage = LongTermStorageList.getOtherLongTermStorage();
    return this;
  }

  /**
   * Returns SPREC Code of FluidSample.
   *
   * @return FluidSprecCode Returns new instance of FluidSprecCode
   */
  public FluidSprecCode getSprecCode() {
    return new FluidSample(this).getSprecCode();
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
