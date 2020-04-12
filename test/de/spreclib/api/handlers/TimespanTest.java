package de.spreclib.api.handlers;

import static org.junit.Assert.assertEquals;
import de.spreclib.api.exceptions.InvalidTimestampRelationException;
import de.spreclib.api.exceptions.NegativeTimestampException;
import de.spreclib.api.parameters.Timespan;
import org.junit.Test;

public class TimespanTest {

  @Test
  public void testWithValidTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    Timespan timestampCalculator = new Timespan(startTime, fifteenMinutesLater);

    int delayMinutes = timestampCalculator.getTimespanMinutes();

    assertEquals(15, delayMinutes);
  }

  @Test(expected = InvalidTimestampRelationException.class)
  public void testWithNoValidTimestamps() {

    long timestamp1 = 1577837700000L;
    long timestampEqualTimestamp1 = 1577837700000L;

    new Timespan(timestamp1, timestampEqualTimestamp1);
  }

  @Test(expected = InvalidTimestampRelationException.class)
  public void testWithTimestamp1AfterTimestamp2ValidTimestamps() {

    long timestamp1 = 1577837800000L;
    long beforeTimestamp1 = 1577837700000L;

    new Timespan(timestamp1, beforeTimestamp1);
  }

  @Test(expected = NegativeTimestampException.class)
  public void testWithNegativeTimestamp1Timestamps() {

    long negativeTimestamp = -1577837800000L;
    long timestamp2 = 1577837700000L;

    new Timespan(negativeTimestamp, timestamp2);
  }

  @Test(expected = NegativeTimestampException.class)
  public void testWithNegativeTimestamp2Timestamps() {

    long timestamp1 = 1577837800000L;
    long negativeTimestamp = -1577837700000L;

    new Timespan(timestamp1, negativeTimestamp);
  }
}
