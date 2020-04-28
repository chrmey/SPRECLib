package de.spreclib.model.enums.postcentrifugation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationTemperature;
import org.junit.Test;

public class PostCentrifugationTemperatureTest {

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(PostCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(20));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(
        PostCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(-15));
  }

  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(
        PostCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(30));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(
        PostCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(18));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(
        PostCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(28.999f));
  }
}
