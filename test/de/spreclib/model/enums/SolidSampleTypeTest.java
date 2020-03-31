package de.spreclib.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.SolidSampleType;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Test;


public class SolidSampleTypeTest {

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
