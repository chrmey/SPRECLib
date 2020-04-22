package de.spreclib.model.enums.centrifugation;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import org.junit.Test;

public class SecondCentrifugationSpeedTest {

  @Test
  public void testHasValueShouldReturnTrue() {
	  
    assertTrue(SecondCentrifugationSpeed.LESS_THREETHOUSAND_G.hasValue(2500));
  }
  
  @Test
  public void testHasValueShouldReturnFalse() {
	  
    assertFalse(SecondCentrifugationSpeed.LESS_THREETHOUSAND_G.hasValue(3500));
  }
  
  @Test
  public void testHasValueLowerBound() {
	  
	  assertTrue(SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G.hasValue(3000));
  }
  
  @Test
  public void testHasValueUpperBound() {
	  
	  assertTrue(SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G.hasValue(5999));
  }
  
  @Test
  public void testHasValueUpperBoundIsNull() {
	  
	  assertTrue(SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G.hasValue(15000));
  }
  
  @Test
  public void testHasValueNegativeValue() {
	  
	  assertFalse(SecondCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G.hasValue(-10));
  }
}
