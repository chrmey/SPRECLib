package de.spreclib.api.handlers;

import de.spreclib.api.exceptions.InvalidTimestampRelationException;
import de.spreclib.api.exceptions.NegativeTimestampException;

/** @author Christopher Meyer */
public final class TimespanCalculator {

  private int delayMinutes;

  /**
   * Takes two timestamps (milliseconds since 01.01.1970) and calculates the timespan between them
   * in minutes.
   *
   * @param firstTimestampMilliSeconds milliseconds EPOCH time
   * @param secondTimestampMilliSeconds milliseconds EPOCH time
   */
  public TimespanCalculator(long firstTimestampMilliSeconds, long secondTimestampMilliSeconds) {

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

    this.delayMinutes = calculateTimespanMinutes(firstTimestampMilliSeconds, secondTimestampMilliSeconds);
  }

  private int calculateTimespanMinutes(long firstTimestamp, long secondTimestamp) {

    long timespanMilliseconds = secondTimestamp - firstTimestamp;
    long timespanSeconds = timespanMilliseconds / 1000;
    int timespanMinutes = (int) (timespanSeconds / 60);

    return timespanMinutes;
  }

  public int getDelayMinutes() {
    return this.delayMinutes;
  }
}
