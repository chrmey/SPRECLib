package de.spreclib.model.enums;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.solidsampletype.SolidSampleType;
import org.junit.Test;

public class SolidSampleTypeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (SolidSampleType solidSampleType : SolidSampleType.values()) {
      assertNotNull(solidSampleType.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {
    for (SolidSampleType solidSampleType : SolidSampleType.values()) {
      assertTrue(SolidSampleType.contains(solidSampleType));
    }
  }
}
