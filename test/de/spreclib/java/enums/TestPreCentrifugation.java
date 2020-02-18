package de.spreclib.java.enums;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;

class TestPreCentrifugation {

  @Test
  void shouldReturnCorrectTemperature() {
    PreCentrifugationTemperature temp =
        PreCentrifugationTemperature.getPreCentrifugationTemperature(2);
    assertEquals(temp, PreCentrifugationTemperature.TWO_TO_TEN_DEGREES);
  }

  @Test
  void shouldReturnNullTemperature() {
    PreCentrifugationTemperature temp =
        PreCentrifugationTemperature.getPreCentrifugationTemperature(-1);
    assertNull(temp);
  }

  @Test
  void shouldReturnNullTemperature2() {
    PreCentrifugationTemperature temp =
        PreCentrifugationTemperature.getPreCentrifugationTemperature(39);
    assertNull(temp);
  }

  @Test
  void shouldReturnCorrectDelay() {
    PreCentrifugationDelay delay = PreCentrifugationDelay.getPreCentrifugationDelay(0);
    assertEquals(delay, PreCentrifugationDelay.LESS_TWO_HOURS);
  }

  @Test
  void shouldReturnCorrectDelay2() {
    PreCentrifugationDelay delay = PreCentrifugationDelay.getPreCentrifugationDelay(2);
    assertEquals(delay, PreCentrifugationDelay.TWO_TO_FOUR_HOURS);
  }

  @Test
  void shouldReturnNullDelay() {
    PreCentrifugationDelay delay = PreCentrifugationDelay.getPreCentrifugationDelay(-1);
    assertNull(delay);
  }
}
