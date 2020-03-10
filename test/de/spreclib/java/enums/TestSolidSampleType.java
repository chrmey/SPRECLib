package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;
import org.junit.Test;


public class TestSolidSampleType {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = SolidSampleType.FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN.getCodeFromSprecPart();
    ICodePart expected = new CodePart("CEN");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = SolidSampleType.FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN;
    assertEquals(SprecPartType.SOLID_SAMPLE_TYPE, sprecPartType.getSprecPartType());
  }
}
