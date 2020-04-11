package de.spreclib.api.sprec;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.FirstCentrifugationListProvider;
import de.spreclib.api.lists.FluidSampleTypeListProvider;
import de.spreclib.api.lists.LongTermStorageListProvider;
import de.spreclib.api.lists.PostCentrifugationListProvider;
import de.spreclib.api.lists.PreCentrifugationListProvider;
import de.spreclib.api.lists.PrimaryContainerListProvider;
import de.spreclib.api.lists.SecondCentrifugationListProvider;
import de.spreclib.api.lists.options.FirstCentrifugationOption;
import de.spreclib.api.lists.options.FluidSampleTypeOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PrimaryContainerOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
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
import de.spreclib.model.exceptions.InvalidPartRelationException;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import de.spreclib.model.sprec.FluidSprecCode;
import de.spreclib.model.spreclib.centrifugation.NormalCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.NormalPostCentrifugation;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FluidSampleSprecTest {

  private ArrayList<FluidSampleTypeOption> fluidSampleTypeList;
  private ArrayList<PrimaryContainerOption> primaryContainerList;
  private ArrayList<PreCentrifugationOption> preCentrifugationList;
  private ArrayList<FirstCentrifugationOption> firstCentrifugationList;
  private ArrayList<SecondCentrifugationOption> secondCentrifugationList;
  private ArrayList<PostCentrifugationOption> postCentrifugationList;
  private ArrayList<LongTermStorageOption> longTermStorageList;

  private FluidSampleTypeOption fluidSampleTypeOption;
  private PrimaryContainerOption primaryContainerOption;
  private PreCentrifugationOption preCentrifugationOption;
  private FirstCentrifugationOption firstCentrifugationOption;
  private SecondCentrifugationOption secondCentrifugationOption;
  private PostCentrifugationOption postCentrifugationOption;
  private LongTermStorageOption longTermStorageOption;

  @Before
  public void setUp() {

    this.fluidSampleTypeList = FluidSampleTypeListProvider.getList();
    this.primaryContainerList = PrimaryContainerListProvider.getList();
    this.preCentrifugationList = PreCentrifugationListProvider.getList();
    this.firstCentrifugationList = FirstCentrifugationListProvider.getList();
    this.secondCentrifugationList = SecondCentrifugationListProvider.getList();
    this.postCentrifugationList = PostCentrifugationListProvider.getList();
    this.longTermStorageList = LongTermStorageListProvider.getList();

    this.fluidSampleTypeOption = fluidSampleTypeList.get(0);
    this.primaryContainerOption = primaryContainerList.get(0);
    this.preCentrifugationOption = preCentrifugationList.get(0);
    this.firstCentrifugationOption = firstCentrifugationList.get(0);
    this.secondCentrifugationOption = secondCentrifugationList.get(0);
    this.postCentrifugationOption = postCentrifugationList.get(0);
    this.longTermStorageOption = longTermStorageList.get(0);
  }

  @Test
  public void testWithFluidSampleTypeOption() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withFluidSampleType(this.fluidSampleTypeOption)
            .getFluidSampleSprecCode();

    ICodePart fluidSampleTypeCode = fluidSampleCode.getFluidSampleTypeCode();

    assertFalse(fluidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPrimaryContainer() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withPrimaryContainer(this.primaryContainerOption)
            .getFluidSampleSprecCode();

    ICodePart primaryContainerCode = fluidSampleCode.getPrimaryContainerCode();

    assertFalse(primaryContainerCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPreCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withPreCentrifugation(this.preCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherPreCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withOtherPreCentrifugation().getFluidSampleSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownPreCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withUnknownPreCentrifugation().getFluidSampleSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFirstCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withFirstCentrifugation(this.firstCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownFirstCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withUnknownFirstCentrifugation().getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFirstCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withOtherFirstCentrifugation().getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoFirstCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withNoFirstCentrifugation().getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithSecondCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withSecondCentrifugation(this.secondCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownSecondCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withUnknownSecondCentrifugation().getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherSecondCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withOtherSecondCentrifugation().getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoSecondCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withNoSecondCentrifugation().getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPostCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withOtherFirstCentrifugation()
            .withOtherSecondCentrifugation()
            .withPostCentrifugation(this.postCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = InvalidPartRelationException.class)
  public void testWithPostCentrifugationWithNoFirstOrSecondCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();

    PostCentrifugationOption postCentrifugationOption =
        new PostCentrifugationOption(
            new NormalPostCentrifugation(
                PostCentrifugationType.DEFAULT,
                PostCentrifugationDelay.LESS_ONE_HOUR,
                PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("A")));

    fluidSampleBuilder
        .withNoFirstCentrifugation()
        .withNoSecondCentrifugation()
        .withPostCentrifugation(postCentrifugationOption)
        .getFluidSampleSprecCode();
  }

  @Test
  public void testWithNoApplicablePostCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withNoApplicablePostCentrifugation().getFluidSampleSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = InvalidPartRelationException.class)
  public void testWithUnknownPostCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();

    fluidSampleBuilder
        .withNoFirstCentrifugation()
        .withNoSecondCentrifugation()
        .withUnknownPostCentrifugation()
        .getFluidSampleSprecCode();
  }

  @Test(expected = InvalidPartRelationException.class)
  public void testWithOtherPostCentrifugation() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();

    fluidSampleBuilder
        .withNoFirstCentrifugation()
        .withNoSecondCentrifugation()
        .withOtherPostCentrifugation()
        .getFluidSampleSprecCode();
  }

  @Test
  public void testWithLongTermStorage() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withLongTermStorage(this.longTermStorageOption)
            .getFluidSampleSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withUnknownLongTermStorage().getFluidSampleSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder.withOtherLongTermStorage().getFluidSampleSprecCode();

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

    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();

    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withFluidSampleType(this.fluidSampleTypeOption)
            .withPrimaryContainer(this.primaryContainerOption)
            .withPreCentrifugation(this.preCentrifugationOption)
            .withFirstCentrifugation(firstCentrifugationOption)
            .withSecondCentrifugation(secondCentrifugationOption)
            .withPostCentrifugation(this.postCentrifugationOption)
            .withLongTermStorage(this.longTermStorageOption)
            .getFluidSampleSprecCode();

    String code = fluidSampleCode.getCodeString();

    assertNotNull(code);
  }

  @Test
  public void withNullOptions() {

    FluidSampleSprec fluidSampleBuilder = new FluidSampleSprec();

    FluidSprecCode fluidSampleCode =
        fluidSampleBuilder
            .withFluidSampleType(null)
            .withPrimaryContainer(null)
            .withPreCentrifugation(null)
            .withFirstCentrifugation(null)
            .withSecondCentrifugation(null)
            .withPostCentrifugation(null)
            .withLongTermStorage(null)
            .getFluidSampleSprecCode();

    String codeString = fluidSampleCode.getCodeString();

    assertNotNull(codeString);
  }
}
