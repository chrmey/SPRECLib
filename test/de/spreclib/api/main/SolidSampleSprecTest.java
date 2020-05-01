package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;

import de.spreclib.meta.spreccode.SolidSprecCode;
import de.spreclib.model.interfaces.ICodePart;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SolidSampleSprecTest {

  private List<SolidSampleTypeOption> solidSampleTypeList;
  private List<TypeOfCollectionOption> typeOfCollectionList;
  private List<WarmIschemiaTimeOption> warmIschemiaTimeOptionList;
  private List<ColdIschemiaTimeOption> coldIschmemiaTimeOptionList;
  private List<FixationOption> fixationOptionList;
  private List<FixationTimeOption> fixationTimeOptionList;
  private List<LongTermStorageOption> longTermStorageOptionList;

  private SolidSampleTypeOption solidSampleTypeOption;
  private TypeOfCollectionOption typeOfColletionOption;
  private WarmIschemiaTimeOption warmIschemiaTimeOption;
  private ColdIschemiaTimeOption coldIschemiaTimeOption;
  private FixationOption fixationOption;
  private FixationTimeOption fixationTimeOption;
  private LongTermStorageOption longTermStorageOption;

  @Before
  public void setUp() {

    this.solidSampleTypeList = new SolidSampleTypeListProvider().getList();
    this.typeOfCollectionList = new TypeOfCollectionListProvider().getList();
    this.warmIschemiaTimeOptionList = new WarmIschemiaTimeListProvider().getList();
    this.coldIschmemiaTimeOptionList = new ColdIschemiaTimeListProvider().getList();
    this.fixationOptionList = new FixationListProvider().getList();
    this.fixationTimeOptionList = new FixationTimeListProvider().getList();
    this.longTermStorageOptionList = new LongTermStorageListProvider().getList();

    this.solidSampleTypeOption = this.solidSampleTypeList.get(2);
    this.typeOfColletionOption = this.typeOfCollectionList.get(3);
    this.warmIschemiaTimeOption = this.warmIschemiaTimeOptionList.get(4);
    this.coldIschemiaTimeOption = this.coldIschmemiaTimeOptionList.get(5);
    this.fixationOption = this.fixationOptionList.get(3);
    this.fixationTimeOption = this.fixationTimeOptionList.get(2);
    this.longTermStorageOption = this.longTermStorageOptionList.get(4);
  }

  @Test
  public void testWithSolidSampleType() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withSolidSampleType(this.solidSampleTypeOption).getSprecCode();

    ICodePart solidSampleTypeCode = solidSprecCode.getSolidSampleTypeCode();

    assertEquals("FNA", solidSampleTypeCode.getStringRepresentation());
  }

  @Test
  public void testWithTypeOfCollection() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withTypeOfCollection(this.typeOfColletionOption).getSprecCode();

    ICodePart typeOfCollectionCode = solidSprecCode.getTypeOfCollectionCode();

    assertEquals("A48", typeOfCollectionCode.getStringRepresentation());
  }

  @Test
  public void testWithWarmIschemiaTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withWarmIschemiaTime(this.warmIschemiaTimeOption).getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertEquals("E", warmIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithUnknownWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withUnknownWarmIschemiaTime().getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertEquals("X", warmIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithOtherWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withOtherWarmIschemiaTime().getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertEquals("Z", warmIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithNoApplicableWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableWarmIschemiaTime().getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertEquals("N", warmIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithColdIschemiaTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withColdIschemiaTime(this.coldIschemiaTimeOption).getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertEquals("F", coldIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithUnknownColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withUnknownColdIschemiaTime().getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertEquals("X", coldIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithOtherColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withOtherColdIschemiaTime().getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertEquals("Z", coldIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithNoApplicableColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableColdIschemiaTime().getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertEquals("N", coldIschemiaTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithFixation() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withFixation(this.fixationOption).getSprecCode();

    ICodePart fixationCode = solidSprecCode.getFixationCode();

    assertEquals("ETH", fixationCode.getStringRepresentation());
  }

  @Test
  public void testWithFixationTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withFixationTime(this.fixationTimeOption).getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertEquals("C", fixationTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithUnknownFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withUnknownFixationTime().getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertEquals("X", fixationTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithOtherFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withOtherFixationTime().getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertEquals("Z", fixationTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithNoApplicableFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode = solidSampleSprec.withNoApplicableFixationTime().getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertEquals("N", fixationTimeCode.getStringRepresentation());
  }

  @Test
  public void testWithLongTerm() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withLongTermStorage(this.longTermStorageOption).getSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertEquals("V", longTermStorageCode.getStringRepresentation());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode = solidSampleSprec.withUnknownLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertEquals("X", longTermStorageCode.getStringRepresentation());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode = solidSampleSprec.withOtherLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertEquals("Z", longTermStorageCode.getStringRepresentation());
  }

  @Test
  public void testWithAllOptions() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSampleCode =
        solidSampleSprec
            .withSolidSampleType(this.solidSampleTypeOption)
            .withTypeOfCollection(this.typeOfColletionOption)
            .withWarmIschemiaTime(this.warmIschemiaTimeOption)
            .withColdIschemiaTime(this.coldIschemiaTimeOption)
            .withFixation(this.fixationOption)
            .withFixationTime(this.fixationTimeOption)
            .withLongTermStorage(this.longTermStorageOption)
            .getSprecCode();

    String codeString = solidSampleCode.getStringRepresentation();

    assertEquals("FNAA48EFETHCV", codeString);
  }

  @Test
  public void testWithNullOptions() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSampleCode =
        solidSampleSprec
            .withSolidSampleType(null)
            .withTypeOfCollection(null)
            .withWarmIschemiaTime(null)
            .withColdIschemiaTime(null)
            .withFixation(null)
            .withFixationTime(null)
            .withLongTermStorage(null)
            .getSprecCode();

    String codeString = solidSampleCode.getStringRepresentation();

    assertEquals("???????????", codeString);
  }
}
