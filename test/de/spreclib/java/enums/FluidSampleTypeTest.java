package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;
import org.junit.Test;


public class FluidSampleTypeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = FluidSampleType.ASCITIES_FLUID.getCodeFromSprecPart();
    ICodePart expected = new CodePart("ASC");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = FluidSampleType.ASCITIES_FLUID;
    assertEquals(SprecPartType.FLUID_SAMPLE_TYPE, sprecPartType.getSprecPartType());
  }
}
