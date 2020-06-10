package de.spreclib.api.parameters;

import static org.junit.Assert.assertEquals;

import de.spreclib.api.parameters.exceptions.InvalidTimeRelationException;
import java.time.Instant;
import org.junit.Test;

public class TimespanTest {

  @Test
  public void testWithValidTimestamps() {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenMinutesLater = Instant.ofEpochMilli(1577837700000L);

    Timespan timespan = new Timespan(startTime, fifteenMinutesLater);

    long delayMinutes = timespan.getTimespanMinutes();

    assertEquals(15, delayMinutes);
  }

  @Test(expected = InvalidTimeRelationException.class)
  public void testWithTimestamp1AfterTimestamp2() {

    Instant startTime = Instant.ofEpochMilli(1577837800000L);
    Instant endTimeBeforeStartTime = Instant.ofEpochMilli(1577837700000L);

    new Timespan(startTime, endTimeBeforeStartTime);
  }

  @Test
  public void testWithHalfMinute() {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenAndHalfMinutesLater = Instant.ofEpochMilli(1577837730000L);

    Timespan timespan = new Timespan(startTime, fifteenAndHalfMinutesLater);

    long delayMinutes = timespan.getTimespanMinutes();

    assertEquals(15, delayMinutes);
  }
}
