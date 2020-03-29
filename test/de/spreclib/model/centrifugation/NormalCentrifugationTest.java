package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationDuration;
import de.spreclib.model.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.CodePart;
import de.spreclib.model.spreclib.centrifugation.NormalCentrifugation;
import org.junit.Before;
import org.junit.Test;


public class NormalCentrifugationTest {

  NormalCentrifugation centrifugation;

  @Before
  public void setUp() {
    centrifugation =
        new NormalCentrifugation(
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
