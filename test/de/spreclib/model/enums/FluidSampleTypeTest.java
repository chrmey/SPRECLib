package de.spreclib.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;
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
