package de.spreclib.model.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.precentrifugation.ParameterizedPreCentrifugation;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;

public class ParameterizedPreCentrifugationTest {

  ParameterizedPreCentrifugation parameterizedPreCentrifugation;

  @Before
  public void setUp() {
    parameterizedPreCentrifugation =
        new ParameterizedPreCentrifugation(
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A"));
  }

  @Test
  public void testGetPreCentrifugationType() {
    PreCentrifugationType expected = PreCentrifugationType.DEFAULT;

    assertEquals(expected, parameterizedPreCentrifugation.getPreCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = parameterizedPreCentrifugation.getCodeFromSprecPart();

    assertEquals(expected, actual);
  }

  @Test
  public void testContainsShouldReturnTrue() {

    assertTrue(
        parameterizedPreCentrifugation.contains(
            PreCentrifugationDelay.LESS_TWO_HOURS, PreCentrifugationTemperature.ROOM_TEMPERATURE));
  }

  @Test
  public void testContainsShouldReturnFalse() {

    assertFalse(
        parameterizedPreCentrifugation.contains(
            PreCentrifugationDelay.LESS_TWO_HOURS, PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES));
  }
}
