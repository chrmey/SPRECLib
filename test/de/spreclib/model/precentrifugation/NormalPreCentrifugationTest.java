package de.spreclib.model.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.precentrifugation.ParameterizedPreCentrifugation;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class NormalPreCentrifugationTest {

  ParameterizedPreCentrifugation normalPreCentrifugation;

  @Before
  public void setUp() {
    normalPreCentrifugation =
        new ParameterizedPreCentrifugation(
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
}
