package de.spreclib.model.enums.postcentrifugation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PostCentrifugationDelayTest {

	  @Test
	  public void testHasValueShouldReturnTrue() {
	    assertTrue(PostCentrifugationDelay.ONE_TO_TWO_HOURS.hasValue(70));
	  }

	  @Test
	  public void testHasValueShouldReturnFalseBelow() {

	    assertFalse(PostCentrifugationDelay.ONE_TO_TWO_HOURS.hasValue(30));
	  }
	  
	  @Test
	  public void testHasValueShouldReturnFalseAbove() {

	    assertFalse(PostCentrifugationDelay.ONE_TO_TWO_HOURS.hasValue(130));
	  }

	  @Test
	  public void testHasValueLowerBound() {

	    assertTrue(PostCentrifugationDelay.ONE_TO_TWO_HOURS.hasValue(60));
	  }

	  @Test
	  public void testHasValueUpperBound() {

	    assertTrue(PostCentrifugationDelay.ONE_TO_TWO_HOURS.hasValue(119));
	  }

	  @Test
	  public void testHasValueUpperBoundIsNull() {
		  
		  assertTrue(PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS.hasValue(2000));
	  }
	  
	  @Test
	  public void testHasValueNegativeValue() {

	    assertFalse(PostCentrifugationDelay.ONE_TO_TWO_HOURS.hasValue(-15));
	  }
}
