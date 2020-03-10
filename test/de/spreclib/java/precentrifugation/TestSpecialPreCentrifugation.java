package de.spreclib.java.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.precentrifugation.SpecialPreCentrifugation;
import org.junit.Before;
import org.junit.Test;


public class TestSpecialPreCentrifugation {

  SpecialPreCentrifugation specialPreCentrifugation;

  @Before
  public void setUp() {
    specialPreCentrifugation =
        new SpecialPreCentrifugation(PreCentrifugationType.OTHER, new CodePart("Z"));
  }

  @Test
  public void testGetLongTermStorageType() {
    PreCentrifugationType expected = PreCentrifugationType.OTHER;
    assertEquals(expected, specialPreCentrifugation.getPreCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("Z");
    ICodePart actual = specialPreCentrifugation.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.PRE_CENTRIFUGATION;
    SprecPartType actual = specialPreCentrifugation.getSprecPartType();
    assertEquals(expected, actual);
  }
}
