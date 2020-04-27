package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.*;
import org.junit.Test;

public class SecondCentrifugationDurationTest {

  @Test
  public void testHasValueShouldReturnTrue() {
    assertTrue(SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(11));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(9));
  }
  
  @Test
  public void testHasValueShouldReturnFalseAbove() {

    assertFalse(SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(16));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(10));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(15));
  }

  @Test
  public void testHasValueNegativeValue() {

    assertFalse(SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(-15));
  }
}
