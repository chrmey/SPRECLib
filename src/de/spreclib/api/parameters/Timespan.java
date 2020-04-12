package de.spreclib.api.parameters;

import de.spreclib.api.exceptions.InvalidTimestampRelationException;
import de.spreclib.api.exceptions.NegativeTimestampException;

/**
 * Takes two timestamps milliseconds epoch time and calculates the timespan between them in minutes.
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class Timespan {

  private final int timespanMinutes;

  /**
   * Takes two timestamps (milliseconds since 01.01.1970) and calculates the timespan between them
   * in minutes.
   *
   * @param firstTimestampMilliSeconds milliseconds EPOCH time
   * @param secondTimestampMilliSeconds milliseconds EPOCH time
   */
  public Timespan(long firstTimestampMilliSeconds, long secondTimestampMilliSeconds) {

    if (firstTimestampMilliSeconds < 0) {
      throw new NegativeTimestampException(firstTimestampMilliSeconds, "Timestamp cannot be negative");
    }

    if (secondTimestampMilliSeconds < 0) {
      throw new NegativeTimestampException(secondTimestampMilliSeconds, "Timestamp cannot be negative");
    }

    if (firstTimestampMilliSeconds >= secondTimestampMilliSeconds) {
      throw new InvalidTimestampRelationException(
          firstTimestampMilliSeconds, secondTimestampMilliSeconds, "Timestamp1 must be before Timestamp2");
    }

    this.timespanMinutes =
        calculateTimespanMinutes(firstTimestampMilliSeconds, secondTimestampMilliSeconds);
  }

  private int calculateTimespanMinutes(long firstTimestamp, long secondTimestamp) {

    long timespanMilliseconds = secondTimestamp - firstTimestamp;
    long timespanSeconds = timespanMilliseconds / 1000;
    int timespanMinutes = (int) (timespanSeconds / 60);

    return timespanMinutes;
  }

  public int getTimespanMinutes() {
    return this.timespanMinutes;
  }
}
