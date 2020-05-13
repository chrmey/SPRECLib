package de.spreclib.api.exceptions;

import java.time.Instant;

public class InvalidTimeRelationException extends RuntimeException {

  /**
   * Exception that is thrown when the second timestamp is before the first timestamp.
   *
   * @author Christopher Meyer
   */
  private static final long serialVersionUID = -8405943154637458365L;

  private final Instant timeStart;
  private final Instant timeEnd;

  /**
   * Takes two timestamps and an error message.
   *
   * @param timeStart first timestamp
   * @param timeEnd second timestamp
   * @param message Error message
   */
  public InvalidTimeRelationException(Instant timeStart, Instant timeEnd, String message) {
    super(message);
    this.timeStart = timeStart;
    this.timeEnd = timeEnd;
  }

  public Instant gettimeStart() {
    return this.timeStart;
  }

  public Instant getTimeEnd() {
    return this.timeEnd;
  }
}
