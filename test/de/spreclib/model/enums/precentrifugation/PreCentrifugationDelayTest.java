package de.spreclib.model.enums.precentrifugation;

import static org.junit.Assert.*;

import org.junit.Test;

public class PreCentrifugationDelayTest {

  @Test
  public void testGetPreCentrifugationDelayWithValidDelay119() {

    PreCentrifugationDelay preCentrifugationDelay =
        PreCentrifugationDelay.valueOf(119);

    assertEquals(PreCentrifugationDelay.LESS_TWO_HOURS, preCentrifugationDelay);
  }

  @Test
  public void testGetPreCentrifugationDelayWithValidDelay120() {

    PreCentrifugationDelay preCentrifugationDelay =
        PreCentrifugationDelay.valueOf(120);

    assertEquals(PreCentrifugationDelay.TWO_TO_FOUR_HOURS, preCentrifugationDelay);
  }

  @Test
  public void testGetPreCentrifugationDelayWithValidDelay3000() {

    PreCentrifugationDelay preCentrifugationDelay =
        PreCentrifugationDelay.valueOf(3000);

    assertEquals(PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS, preCentrifugationDelay);
  }
}
