package de.spreclib.java.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.centrifugation.SpecialCentrifugation;
import org.junit.Before;
import org.junit.Test;


public class SpecialCentrifugationTest {

  SpecialCentrifugation centrifugation;

  @Before
  public void setUp() {
    centrifugation =
        new SpecialCentrifugation(
            CentrifugationType.NO, new CodePart("N"), SprecPartType.FIRST_CENTRIFUGATION);
  }

  @Test
  public void testGetCentrifugationType() {
    CentrifugationType expected = CentrifugationType.NO;
    assertEquals(expected, centrifugation.getCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("N");
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
}
