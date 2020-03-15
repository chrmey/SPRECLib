package de.spreclib.java.longtermstorage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.spreclib.CodePart;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import de.spreclib.model.spreclib.longtermstorage.NormalLongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.SpecialLongTermStorage;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;


public class LongTermStorageListTest {

  Set<LongTermStorage> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(new SpecialLongTermStorage(LongTermStorageType.UNKNOWN, new CodePart("X")));
    testList.add(new SpecialLongTermStorage(LongTermStorageType.OTHER, new CodePart("Z")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("A")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("B")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("V")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("C")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("D")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.PROGRAMMBLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("E")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PLASTIC_CRYOSTRAW,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("F")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("G")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("H")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.PROGRAMMBLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("G")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_GREATER_FIVE_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("J")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_GREATER_FIVE_ML,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("K")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.MICROPLATE,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("L")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.MICROPLATE,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("M")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature
                .LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("N")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature
                .LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("O")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PARAFFIN_BLOCK,
            LongTermStorageTemperature.ROOM_TEMPERATURE,
            new CodePart("P")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PARAFFIN_BLOCK,
            LongTermStorageTemperature.TWO_TO_TEN_DEGRESS,
            new CodePart("P")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.BAG,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("Q")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.DRY_TECHNOLOGY_MEDIUM,
            LongTermStorageTemperature.ROOM_TEMPERATURE,
            new CodePart("R")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("S")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("T")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("W")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.ORIGINAL_PRIMARY_CONTAINER,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("Y")));
    testList.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.ORIGINAL_PRIMARY_CONTAINER,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("Y")));
  }

  @Test
  public void testLongTermStorageListSize() {
    int actualSize = LongTermStorageList.LONG_TERM_STORAGES.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testLongTermStorageListContents() {
    for (LongTermStorage longTermStorage : testList) {
      assertTrue(LongTermStorageList.LONG_TERM_STORAGES.contains(longTermStorage));
    }
  }

  @Test
  public void testLongTermStorageListContentTypes() {
    int expectedNormalLongTermStorages = 0;
    int expectedSpecialLongTermStorages = 0;
    int actualNormalLongTermStorages = 0;
    int actualSpecialLongTermStorages = 0;

    for (LongTermStorage longTermStorage : testList) {
      if (longTermStorage instanceof SpecialLongTermStorage) {
        expectedSpecialLongTermStorages++;
      }
      if (longTermStorage instanceof NormalLongTermStorage) {
        expectedNormalLongTermStorages++;
      }
    }

    for (LongTermStorage longTermStorage : LongTermStorageList.LONG_TERM_STORAGES) {
      if (longTermStorage instanceof SpecialLongTermStorage) {
        actualSpecialLongTermStorages++;
      }
      if (longTermStorage instanceof NormalLongTermStorage) {
        actualNormalLongTermStorages++;
      }
    }
    assertEquals(expectedNormalLongTermStorages, actualNormalLongTermStorages);
    assertEquals(expectedSpecialLongTermStorages, actualSpecialLongTermStorages);
  }
}
