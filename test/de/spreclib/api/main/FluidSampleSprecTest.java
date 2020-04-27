package de.spreclib.api.main;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import de.spreclib.api.main.FirstCentrifugationListProvider;
import de.spreclib.api.main.FirstCentrifugationOption;
import de.spreclib.api.main.FluidSampleSprec;
import de.spreclib.api.main.FluidSampleTypeListProvider;
import de.spreclib.api.main.FluidSampleTypeOption;
import de.spreclib.api.main.LongTermStorageListProvider;
import de.spreclib.api.main.LongTermStorageOption;
import de.spreclib.api.main.PostCentrifugationListProvider;
import de.spreclib.api.main.PostCentrifugationOption;
import de.spreclib.api.main.PreCentrifugationListProvider;
import de.spreclib.api.main.PreCentrifugationOption;
import de.spreclib.api.main.PrimaryContainerListProvider;
import de.spreclib.api.main.PrimaryContainerOption;
import de.spreclib.api.main.SecondCentrifugationListProvider;
import de.spreclib.api.main.SecondCentrifugationOption;
import de.spreclib.meta.spreccode.FluidSprecCode;
import de.spreclib.model.interfaces.ICodePart;
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
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withFluidSampleType(this.fluidSampleTypeOption).getSprecCode();

    ICodePart fluidSampleTypeCode = fluidSampleCode.getFluidSampleTypeCode();

    assertFalse(fluidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPrimaryContainer() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withPrimaryContainer(this.primaryContainerOption).getSprecCode();

    ICodePart primaryContainerCode = fluidSampleCode.getPrimaryContainerCode();

    assertFalse(primaryContainerCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithPreCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withPreCentrifugation(this.preCentrifugationOption).getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherPreCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withOtherPreCentrifugation().getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownPreCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withUnknownPreCentrifugation().getSprecCode();

    ICodePart preCentrifugationCode = fluidSampleCode.getPreCentrifugationCode();

    assertFalse(preCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withFirstCentrifugation(this.firstCentrifugationOption).getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownFirstCentrifugation().getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withOtherFirstCentrifugation().getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoFirstCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withNoFirstCentrifugation().getSprecCode();

    ICodePart firstCentrifugationCode = fluidSampleCode.getFirstCentrifugationCode();

    assertFalse(firstCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withSecondCentrifugation(this.secondCentrifugationOption).getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withUnknownSecondCentrifugation().getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withOtherSecondCentrifugation().getSprecCode();

    ICodePart secondCentrifugationCode = fluidSampleCode.getSecondCentrifugationCode();

    assertFalse(secondCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoSecondCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withNoSecondCentrifugation().getSprecCode();

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
            .getSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicablePostCentrifugation() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withNoApplicablePostCentrifugation().getSprecCode();

    ICodePart postCentrifugationCode = fluidSampleCode.getPostCentrifugationCode();

    assertFalse(postCentrifugationCode.getStringRepresentation().isEmpty());
  }


  @Test
  public void testWithLongTermStorage() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode =
        fluidSampleSprec.withLongTermStorage(this.longTermStorageOption).getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withUnknownLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
    FluidSprecCode fluidSampleCode = fluidSampleSprec.withOtherLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = fluidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithAllOptions() {

    FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();

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
            .getSprecCode();

    String codeString = fluidSampleCode.getStringRepresentation();

    assertTrue(codeString.equals("???????????"));
  }
}
