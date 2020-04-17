package de.spreclib.model.enums;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ColdIschemiaTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      assertNotNull(coldIschemiaTime.getCodeFromSprecPart());
    }
  }

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(ColdIschemiaTime.LESS_TWO_MINUTES.hasValue(1));
  }

  @Test
  public void testContains() {

    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      assertTrue(ColdIschemiaTime.contains(coldIschemiaTime));
    }
  }
}
