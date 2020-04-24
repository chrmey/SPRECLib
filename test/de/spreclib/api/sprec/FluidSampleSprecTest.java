package de.spreclib.api.sprec;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.spreclib.api.lists.FirstCentrifugationListProvider;
import de.spreclib.api.lists.FirstCentrifugationOption;
import de.spreclib.api.lists.FluidSampleTypeListProvider;
import de.spreclib.api.lists.FluidSampleTypeOption;
import de.spreclib.api.lists.LongTermStorageListProvider;
import de.spreclib.api.lists.LongTermStorageOption;
import de.spreclib.api.lists.PostCentrifugationListProvider;
import de.spreclib.api.lists.PostCentrifugationOption;
import de.spreclib.api.lists.PreCentrifugationListProvider;
import de.spreclib.api.lists.PreCentrifugationOption;
import de.spreclib.api.lists.PrimaryContainerListProvider;
import de.spreclib.api.lists.PrimaryContainerOption;
import de.spreclib.api.lists.SecondCentrifugationListProvider;
import de.spreclib.api.lists.SecondCentrifugationOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.FluidSprecCode;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FluidSampleSprecTest {

  private List<FluidSampleTypeOption> fluidSampleTypeList;
  private List<PrimaryContainerOption> primaryContainerList;
  private List<PreCentrifugationOption> preCentrifugationList;
  private List<FirstCentrifugationOption> firstCentrifugationList;
  private List<SecondCentrifugationOption> secondCentrifugationList;
  private List<PostCentrifugationOption> postCentrifugationList;
  private List<LongTermStorageOption> longTermStorageList;

  private FluidSampleTypeOption fluidSampleTypeOption;
  private PrimaryContainerOption primaryContainerOption;
  private PreCentrifugationOption preCentrifugationOption;
  private FirstCentrifugationOption firstCentrifugationOption;
  private SecondCentrifugationOption secondCentrifugationOption;
  private PostCentrifugationOption postCentrifugationOption;
  private LongTermStorageOption longTermStorageOption;

  @Before
  public void setUp() {

    this.fluidSampleTypeList = new FluidSampleTypeListProvider().getList();
    this.primaryContainerList = new PrimaryContainerListProvider().getList();
    this.preCentrifugationList = new PreCentrifugationListProvider().getList();
    this.firstCentrifugationList = new FirstCentrifugationListProvider().getList();
    this.secondCentrifugationList = new SecondCentrifugationListProvider().getList();
    this.postCentrifugationList = new PostCentrifugationListProvider().getList();
    this.longTermStorageList = new LongTermStorageListProvider().getList();

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
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withFluidSampleType(this.fluidSampleTypeOption).getSprecCode();

    ICodePart fluidSampleTypeCode = fluidSampleCode.getFluidSampleTypeCode();

    assertFalse(fluidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPrimaryContainer() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withPrimaryContainer(this.primaryContainerOption).getSprecCode();

    ICodePart primaryContainerCode = fluidSampleCode.getPrimaryContainerCode();

    assertFalse(primaryContainerCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPreCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withPreCentrifugation(this.preCentrifugationOption).getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherPreCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withOtherPreCentrifugation().getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownPreCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withUnknownPreCentrifugation().getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFirstCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withFirstCentrifugation(this.firstCentrifugationOption).getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownFirstCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownFirstCentrifugation().getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFirstCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withOtherFirstCentrifugation().getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoFirstCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withNoFirstCentrifugation().getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithSecondCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withSecondCentrifugation(this.secondCentrifugationOption).getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownSecondCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownSecondCentrifugation().getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherSecondCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withOtherSecondCentrifugation().getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoSecondCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withNoSecondCentrifugation().getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }


  @Test
  public void testWithPostCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withOtherFirstCentrifugation()
            .withOtherSecondCentrifugation()
            .withPostCentrifugation(this.postCentrifugationOption)
            .getSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicablePostCentrifugation() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withNoApplicablePostCentrifugation().getSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }


  @Test
  public void testWithLongTermStorage() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withLongTermStorage(this.longTermStorageOption).getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withUnknownLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withOtherLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithAllOptions() {

    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();

    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withFluidSampleType(this.fluidSampleTypeOption)
            .withPrimaryContainer(this.primaryContainerOption)
            .withPreCentrifugation(this.preCentrifugationOption)
            .withOtherFirstCentrifugation()
            .withOtherSecondCentrifugation()
            .withPostCentrifugation(this.postCentrifugationOption)
            .withLongTermStorage(this.longTermStorageOption)
            .getSprecCode();

    String code = fluidSampleCode.getStringRepresentation();

    assertFalse(code.isEmpty());
  }

  @Test
  public void withNullOptions() {

    FluidSampleBuilder fluidSampleSprec = new FluidSampleBuilder();

    FluidSprecCode fluidSampleCode =
        fluidSampleSprec
            .withFluidSampleType(null)
            .withPrimaryContainer(null)
            .withPreCentrifugation(null)
            .withFirstCentrifugation(null)
            .withSecondCentrifugation(null)
            .withPostCentrifugation(null)
            .withLongTermStorage(null)
            .getSprecCode();

    String codeString = fluidSampleCode.getStringRepresentation();

    assertTrue(codeString.equals("???????????"));
  }
}
