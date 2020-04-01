package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import de.spreclib.model.spreclib.centrifugation.NormalCentrifugation;
import org.junit.Before;
import org.junit.Test;

public class NormalCentrifugationTest {

  NormalCentrifugation centrifugation;

  @Before
  public void setUp() {
    centrifugation =
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
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
  public void testIsNormalCentrifugation() {
    assertTrue(centrifugation.isNormalCentrifugation());
  }

  @Test
  public void testIsSpecialCentrifugation() {
    assertFalse(centrifugation.isSpecialCentrifugation());
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.FIRST_CENTRIFUGATION;
    SprecPartType actual = centrifugation.getSprecPartType();
    assertEquals(expected, actual);
  }
}
