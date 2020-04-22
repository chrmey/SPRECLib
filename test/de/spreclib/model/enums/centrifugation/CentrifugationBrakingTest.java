package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CentrifugationBrakingTest {

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(CentrifugationBraking.WITH_BRAKING.hasValue(true));
  }

  @Test
  public void testHasValueShouldReturnFalse() {

    assertFalse(CentrifugationBraking.WITH_BRAKING.hasValue(false));
  }
}
