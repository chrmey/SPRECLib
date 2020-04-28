package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.*;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationDuration;
import org.junit.Test;

public class FirstCentrifugationDurationTest {

  @Test
  public void testHasValueShouldReturnTrue() {
    assertTrue(FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(11));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(9));
  }
  

  @Test
  public void testHasValueShouldReturnFalseAbove() {

    assertFalse(FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(16));
  }
  
  @Test
  public void testHasValueLowerBound() {

    assertTrue(FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(10));
  }
  
  @Test
  public void testHasValueUpperBound() {

    assertTrue(FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(15));
  }
  
  
  @Test
  public void testHasValueNegativeValue() {

    assertFalse(FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES.hasValue(-15));
  }
}
