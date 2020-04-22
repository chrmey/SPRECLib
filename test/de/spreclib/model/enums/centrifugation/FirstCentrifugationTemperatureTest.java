package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.*;
import org.junit.Test;

public class FirstCentrifugationTemperatureTest {

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(FirstCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(20));
  }
  
  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(FirstCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(10));
  }
  
  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(FirstCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(30));
  }
  
  @Test
  public void testHasValueLowerBound() {

    assertTrue(FirstCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(18));
  }
  
  @Test
  public void testHasValueUpperBound() {

    assertTrue(FirstCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(28.999f));
  }
  
  @Test
  public void testHasValueNegativeValue() {

    assertFalse(FirstCentrifugationTemperature.ROOM_TEMPERATURE.hasValue(-28.999f));
  }
}
