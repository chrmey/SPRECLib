package de.spreclib.java.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.precentrifugation.NormalPreCentrifugation;

public class TestNormalPreCentrifugation {

  NormalPreCentrifugation normalPreCentrifugation;

  @Before
  public void setUp() {
    normalPreCentrifugation =
        new NormalPreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A"));
  }

  @Test
  public void testGetPreCentrifugationType() {
    PreCentrifugationType expected = PreCentrifugationType.DEFAULT;
    assertEquals(expected, normalPreCentrifugation.getPreCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = normalPreCentrifugation.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.PRE_CENTRIFUGATION;
    SprecPartType actual = normalPreCentrifugation.getSprecPartType();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetPreCentrifugationDelay() {
    PreCentrifugationDelay expected = PreCentrifugationDelay.LESS_TWO_HOURS;
    PreCentrifugationDelay actual = normalPreCentrifugation.getPreCentrifugationDelay();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetPreCentrifugationTemperature() {
    PreCentrifugationTemperature expected = PreCentrifugationTemperature.ROOM_TEMPERATURE;
    PreCentrifugationTemperature actual = normalPreCentrifugation.getPreCentrifugationTemperature();
    assertEquals(expected, actual);
  }
}
