package de.spreclib.model.fluidsampletype;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.fluidsampletype.FluidSampleType;
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
