package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationDuration;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SecondCentrifugationDurationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.SecondCentrifugationDurationOption
 */
public final class SecondCentrifugationDurationListProvider
    extends AbstractListProvider<SecondCentrifugationDurationOption> {

  public SecondCentrifugationDurationListProvider() {
    super();
  }

  @Override
  protected List<SecondCentrifugationDurationOption> generateList() {
    List<SecondCentrifugationDurationOption> secondCentrifugationOptions = new ArrayList<>();
    for (SecondCentrifugationDuration secondCentrifugationDuration :
        SecondCentrifugationDuration.values()) {
      SecondCentrifugationDurationOption secondCentrifugationDurationOption =
          new SecondCentrifugationDurationOption(secondCentrifugationDuration);
      secondCentrifugationOptions.add(secondCentrifugationDurationOption);
    }
    return secondCentrifugationOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a SecondCentrifugationDurationOption
   * if a SecondCentrifugationDurationOption with that timespan is found.
   *
   * @param secondCentrifugationStartTimeMillis timestamp milliseconds EPOCH time
   * @param secondCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @return SecondCentrifugationDurationOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public SecondCentrifugationDurationOption valueOf(
      long secondCentrifugationStartTimeMillis, long secondCentrifugationEndTimeMillis)
      throws UndefinedValueException {

    int durationMinutes =
        new Timespan(secondCentrifugationStartTimeMillis, secondCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a SecondCentrifugationDurationOption if a
   * SecondCentrifugationDurationOption with that duration is found.
   *
   * @param durationMinutes duration in Minutes
   * @return SecondCentrifugationDurationOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   */
  public SecondCentrifugationDurationOption valueOf(int durationMinutes)
      throws UndefinedValueException {
    for (SecondCentrifugationDurationOption secondCentrifugationDurationOption : this.listOptions) {

      if (secondCentrifugationDurationOption.hasDuration(durationMinutes)) {
        return secondCentrifugationDurationOption;
      }
    }
    throw new UndefinedValueException(
        durationMinutes,
        "SecondCentrifugationDuration",
        "Value " + durationMinutes + "minutes is undefined for SecondCentrifugationDuration.");
  }
}
