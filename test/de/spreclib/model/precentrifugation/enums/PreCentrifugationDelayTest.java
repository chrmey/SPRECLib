package de.spreclib.model.precentrifugation.enums;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import org.junit.Test;

public class PreCentrifugationDelayTest {

	  @Test
	  public void testHasValueShouldReturnTrue() {
	    assertTrue(PreCentrifugationDelay.TWO_TO_FOUR_HOURS.hasValue(140));
	  }

	  @Test
	  public void testHasValueShouldReturnFalseBelow() {

	    assertFalse(PreCentrifugationDelay.TWO_TO_FOUR_HOURS.hasValue(30));
	  }
	  
	  @Test
	  public void testHasValueShouldReturnFalseAbove() {

	    assertFalse(PreCentrifugationDelay.TWO_TO_FOUR_HOURS.hasValue(2600));
	  }

	  @Test
	  public void testHasValueLowerBound() {

	    assertTrue(PreCentrifugationDelay.TWO_TO_FOUR_HOURS.hasValue(120));
	  }

	  @Test
	  public void testHasValueUpperBound() {

	    assertTrue(PreCentrifugationDelay.TWO_TO_FOUR_HOURS.hasValue(239));
	  }

	  @Test
	  public void testHasValueUpperBoundIsNull() {
		  
		  assertTrue(PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS.hasValue(3000));
	  }
	  
	  @Test
	  public void testHasValueNegativeValue() {

	    assertFalse(PreCentrifugationDelay.TWO_TO_FOUR_HOURS.hasValue(-15));
	  }
}
