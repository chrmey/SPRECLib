package de.spreclib.api.handlers;

import de.spreclib.api.exceptions.InvalidTimestampException;
import de.spreclib.api.exceptions.InvalidTimestampRelationException;
import de.spreclib.api.exceptions.NegativeTimestampException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class TimeStampHandler {

  private final long timestamp1;
  private final long timestamp2;
  private int delayMinutes;

  public TimeStampHandler(long timestamp1, long timestamp2) {

    this.timestamp1 = timestamp1;
    this.timestamp2 = timestamp2;

    validate();

    this.delayMinutes = calculateDelayMinutes();
  }

  private void validate() {

    if (this.timestamp1 < 0) {
      throw new NegativeTimestampException(this.timestamp1, "Timestamp cannot be negative");
    }

    if (this.timestamp2 < 0) {
      throw new NegativeTimestampException(this.timestamp2, "Timestamp cannot be negative");
    }

    validateDate(this.timestamp1);
    validateDate(this.timestamp2);

    if (this.timestamp1 >= this.timestamp2) {
      throw new InvalidTimestampRelationException(
          this.timestamp1, this.timestamp2, "Timestamp1 must be before Timestamp2");
    }
  }

  private void validateDate(long timestamp) {

    // convert to milliseconds since java date takes timestamp in milliseconds
    long timestampMilliSecond = timestamp * 1000;

    Date date = new Date(timestampMilliSecond);
    String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date);

    try {

      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      dateFormat.setLenient(false);

      dateFormat.parse(dateString);

    } catch (ParseException pe) {
      throw new InvalidTimestampException(timestamp, timestamp + " is no valid timestamp.");
    }
  }

  private int calculateDelayMinutes() {

    long delaySeconds = this.timestamp2 - this.timestamp1;
    int delayMinutes = (int) (delaySeconds / 60);

    return delayMinutes;
  }

  public int getDelayMinutes() {
    return this.delayMinutes;
  }
}
