package de.spreclib.model.longtermstorage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
import de.spreclib.model.longtermstorage.enums.LongTermStorageType;
import de.spreclib.model.sprec.CodePart;
import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Before;
import org.junit.Test;

public class ParameterizedLongTermStorageTest {

  ParameterizedLongTermStorage parameterizedLongTermStorage;

  @Before
  public void setUp() {
    parameterizedLongTermStorage =
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("A"));
  }

  @Test
  public void testGetLongTermStorageType() {
    LongTermStorageType expected = LongTermStorageType.DEFAULT;

    assertEquals(expected, parameterizedLongTermStorage.getLongTermStorageType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = parameterizedLongTermStorage.getCodeFromSprecFactor();

    assertEquals(expected, actual);
  }

  @Test
  public void testGetLongTermStorageContainer() {
    LongTermStorageContainer expected = LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML;
    LongTermStorageContainer actual = parameterizedLongTermStorage.getLongTermStorageContainer();

    assertEquals(expected, actual);
  }

  @Test
  public void testGetLongTermStorageTemperature() {
    LongTermStorageTemperature expected =
        LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES;
    LongTermStorageTemperature actual =
        parameterizedLongTermStorage.getLongTermStorageTemperature();

    assertEquals(expected, actual);
  }

  @Test
  public void testContainsShouldReturnTrue() {

    assertTrue(
        parameterizedLongTermStorage.contains(
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES));
  }
  
  @Test
  public void testContainsShouldReturnFalse() {

    assertFalse(
        parameterizedLongTermStorage.contains(
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.ROOM_TEMPERATURE));
  }

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(ParameterizedLongTermStorage.class).withRedefinedSuperclass().verify();
  }
}
