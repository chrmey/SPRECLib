package de.spreclib.model.centrifugation.enums;

import static org.junit.Assert.*;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationTemperature;
import org.junit.Test;

public class SecondCentrifugationTemperatureTest {

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(SecondCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(20));
  }
  
  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(SecondCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(10));
  }
  
  @Test
  public void testHasValueShouldReturnFalseAbove() {

    assertFalse(SecondCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(30));
  }
  
  @Test
  public void testHasValueLowerBound() {

    assertTrue(SecondCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(18));
  }
  
  @Test
  public void testHasValueUpperBound() {

    assertTrue(SecondCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(28.999f));
  }
  
  @Test
  public void testHasValueNegativeValue() {

    assertFalse(SecondCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(-28.999f));
  }
}
