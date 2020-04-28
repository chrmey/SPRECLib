package de.spreclib.model.enums;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.warmischemiatime.WarmIschemiaTime;
import org.junit.Test;

public class WarmIschemiaTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      assertNotNull(warmIschemiaTime.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      assertTrue(WarmIschemiaTime.contains(warmIschemiaTime));
    }
  }

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(WarmIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(5));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(WarmIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(1));
  }

  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(WarmIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(15));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(WarmIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(2));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(WarmIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(9));
  }

  @Test
  public void testHasValueUpperBoundIsNull() {

    assertTrue(WarmIschemiaTime.GREATER_SIXTY_MINUTES.hasValue(100));
  }

  @Test
  public void testHasValueNegativeValue() {

    assertFalse(WarmIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(-10));
  }
}
