package de.spreclib.model.enums;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FluidSampleTypeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (FluidSampleType fluidSampleType : FluidSampleType.values()) {
      assertNotNull(fluidSampleType.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {
    for (FluidSampleType fluidSampleType : FluidSampleType.values()) {
      assertTrue(FluidSampleType.contains(fluidSampleType));
    }
  }
  
}
