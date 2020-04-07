package de.spreclib.api.parameters;

import static org.junit.Assert.assertEquals;
import de.spreclib.api.exceptions.InvalidTimestampException;
import org.junit.Test;

public class TimeStampHandlerTest {

  @Test
  public void testWithValidTimestamps() {

    long timestamp1 = 1577836800;
    long timestamp2 = 1577837700;

    TimeStampHandler timestampHandler = new TimeStampHandler(timestamp1, timestamp2);

    int delayMinutes = timestampHandler.getDelayMinutes();

    assertEquals(15, delayMinutes);
  }

  @Test(expected = InvalidTimestampException.class)
  public void testWithNoValidTimestamps() {

    long timestamp1 = 1577837700;
    long timestamp2 = 1577837700;

    new TimeStampHandler(timestamp1, timestamp2);
  }

  @Test(expected = InvalidTimestampException.class)
  public void testWithTimestamp1AfterTimestamp2ValidTimestamps() {

    long timestamp1 = 1577837800;
    long timestamp2 = 1577837700;

    new TimeStampHandler(timestamp1, timestamp2);
  }

  @Test(expected = InvalidTimestampException.class)
  public void testWithNegativeTimestamp1Timestamps() {

    long timestamp1 = -1577837800;
    long timestamp2 = 1577837700;

    new TimeStampHandler(timestamp1, timestamp2);
  }

  @Test(expected = InvalidTimestampException.class)
  public void testWithNegativeTimestamp2Timestamps() {

    long timestamp1 = 1577837800;
    long timestamp2 = -1577837700;

    new TimeStampHandler(timestamp1, timestamp2);
  }

  @Test(expected = InvalidTimestampException.class)
  public void testWithNegativeTimestampsTimestamps() {

    long timestamp1 = -1577837600;
    long timestamp2 = -1577837700;

    new TimeStampHandler(timestamp1, timestamp2);
  }
}
