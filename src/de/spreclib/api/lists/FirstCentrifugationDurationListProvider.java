package de.spreclib.api.lists;

import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FirstCentrifugationDurationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.FirstCentrifugationDurationOption
 */
public final class FirstCentrifugationDurationListProvider
    extends AbstractListProvider<FirstCentrifugationDurationOption> {

  public FirstCentrifugationDurationListProvider() {
    super();
  }

  @Override
  protected List<FirstCentrifugationDurationOption> generateList() {
    List<FirstCentrifugationDurationOption> firstCentrifugationDurationOptions = new ArrayList<>();
    for (FirstCentrifugationDuration firstCentrifugationDuration :
        FirstCentrifugationDuration.values()) {
      FirstCentrifugationDurationOption firstCentrifugationDurationOption =
          new FirstCentrifugationDurationOption(firstCentrifugationDuration);
      firstCentrifugationDurationOptions.add(firstCentrifugationDurationOption);
    }
    return firstCentrifugationDurationOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a FirstCentrifugationDurationOption if
   * a FirstCentrifugationDurationOption with that timespan is found. Returns null otherwise.
   *
   * @param firstCentrifugationStartTimeMillis timestamp milliseconds EPOCH time
   * @param firstCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @return FirstCentrifugationDurationOption
   * @see #valueOf(int)
   */
  public FirstCentrifugationDurationOption valueOf(
      long firstCentrifugationStartTimeMillis, long firstCentrifugationEndTimeMillis) {

    int durationMinutes =
        new Timespan(firstCentrifugationStartTimeMillis, firstCentrifugationEndTimeMillis)
            .getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a FirstCentrifugationDurationOption if a
   * FirstCentrifugationDurationOption with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return FirstCentrifugationDurationOption
   */
  public FirstCentrifugationDurationOption valueOf(int durationMinutes) {
    for (FirstCentrifugationDurationOption firstCentrifugationDurationOption : listOptions) {

      if (firstCentrifugationDurationOption.hasDuration(durationMinutes)) {
        return firstCentrifugationDurationOption;
      }
    }
    return null;
  }
}
