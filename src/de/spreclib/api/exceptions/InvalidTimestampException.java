package de.spreclib.api.exceptions;

public class InvalidTimestampException extends RuntimeException {

  /**
   * Exception that is thrown when a timestamp is no valid timestamp.
   *
   * @author Christopher Meyer
   */
  private static final long serialVersionUID = 5833405742873386268L;

  private final long timestamp;

  public InvalidTimestampException(long timestamp, String errorMessage) {
    super(errorMessage);
    this.timestamp = timestamp;
  }

  public long getTimestamp() {
    return this.timestamp;
  }
}
