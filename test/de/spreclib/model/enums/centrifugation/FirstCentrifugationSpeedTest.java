package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.assertTrue;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationSpeed;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class FirstCentrifugationSpeedTest {

  @Test
  public void testHasValueShouldReturnTrue() {
	  
    assertTrue(FirstCentrifugationSpeed.LESS_THREETHOUSAND_G.hasValue(2500));
  }
  
  @Test
  public void testHasValueShouldReturnFalse() {
	  
    assertFalse(FirstCentrifugationSpeed.LESS_THREETHOUSAND_G.hasValue(3500));
  }
  
  @Test
  public void testHasValueLowerBound() {
	  
	  assertTrue(FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G.hasValue(3000));
  }
  
  @Test
  public void testHasValueUpperBound() {
	  
	  assertTrue(FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G.hasValue(5999));
  }
  
  @Test
  public void testHasValueUpperBoundIsNull() {
	  
	  assertTrue(FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G.hasValue(15000));
  }
  
  @Test
  public void testHasValueNegativeValue() {
	  
	  assertFalse(FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G.hasValue(-10));
  }
}
