package de.spreclib.api.parameters;

import de.spreclib.api.parameters.exceptions.InvalidTimeRelationException;
import java.time.Duration;
import java.time.Instant;

/**
 * Takes two instants and provides the timespan between them in minutes.
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class Timespan {

  private final long timespanMinutes;

  /**
   * Takes two instants and provides the timespan between them in minutes.
   *
   * @param timeStart Instant that represents the start of a timespan
   * @param timeEnd Instant that represents the end of a timespan
   * @throws InvalidTimeRelationException if the second instant is before the first instant
   */
  public Timespan(Instant timeStart, Instant timeEnd) {

    if (timeEnd.isBefore(timeStart)) {
      throw new InvalidTimeRelationException(
          timeStart, timeEnd, "Instant1 must be before Instant2");
    }

    this.timespanMinutes = Duration.between(timeStart, timeEnd).toMinutes();
  }

  public long getTimespanMinutes() {
    return this.timespanMinutes;
  }
}
