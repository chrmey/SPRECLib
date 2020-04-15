package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SecondCentrifugationDurationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SecondCentrifugationDurationOption
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
   * if a SecondCentrifugationDurationOption with that timespan is found. Returns null otherwise.
   *
   * @param secondCentrifugationStartTimeMillis timestamp milliseconds EPOCH time
   * @param secondCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @return SecondCentrifugationDurationOption
   * @see #valueOf(int)
   */
  public SecondCentrifugationDurationOption valueOf(
      long secondCentrifugationStartTimeMillis, long secondCentrifugationEndTimeMillis) {

    int durationMinutes =
        new Timespan(secondCentrifugationStartTimeMillis, secondCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a SecondCentrifugationDurationOption if a
   * SecondCentrifugationDurationOption with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return SecondCentrifugationDurationOption
   */
  public SecondCentrifugationDurationOption valueOf(int durationMinutes) {
    for (SecondCentrifugationDurationOption secondCentrifugationDurationOption : this.listOptions) {

      if (secondCentrifugationDurationOption.hasDuration(durationMinutes)) {
        return secondCentrifugationDurationOption;
      }
    }
    return null;
  }
}
