package de.spreclib.model.centrifugation.enums;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
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
