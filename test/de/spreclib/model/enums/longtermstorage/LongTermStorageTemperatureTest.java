package de.spreclib.model.enums.longtermstorage;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
import org.junit.Test;

public class LongTermStorageTemperatureTest {

  @Test
  public void testHasValueShouldReturnTrue() {

    assertTrue(LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES.hasValue(-80));
  }

  @Test
  public void testHasValueShouldReturnFalseBelow() {

    assertFalse(LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES.hasValue(-90));
  }

  @Test
  public void testHasValueShouldReturnFalseBelowAbove() {

    assertFalse(LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES.hasValue(-50));
  }

  @Test
  public void testHasValueLowerBound() {

    assertTrue(LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES.hasValue(-85.9999f));
  }

  @Test
  public void testHasValueUpperBound() {

    assertTrue(LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES.hasValue(-59.1111f));
  }

}
