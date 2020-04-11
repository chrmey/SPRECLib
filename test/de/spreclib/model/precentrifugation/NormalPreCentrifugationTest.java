package de.spreclib.model.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import de.spreclib.model.spreclib.precentrifugation.NormalPreCentrifugation;
import org.junit.Before;
import org.junit.Test;
import nl.jqno.equalsverifier.EqualsVerifier;


public class NormalPreCentrifugationTest {

  NormalPreCentrifugation normalPreCentrifugation;

  @Before
  public void setUp() {
    normalPreCentrifugation =
        new NormalPreCentrifugation(
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
  public void testEquals() {
    EqualsVerifier.forClass(NormalPreCentrifugation.class).withRedefinedSuperclass().verify();
  }
}
