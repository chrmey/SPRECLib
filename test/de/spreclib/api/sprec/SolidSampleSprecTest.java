package de.spreclib.api.sprec;

import static org.junit.Assert.assertFalse;

import de.spreclib.api.lists.ColdIschemiaTimeListProvider;
import de.spreclib.api.lists.FixationListProvider;
import de.spreclib.api.lists.FixationTimeListProvider;
import de.spreclib.api.lists.LongTermStorageListProvider;
import de.spreclib.api.lists.SolidSampleTypeListProvider;
import de.spreclib.api.lists.TypeOfCollectionListProvider;
import de.spreclib.api.lists.WarmIschemiaTimeListProvider;
import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import de.spreclib.api.lists.options.FixationOption;
import de.spreclib.api.lists.options.FixationTimeOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.SolidSampleTypeOption;
import de.spreclib.api.lists.options.TypeOfCollectionOption;
import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.SolidSprecCode;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SolidSampleSprecTest {

  private ArrayList<SolidSampleTypeOption> solidSampleTypeList;
  private ArrayList<TypeOfCollectionOption> typeOfCollectionList;
  private ArrayList<WarmIschemiaTimeOption> warmIschemiaTimeOptionList;
  private ArrayList<ColdIschemiaTimeOption> coldIschmemiaTimeOptionList;
  private ArrayList<FixationOption> fixationOptionList;
  private ArrayList<FixationTimeOption> fixationTimeOptionList;
  private ArrayList<LongTermStorageOption> longTermStorageOptionList;

  private SolidSampleTypeOption solidSampleTypeOption;
  private TypeOfCollectionOption typeOfColletionOption;
  private WarmIschemiaTimeOption warmIschemiaTimeOption;
  private ColdIschemiaTimeOption coldIschemiaTimeOption;
  private FixationOption fixationOption;
  private FixationTimeOption fixationTimeOption;
  private LongTermStorageOption longTermStorageOption;

  @Before
  public void setUp() {

    this.solidSampleTypeList = SolidSampleTypeListProvider.getList();
    this.typeOfCollectionList = TypeOfCollectionListProvider.getList();
    this.warmIschemiaTimeOptionList = WarmIschemiaTimeListProvider.getList();
    this.coldIschmemiaTimeOptionList = ColdIschemiaTimeListProvider.getList();
    this.fixationOptionList = FixationListProvider.getList();
    this.fixationTimeOptionList = FixationTimeListProvider.getList();
    this.longTermStorageOptionList = LongTermStorageListProvider.getList();

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
        solidSampleSprec.withSolidSampleType(this.solidSampleTypeOption).getSolidSampleSprecCode();

    ICodePart solidSampleTypeCode = solidSprecCode.getSolidSampleTypeCode();

    assertFalse(solidSampleTypeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithTypeOfCollection() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withTypeOfCollection(this.typeOfColletionOption).getSolidSampleSprecCode();

    ICodePart typeOfCollectionCode = solidSprecCode.getTypeOfCollectionCode();

    assertFalse(typeOfCollectionCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithWarmIschemiaTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec
            .withWarmIschemiaTime(this.warmIschemiaTimeOption)
            .getSolidSampleSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withUnknownWarmIschemiaTime().getSolidSampleSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withOtherWarmIschemiaTime().getSolidSampleSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicableWarmIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableWarmIschemiaTime().getSolidSampleSprecCode();

    ICodePart warmIschemiaTimeCode = solidSprecCode.getWarmIschemiaTimeCode();

    assertFalse(warmIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithColdIschemiaTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec
            .withColdIschemiaTime(this.coldIschemiaTimeOption)
            .getSolidSampleSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withUnknownColdIschemiaTime().getSolidSampleSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withOtherColdIschemiaTime().getSolidSampleSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicableColdIschemiaTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableColdIschemiaTime().getSolidSampleSprecCode();

    ICodePart coldIschemiaTimeCode = solidSprecCode.getColdIschemiaTimeCode();

    assertFalse(coldIschemiaTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFixation() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withFixation(this.fixationOption).getSolidSampleSprecCode();

    ICodePart fixationCode = solidSprecCode.getFixationCode();

    assertFalse(fixationCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithFixationTime() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withFixationTime(this.fixationTimeOption).getSolidSampleSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withUnknownFixationTime().getSolidSampleSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withOtherFixationTime().getSolidSampleSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithNoApplicableFixationTime() {

    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

    SolidSprecCode solidSprecCode =
        solidSampleSprec.withNoApplicableFixationTime().getSolidSampleSprecCode();

    ICodePart fixationTimeCode = solidSprecCode.getFixationTimeCode();

    assertFalse(fixationTimeCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithLongTerm() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withLongTermStorage(this.longTermStorageOption).getSolidSampleSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithUnknownLongTermStorage() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withUnknownLongTermStorage().getSolidSampleSprecCode();

    ICodePart longTermStorageCode = solidSampleCode.getLongTermStorageCode();

    assertFalse(longTermStorageCode.getStringRepresentation().isEmpty());
  }

  @Test
  public void testWithOtherLongTermStorage() {
    SolidSampleSprec solidSampleSprec = new SolidSampleSprec();
    SolidSprecCode solidSampleCode =
        solidSampleSprec.withOtherLongTermStorage().getSolidSampleSprecCode();

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
            .getSolidSampleSprecCode();

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
            .getSolidSampleSprecCode();

    String codeString = solidSampleCode.getCodeString();

    assertFalse(codeString.isEmpty());
  }
}
