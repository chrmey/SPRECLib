package de.spreclib.model.enums;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FixationTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (Fixation fixation : Fixation.values()) {
      assertNotNull(fixation.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {
    for (Fixation fixation : Fixation.values()) {
      assertTrue(Fixation.contains(fixation));
    }
  }
}
