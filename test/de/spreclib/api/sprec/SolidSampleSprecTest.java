package de.spreclib.api.sprec;

import static org.junit.Assert.assertFalse;
import de.spreclib.api.lists.ColdIschemiaTimeListProvider;
import de.spreclib.api.lists.ColdIschemiaTimeOption;
import de.spreclib.api.lists.FixationListProvider;
import de.spreclib.api.lists.FixationOption;
import de.spreclib.api.lists.FixationTimeListProvider;
import de.spreclib.api.lists.FixationTimeOption;
import de.spreclib.api.lists.LongTermStorageListProvider;
import de.spreclib.api.lists.LongTermStorageOption;
import de.spreclib.api.lists.SolidSampleTypeListProvider;
import de.spreclib.api.lists.SolidSampleTypeOption;
import de.spreclib.api.lists.TypeOfCollectionListProvider;
import de.spreclib.api.lists.TypeOfCollectionOption;
import de.spreclib.api.lists.WarmIschemiaTimeListProvider;
import de.spreclib.api.lists.WarmIschemiaTimeOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.SolidSprecCode;
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

    this.solidSampleTypeOption = this.solidSampleTypeList.get(0);
    this.typeOfColletionOption = this.typeOfCollectionList.get(0);
    this.warmIschemiaTimeOption = this.warmIschemiaTimeOptionList.get(0);
    this.coldIschemiaTimeOption = this.coldIschmemiaTimeOptionList.get(0);
    this.fixationOption = this.fixationOptionList.get(0);
    this.fixationTimeOption = this.fixationTimeOptionList.get(0);
    this.longTermStorageOption = this.longTermStorageOptionList.get(0);
  }

  @Test
  public void testWithSolidSampleType() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withSolidSampleType(this.solidSampleTypeOption).getSprecCode();

    ICodePart solidSampleTypeCode = solidSprecCode.getSolidSampleTypeCode();

    assertFalse(solidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithTypeOfCollection() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withTypeOfCollection(this.typeOfColletionOption).getSprecCode();

    ICodePart typeOfCollectionCode = solidSprecCode.getTypeOfCollectionCode();

    assertFalse(typeOfCollectionCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithWarmIschemiaTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec
            .withWarmIschemiaTime(this.warmIschemiaTimeOption)
            .getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withUnknownWarmIschemiaTime().getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withOtherWarmIschemiaTime().getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicableWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableWarmIschemiaTime().getSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithColdIschemiaTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec
            .withColdIschemiaTime(this.coldIschemiaTimeOption)
            .getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withUnknownColdIschemiaTime().getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withOtherColdIschemiaTime().getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicableColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableColdIschemiaTime().getSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFixation() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withFixation(this.fixationOption).getSprecCode();

    ICodePart fixationCode = solidSprecCode.getFixationCode();

    assertFalse(fixationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFixationTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withFixationTime(this.fixationTimeOption).getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withUnknownFixationTime().getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withOtherFixationTime().getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicableFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableFixationTime().getSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithLongTerm() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withLongTermStorage(this.longTermStorageOption).getSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withUnknownLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withOtherLongTermStorage().getSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
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

    String codeString = solidSampleCode.getCodeString();

    assertFalse(codeString.isEmpty());
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

    String codeString = solidSampleCode.getCodeString();

    assertFalse(codeString.isEmpty());
  }
}
