package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;

public class ParameterizedCentrifugationTest {

  ParameterizedCentrifugation parameterizedCentrifugation;

  @Before
  public void setUp() {
    parameterizedCentrifugation =
        new ParameterizedCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A"));
  }

  @Test
  public void testGetCentrifugationType() {
    CentrifugationType expected = CentrifugationType.DEFAULT;
    assertEquals(expected, parameterizedCentrifugation.getCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = parameterizedCentrifugation.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testIsDefaultCentrifugation() {
    assertTrue(parameterizedCentrifugation.isParameterizedCentrifugation());
  }
}
