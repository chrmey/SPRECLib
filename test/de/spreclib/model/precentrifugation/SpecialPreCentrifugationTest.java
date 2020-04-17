package de.spreclib.model.precentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.precentrifugation.SpecialPreCentrifugation;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class SpecialPreCentrifugationTest {

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
}
