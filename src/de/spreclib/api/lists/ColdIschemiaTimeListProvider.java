package de.spreclib.api.lists;

import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.ColdIschemiaTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for ColdIschemiaTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.ColdIschemiaTimeOption
 */
public final class ColdIschemiaTimeListProvider {

  private final List<ColdIschemiaTimeOption> coldIschemiaTimeOptions;

  public ColdIschemiaTimeListProvider() {
    this.coldIschemiaTimeOptions = generateList();
  }

  private List<ColdIschemiaTimeOption> generateList() {
    List<ColdIschemiaTimeOption> coldIschemiaTimeOptions = new ArrayList<>();
    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      ColdIschemiaTimeOption coldIschemiaTimeOption = new ColdIschemiaTimeOption(coldIschemiaTime);
      coldIschemiaTimeOptions.add(coldIschemiaTimeOption);
    }
    return coldIschemiaTimeOptions;
  }

  public List<ColdIschemiaTimeOption> getList() {
    return this.coldIschemiaTimeOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a ColdIschemiaTimeOption if a
   * ColdIschemiaTimeOption with that timespan is found. Returns null otherwise.
   *
   * @param colletionTimeMillis timestamp milliseconds EPOCH time
   * @param startOfFixationMillis timestamp milliseconds EPOCH time
   * @return ColdIschemiaTimeOption
   * @see #valueOf(int)
   */
  public ColdIschemiaTimeOption valueOf(long colletionTimeMillis, long startOfFixationMillis) {

    int durationMinutes =
        new Timespan(colletionTimeMillis, startOfFixationMillis).getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a ColdIschemiaTimeOption if a ColdIschemiaTimeOption
   * with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return ColdIschemiaTimeOption
   */
  public ColdIschemiaTimeOption valueOf(int durationMinutes) {

    for (ColdIschemiaTimeOption coldIschemiaTimeOption : this.coldIschemiaTimeOptions) {

      if (coldIschemiaTimeOption.hasDuration(durationMinutes)) {
        return coldIschemiaTimeOption;
      }
    }
    return null;
  }
}
