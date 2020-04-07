package de.spreclib.api.sprec;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.FirstCentrifugationListProvider;
import de.spreclib.api.lists.FluidSampleTypeListProvider;
import de.spreclib.api.lists.LongTermStorageListProvider;
import de.spreclib.api.lists.PostCentrifugationListProvider;
import de.spreclib.api.lists.PreCentrifugationListProvider;
import de.spreclib.api.lists.PrimaryContainerListProvider;
import de.spreclib.api.lists.SecondCentrifugationListProvider;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.lists.options.FirstCentrifugationOption;
import de.spreclib.api.lists.options.FluidSampleTypeOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PrimaryContainerOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
import de.spreclib.api.parameters.PreCentrifugationDelayParameter;
import de.spreclib.api.parameters.PreCentrifugationParameter;
import de.spreclib.api.parameters.PreCentrifugationTemperatureParameter;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.exceptions.InvalidParameterRelationException;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import de.spreclib.model.sprec.FluidSample;
import de.spreclib.model.sprec.FluidSprecCode;
import de.spreclib.model.spreclib.centrifugation.NormalCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.NormalPostCentrifugation;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FluidSampleSprecTest {

  private ArrayList<IListOption> fluidSampleTypeList;
  private ArrayList<IListOption> primaryContainerList;
  private ArrayList<IListOption> preCentrifugationList;
  private ArrayList<IListOption> firstCentrifugationList;
  private ArrayList<IListOption> secondCentrifugationList;
  private ArrayList<IListOption> postCentrifugationList;
  private ArrayList<IListOption> longTermStorageList;

  private FluidSampleTypeOption fluidSampleTypeOption;
  private PrimaryContainerOption primaryContainerOption;
  private PreCentrifugationOption preCentrifugationOption;
  private FirstCentrifugationOption firstCentrifugationOption;
  private SecondCentrifugationOption secondCentrifugationOption;
  private PostCentrifugationOption postCentrifugationOption;
  private LongTermStorageOption longTermStorageOption;

  @Before
  public void setUp() {

    IListProvider fluidSampleTypeProvider = new FluidSampleTypeListProvider();
    IListProvider primaryContainerListProvider = new PrimaryContainerListProvider();
    IListProvider preCentrifugationListProvider = new PreCentrifugationListProvider();
    IListProvider firstCentrifugationListProvider = new FirstCentrifugationListProvider();
    IListProvider secondCentrifugationListProvider = new SecondCentrifugationListProvider();
    IListProvider postCentrifugationListProvider = new PostCentrifugationListProvider();
    IListProvider longTermStorageListProvider = new LongTermStorageListProvider();

    this.fluidSampleTypeList = fluidSampleTypeProvider.getList();
    this.primaryContainerList = primaryContainerListProvider.getList();
    this.preCentrifugationList = preCentrifugationListProvider.getList();
    this.firstCentrifugationList = firstCentrifugationListProvider.getList();
    this.secondCentrifugationList = secondCentrifugationListProvider.getList();
    this.postCentrifugationList = postCentrifugationListProvider.getList();
    this.longTermStorageList = longTermStorageListProvider.getList();

    this.fluidSampleTypeOption = (FluidSampleTypeOption) fluidSampleTypeList.get(0);
    this.primaryContainerOption = (PrimaryContainerOption) primaryContainerList.get(0);
    this.preCentrifugationOption = (PreCentrifugationOption) preCentrifugationList.get(0);
    this.firstCentrifugationOption = (FirstCentrifugationOption) firstCentrifugationList.get(0);
    this.secondCentrifugationOption = (SecondCentrifugationOption) secondCentrifugationList.get(0);
    this.postCentrifugationOption = (PostCentrifugationOption) postCentrifugationList.get(0);
    this.longTermStorageOption = (LongTermStorageOption) longTermStorageList.get(0);
  }

  @Test
  public void testWithFluidSampleTypeOption() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder.withFluidSampleType(this.fluidSampleTypeOption).build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart fluidSampleTypeCode = fluidSampleCode.getFluidSampleTypeCode();

    assertFalse(fluidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithFluidSampleTypeOptionIsNull() {

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withFluidSampleType(null).build();
  }

  @Test
  public void testWithPrimaryContainer() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder.withPrimaryContainer(this.primaryContainerOption).build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart primaryContainerCode = fluidSampleCode.getPrimaryContainerCode();

    assertFalse(primaryContainerCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithPrimaryContainerOptionIsNull() {

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withPrimaryContainer(null).build();
  }

  @Test
  public void testWithPreCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder.withPreCentrifugation(this.preCentrifugationOption).build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithPreCentrifugationOptionIsNull() {

    PreCentrifugationOption preCentrifugationOption = null;

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withPreCentrifugation(preCentrifugationOption).build();
  }

  @Test
  public void testWithPreCentrifugationParameter() {

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();

    PreCentrifugationTemperatureParameter temperature =
        new PreCentrifugationTemperatureParameter(2);
    PreCentrifugationDelayParameter delay =
        new PreCentrifugationDelayParameter(1577836800, 1577837700);

    FluidSample fluidSample =
        fluidSampleBuilder
            .withPreCentrifugation(new PreCentrifugationParameter(temperature, delay))
            .build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertEquals("B", preCentrifugationCode.getStringRepresentation());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithPreCentrifugationParameterIsNull() {

    PreCentrifugationParameter preCentrifugationParameter = null;

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withPreCentrifugation(preCentrifugationParameter).build();
  }

  @Test
  public void testWithOtherPreCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withOtherPreCentrifugation().build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownPreCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withUnknownPreCentrifugation().build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFirstCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder.withFirstCentrifugation(this.firstCentrifugationOption).build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithFirstCentrifugationOptionIsNull() {

    FirstCentrifugationOption firstCentrifugationOption = null;

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withFirstCentrifugation(firstCentrifugationOption).build();
  }

  @Test
  public void testWithUnknownFirstCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withUnknownFirstCentrifugation().build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFirstCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withOtherFirstCentrifugation().build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoFirstCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withNoFirstCentrifugation().build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithSecondCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder.withSecondCentrifugation(this.secondCentrifugationOption).build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithSecondCentrifugationOptionIsNull() {

    SecondCentrifugationOption secondCentrifugationOption = null;

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withSecondCentrifugation(secondCentrifugationOption).build();
  }

  @Test
  public void testWithUnknownSecondCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withUnknownSecondCentrifugation().build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherSecondCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withOtherSecondCentrifugation().build();
    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoSecondCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withNoSecondCentrifugation().build();
    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPostCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder
            .withOtherFirstCentrifugation()
            .withOtherSecondCentrifugation()
            .withPostCentrifugation(this.postCentrifugationOption)
            .build();

    ICodePart postCentrifugationCode = fluidSample.getSprecCode().getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithPostCentrifugationOptionIsNull() {

    PostCentrifugationOption postCentrifugationOption = null;

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withPostCentrifugation(postCentrifugationOption).build();
  }

  @Test(expected = InvalidParameterRelationException.class)
  public void testWithPostCentrifugationWithNoFirstOrSecondCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();

    PostCentrifugationOption option =
        new PostCentrifugationOption(
            new NormalPostCentrifugation(
                PostCentrifugationType.DEFAULT,
                PostCentrifugationDelay.LESS_ONE_HOUR,
                PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("A")));

    fluidSampleBuilder.withPostCentrifugation(option).build();
  }

  @Test
  public void testWithNoApplicablePostCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withNoApplicablePostCentrifugation().build();
    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = InvalidParameterRelationException.class)
  public void testWithUnknownPostCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withUnknownPostCentrifugation().build();

    fluidSample.getSprecCode();
  }

  @Test(expected = InvalidParameterRelationException.class)
  public void testWithOtherPostCentrifugation() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withOtherPostCentrifugation().build();

    fluidSample.getSprecCode();
  }

  @Test
  public void testWithLongTermStorage() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample =
        fluidSampleBuilder.withLongTermStorage(this.longTermStorageOption).build();
    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithLongTermStorageOptionIsNull() {

    LongTermStorageOption longTermStorageOption = null;

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    fluidSampleBuilder.withLongTermStorage(longTermStorageOption).build();
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withUnknownLongTermStorage().build();
    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();
    FluidSample fluidSample = fluidSampleBuilder.withOtherLongTermStorage().build();
    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithAllOptions() {

    FirstCentrifugationOption firstCentrifugationOption =
        new FirstCentrifugationOption(
            new NormalCentrifugation(
                FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
                FirstCentrifugationTemperature.ROOM_TEMPERATURE,
                CentrifugationBraking.NO_BRAKING,
                new CodePart("A"),
                SprecPartType.FIRST_CENTRIFUGATION));

    SecondCentrifugationOption secondCentrifugationOption =
        new SecondCentrifugationOption(
            new NormalCentrifugation(
                SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
                SecondCentrifugationSpeed.LESS_THREETHOUSAND_G,
                SecondCentrifugationTemperature.ROOM_TEMPERATURE,
                CentrifugationBraking.NO_BRAKING,
                new CodePart("A"),
                SprecPartType.SECOND_CENTRIFUGATION));

    FluidSampleBuilder fluidSampleBuilder = new FluidSampleBuilder();

    FluidSample fluidSample =
        fluidSampleBuilder
            .withFluidSampleType(this.fluidSampleTypeOption)
            .withPrimaryContainer(this.primaryContainerOption)
            .withPreCentrifugation(this.preCentrifugationOption)
            .withFirstCentrifugation(firstCentrifugationOption)
            .withSecondCentrifugation(secondCentrifugationOption)
            .withPostCentrifugation(this.postCentrifugationOption)
            .withLongTermStorage(this.longTermStorageOption)
            .build();

    FluidSprecCode fluidSampleCode = fluidSample.getSprecCode();

    String code = fluidSampleCode.getCodeString();

    assertNotNull(code);
  }
}
