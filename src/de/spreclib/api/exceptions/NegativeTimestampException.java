package de.spreclib.api.exceptions;

public class NegativeTimestampException extends RuntimeException {

  /**
   * Exception that is thrown when a timestamp is a negative numeric.
   *
   * @author Christopher Meyer
   */
  private static final long serialVersionUID = 1L;

  private final long timestamp;

  public NegativeTimestampException(long timestamp, String message) {
    super(message);
    this.timestamp = timestamp;
  }

  public long getTimestamp() {
    return this.timestamp;
  }
}
