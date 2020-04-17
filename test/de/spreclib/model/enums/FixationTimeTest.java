package de.spreclib.model.enums;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FixationTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (FixationTime fixationTime : FixationTime.values()) {

      assertNotNull(FixationTime.contains(fixationTime));
    }
  }

  @Test
  public void testHasValueFor() {

    assertTrue(FixationTime.LESS_FIFTEEN_MINUTES.hasValue(14));
  }

  @Test
  public void testContains() {
    for (FixationTime fixationTime : FixationTime.values()) {
      assertTrue(FixationTime.contains(fixationTime));
    }
  }
}
