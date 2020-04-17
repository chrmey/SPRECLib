package de.spreclib.api.lists;

import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.FixationTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FixationTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.FixationOption
 */
public final class FixationTimeListProvider extends AbstractListProvider<FixationTimeOption> {

  public FixationTimeListProvider() {
    super();
  }

  @Override
  protected List<FixationTimeOption> generateList() {
    List<FixationTimeOption> fixationTimeOptions = new ArrayList<>();
    for (FixationTime fixationTime : FixationTime.values()) {
      FixationTimeOption fixationOption = new FixationTimeOption(fixationTime);
      fixationTimeOptions.add(fixationOption);
    }
    return fixationTimeOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a FixationTimeOption if a
   * FixationTimeOption with that timespan is found. Returns null otherwise.
   *
   * @param startOfFixationTimeMillis timestamp milliseconds EPOCH time
   * @param endOfFixationTimeMillis timestamp milliseconds EPOCH time
   * @return FixationTimeOption
   * @see #valueOf(int)
   */
  public FixationTimeOption valueOf(long startOfFixationTimeMillis, long endOfFixationTimeMillis) {

    int durationMinutes =
        new Timespan(startOfFixationTimeMillis, endOfFixationTimeMillis).getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a FixationTimeOption if a FixationTimeOption with that
   * duration is found. Returns null otherwise
   *
   * @param durationMinutes durationMinutes
   * @return FixationTimeOption
   */
  public FixationTimeOption valueOf(int durationMinutes) {

    for (FixationTimeOption fixationTimeOption : listOptions) {

      if (fixationTimeOption.hasDuration(durationMinutes)) {
        return fixationTimeOption;
      }
    }
    return null;
  }
}
