package de.spreclib.java.longtermstorage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.java.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.longtermstorage.NormalLongTermStorage;
import org.junit.Before;
import org.junit.Test;


public class TestNormalLongTermStorage {

  NormalLongTermStorage normalLongTermStorage;

  @Before
  public void setUp() {
    normalLongTermStorage =
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("A"));
  }

  @Test
  public void testGetLongTermStorageType() {
    LongTermStorageType expected = LongTermStorageType.DEFAULT;
    assertEquals(expected, normalLongTermStorage.getLongTermStorageType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = normalLongTermStorage.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.LONG_TERM_STORAGE;
    SprecPartType actual = normalLongTermStorage.getSprecPartType();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetLongTermStorageContainer() {
    LongTermStorageContainer expected = LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML;
    LongTermStorageContainer actual = normalLongTermStorage.getLongTermStorageContainer();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetLongTermStorageTemperature() {
    LongTermStorageTemperature expected =
        LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES;
    LongTermStorageTemperature actual = normalLongTermStorage.getLongTermStorageTemperature();
    assertEquals(expected, actual);
  }
}
