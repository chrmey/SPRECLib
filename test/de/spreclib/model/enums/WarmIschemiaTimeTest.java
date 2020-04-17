package de.spreclib.model.enums;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WarmIschemiaTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      assertNotNull(warmIschemiaTime.getCodeFromSprecPart());
    }
  }

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(WarmIschemiaTime.LESS_TWO_MINUTES.hasValue(1));
  }

  @Test
  public void testContains() {
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      assertTrue(WarmIschemiaTime.contains(warmIschemiaTime));
    }
  }
}
