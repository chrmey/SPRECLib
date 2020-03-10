package de.spreclib.java.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.centrifugation.NormalCentrifugation;
import org.junit.Before;
import org.junit.Test;


public class TestNormalCentrifugation {

  NormalCentrifugation centrifugation;

  @Before
  public void setUp() {
    centrifugation =
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A"),
            SprecPartType.FIRST_CENTRIFUGATION);
  }

  @Test
  public void testGetCentrifugationType() {
    CentrifugationType expected = CentrifugationType.DEFAULT;
    assertEquals(expected, centrifugation.getCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = centrifugation.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.FIRST_CENTRIFUGATION;
    SprecPartType actual = centrifugation.getSprecPartType();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetCentrifugationSpeed() {
    CentrifugationSpeed expected = CentrifugationSpeed.LESS_THREETHOUSAND_G;
    CentrifugationSpeed actual = centrifugation.getCentrifugationSpeed();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetCentrifugationTemperature() {
    CentrifugationTemperature expected = CentrifugationTemperature.ROOM_TEMPERATURE;
    CentrifugationTemperature actual = centrifugation.getCentrifugationTemperature();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetCentrifugationDuration() {
    CentrifugationDuration expected = CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES;
    CentrifugationDuration actual = centrifugation.getCentrifugationDuration();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetCentrifugationBraking() {
    CentrifugationBraking expected = CentrifugationBraking.NO_BRAKING;
    CentrifugationBraking actual = centrifugation.getCentrifugationBraking();
    assertEquals(expected, actual);
  }
}
