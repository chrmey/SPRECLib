package de.spreclib.model.enums.precentrifugation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;
import org.junit.Test;

public class PreCentrifugationTemperatureTest {

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(PreCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(20));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(PreCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(-15));
  }

  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(PreCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(30));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(PreCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(18));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(PreCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(28.999f));
  }
}
