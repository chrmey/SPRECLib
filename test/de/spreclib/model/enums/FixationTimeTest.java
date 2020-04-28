package de.spreclib.model.enums;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.fixationtime.FixationTime;
import org.junit.Test;

public class FixationTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (FixationTime fixationTime : FixationTime.values()) {

      assertNotNull(fixationTime.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {
    for (FixationTime fixationTime : FixationTime.values()) {
      assertTrue(FixationTime.contains(fixationTime));
    }
  }

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(FixationTime.FIFTEEN_MINUTES_TO_ONE_HOUR.hasValue(20));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(FixationTime.FIFTEEN_MINUTES_TO_ONE_HOUR.hasValue(5));
  }

  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(FixationTime.FIFTEEN_MINUTES_TO_ONE_HOUR.hasValue(70));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(FixationTime.FIFTEEN_MINUTES_TO_ONE_HOUR.hasValue(15));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(FixationTime.FIFTEEN_MINUTES_TO_ONE_HOUR.hasValue(59));
  }

  @Test
  public void testHasValueNegativeValue() {

    assertFalse(FixationTime.FIFTEEN_MINUTES_TO_ONE_HOUR.hasValue(-10));
  }
}
