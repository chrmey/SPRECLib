package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.*;
import org.junit.Test;

public class CentrifugationBrakingTest {

  @Test
  public void testHasValueShouldReturnTrue() {
    assertTrue(CentrifugationBraking.WITH_BRAKING.hasValue(true));
  }
}
