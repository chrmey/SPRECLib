package de.spreclib.model.enums.precentrifugation;

import static org.junit.Assert.*;
import de.spreclib.model.exceptions.InvalidTemperatureValueException;
import org.junit.Test;

public class PreCentrifugationTemperatureTest {

  @Test
  public void testGetPreCentrifugationTemperatureWithValidTemperature3() {

    PreCentrifugationTemperature preCentrifugationTemperature =
        PreCentrifugationTemperature.valueOf(3f);

    assertEquals(PreCentrifugationTemperature.TWO_TO_TEN_DEGREES, preCentrifugationTemperature);
  }

  @Test
  public void testGetPreCentrifugationTemperatureWithValidTemperature9point3() {

    PreCentrifugationTemperature preCentrifugationTemperature =
        PreCentrifugationTemperature.valueOf(9.3f);

    assertEquals(PreCentrifugationTemperature.TWO_TO_TEN_DEGREES, preCentrifugationTemperature);
  }

  @Test
  public void testGetPreCentrifugationTemperatureWithValidTemperature18() {

    PreCentrifugationTemperature preCentrifugationTemperature =
        PreCentrifugationTemperature.valueOf(18f);

    assertEquals(PreCentrifugationTemperature.ROOM_TEMPERATURE, preCentrifugationTemperature);
  }

  @Test(expected = InvalidTemperatureValueException.class)
  public void testGetPreCentrifugationTemperatureWithNoValidTemperature() {

    PreCentrifugationTemperature.valueOf(11f);
  }
}
