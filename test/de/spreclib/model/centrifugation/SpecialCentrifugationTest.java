package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.centrifugation.SpecialCentrifugation;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class SpecialCentrifugationTest {

  SpecialCentrifugation centrifugation;

  @Before
  public void setUp() {
    centrifugation =
        new SpecialCentrifugation(
            CentrifugationType.NO, new CodePart("N"));
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
  public void testIsNormalCentrifugation() {
    assertFalse(centrifugation.isNormalCentrifugation());
  }

  @Test
  public void testIsSpecialCentrifugation() {
    assertTrue(centrifugation.isSpecialCentrifugation());
  }
}
