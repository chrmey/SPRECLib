package de.spreclib.model.enums;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ColdIschemiaTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      assertNotNull(coldIschemiaTime.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {

    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      assertTrue(ColdIschemiaTime.contains(coldIschemiaTime));
    }
  }

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(ColdIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(5));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(ColdIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(1));
  }

  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(ColdIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(15));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(ColdIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(2));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(ColdIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(9));
  }

  @Test
  public void testHasValueUpperBoundIsNull() {

    assertTrue(ColdIschemiaTime.GREATER_SIXTY_MINUTES.hasValue(100));
  }

  @Test
  public void testHasValueNegativeValue() {

    assertFalse(ColdIschemiaTime.TWO_TO_TEN_MINUTES.hasValue(-10));
  }
}
