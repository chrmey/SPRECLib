package de.spreclib.api.sprec;

import static org.junit.Assert.assertFalse;

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

    this.fluidSampleTypeOption = this.fluidSampleTypeList.get(0);
    this.primaryContainerOption = this.primaryContainerList.get(0);
    this.preCentrifugationOption = this.preCentrifugationList.get(0);
    this.firstCentrifugationOption = this.firstCentrifugationList.get(0);
    this.secondCentrifugationOption = this.secondCentrifugationList.get(0);
    this.postCentrifugationOption = this.postCentrifugationList.get(0);
    this.longTermStorageOption = this.longTermStorageList.get(0);
  }

  @Test
  public void testWithFluidSampleTypeOption() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withFluidSampleType(this.fluidSampleTypeOption).getFluidSampleSprecCode();

    ICodePart fluidSampleTypeCode = fluidSampleCode.getFluidSampleTypeCode();

    assertFalse(fluidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPrimaryContainer() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withPrimaryContainer(this.primaryContainerOption)
            .getFluidSampleSprecCode();

    ICodePart primaryContainerCode = fluidSampleCode.getPrimaryContainerCode();

    assertFalse(primaryContainerCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPreCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withPreCentrifugation(this.preCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherPreCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withOtherPreCentrifugation().getFluidSampleSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownPreCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownPreCentrifugation().getFluidSampleSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withFirstCentrifugation(this.firstCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownFirstCentrifugation().getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withOtherFirstCentrifugation().getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withNoFirstCentrifugation().getFluidSampleSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withSecondCentrifugation(this.secondCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownSecondCentrifugation().getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withOtherSecondCentrifugation().getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withNoSecondCentrifugation().getFluidSampleSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPostCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withOtherFirstCentrifugation()
            .withOtherSecondCentrifugation()
            .withPostCentrifugation(this.postCentrifugationOption)
            .getFluidSampleSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = InvalidPartRelationException.class)
  public void testWithPostCentrifugationWithNoFirstOrSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();

    PostCentrifugationOption postCentrifugationOption =
        new PostCentrifugationOption(
            new NormalPostCentrifugation(
                PostCentrifugationType.DEFAULT,
                PostCentrifugationDelay.LESS_ONE_HOUR,
                PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("A")));

    fluidSampleSprec
        .withNoFirstCentrifugation()
        .withNoSecondCentrifugation()
        .withPostCentrifugation(postCentrifugationOption)
        .getFluidSampleSprecCode();
  }

  @Test
  public void testWithNoApplicablePostCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withNoApplicablePostCentrifugation().getFluidSampleSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test(expected = InvalidPartRelationException.class)
  public void testWithUnknownPostCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();

    fluidSampleSprec
        .withNoFirstCentrifugation()
        .withNoSecondCentrifugation()
        .withUnknownPostCentrifugation()
        .getFluidSampleSprecCode();
  }

  @Test(expected = InvalidPartRelationException.class)
  public void testWithOtherPostCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();

    fluidSampleSprec
        .withNoFirstCentrifugation()
        .withNoSecondCentrifugation()
        .withOtherPostCentrifugation()
        .getFluidSampleSprecCode();
  }

  @Test
  public void testWithLongTermStorage() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withLongTermStorage(this.longTermStorageOption).getFluidSampleSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownLongTermStorage().getFluidSampleSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withOtherLongTermStorage().getFluidSampleSprecCode();

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

    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();

    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withFluidSampleType(this.fluidSampleTypeOption)
            .withPrimaryContainer(this.primaryContainerOption)
            .withPreCentrifugation(this.preCentrifugationOption)
            .withFirstCentrifugation(firstCentrifugationOption)
            .withSecondCentrifugation(secondCentrifugationOption)
            .withPostCentrifugation(this.postCentrifugationOption)
            .withLongTermStorage(this.longTermStorageOption)
            .getFluidSampleSprecCode();

    String code = fluidSampleCode.getCodeString();

    assertFalse(code.isEmpty());
  }

  @Test
  public void withNullOptions() {

    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();

    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withFluidSampleType(null)
            .withPrimaryContainer(null)
            .withPreCentrifugation(null)
            .withFirstCentrifugation(null)
            .withSecondCentrifugation(null)
            .withPostCentrifugation(null)
            .withLongTermStorage(null)
            .getFluidSampleSprecCode();

    String codeString = fluidSampleCode.getCodeString();

    assertFalse(codeString.isEmpty());
  }
}
