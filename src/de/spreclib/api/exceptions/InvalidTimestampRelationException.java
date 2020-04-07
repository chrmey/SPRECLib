package de.spreclib.api.exceptions;

public class InvalidTimestampRelationException extends RuntimeException {

  /** */
  private static final long serialVersionUID = -8405943154637458365L;

  private final long timestamp1;
  private final long timestamp2;

  public InvalidTimestampRelationException(long timestamp1, long timestamp2, String message) {
    super(message);
    this.timestamp1 = timestamp1;
    this.timestamp2 = timestamp2;
  }

  public long getTimestamp1() {
    return this.timestamp1;
  }

  public long getTimestamp2() {
    return this.timestamp2;
  }
}
