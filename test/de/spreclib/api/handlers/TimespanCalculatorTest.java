package de.spreclib.api.handlers;

import static org.junit.Assert.assertEquals;
import de.spreclib.api.exceptions.InvalidTimestampRelationException;
import de.spreclib.api.exceptions.NegativeTimestampException;
import de.spreclib.api.parameters.TimespanCalculator;
import org.junit.Test;

public class TimespanCalculatorTest {

  @Test
  public void testWithValidTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    TimespanCalculator timestampCalculator = new TimespanCalculator(startTime, fifteenMinutesLater);

    int delayMinutes = timestampCalculator.getDelayMinutes();

    assertEquals(15, delayMinutes);
  }

  @Test(expected = InvalidTimestampRelationException.class)
  public void testWithNoValidTimestamps() {

    long timestamp1 = 1577837700000L;
    long timestampEqualTimestamp1 = 1577837700000L;

    new TimespanCalculator(timestamp1, timestampEqualTimestamp1);
  }

  @Test(expected = InvalidTimestampRelationException.class)
  public void testWithTimestamp1AfterTimestamp2ValidTimestamps() {

    long timestamp1 = 1577837800000L;
    long beforeTimestamp1 = 1577837700000L;

    new TimespanCalculator(timestamp1, beforeTimestamp1);
  }

  @Test(expected = NegativeTimestampException.class)
  public void testWithNegativeTimestamp1Timestamps() {

    long negativeTimestamp = -1577837800000L;
    long timestamp2 = 1577837700000L;

    new TimespanCalculator(negativeTimestamp, timestamp2);
  }

  @Test(expected = NegativeTimestampException.class)
  public void testWithNegativeTimestamp2Timestamps() {

    long timestamp1 = 1577837800000L;
    long negativeTimestamp = -1577837700000L;

    new TimespanCalculator(timestamp1, negativeTimestamp);
  }
}
