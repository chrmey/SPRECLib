package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.coldischemiatime.ColdIschemiaTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for ColdIschemiaTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.ColdIschemiaTimeOption
 */
public final class ColdIschemiaTimeListProvider
    extends AbstractListProvider<ColdIschemiaTimeOption> {

  public ColdIschemiaTimeListProvider() {
    super();
  }

  @Override
  protected List<ColdIschemiaTimeOption> generateList() {
    List<ColdIschemiaTimeOption> coldIschemiaTimeOptions = new ArrayList<>();
    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      ColdIschemiaTimeOption coldIschemiaTimeOption = new ColdIschemiaTimeOption(coldIschemiaTime);
      coldIschemiaTimeOptions.add(coldIschemiaTimeOption);
    }
    return coldIschemiaTimeOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a ColdIschemiaTimeOption if a
   * ColdIschemiaTimeOption with that timespan is found.
   *
   * @param colletionTimeMillis timestamp milliseconds EPOCH time
   * @param startOfFixationMillis timestamp milliseconds EPOCH time
   * @return ColdIschemiaTimeOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public ColdIschemiaTimeOption valueOf(long colletionTimeMillis, long startOfFixationMillis)
      throws UndefinedValueException {

    int durationMinutes =
        new Timespan(colletionTimeMillis, startOfFixationMillis).getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a ColdIschemiaTimeOption if a ColdIschemiaTimeOption
   * with that duration is found.
   *
   * @param durationMinutes duration in Minutes
   * @return ColdIschemiaTimeOption if a value for the specified timespan can be found
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   */
  public ColdIschemiaTimeOption valueOf(int durationMinutes) throws UndefinedValueException {

    for (ColdIschemiaTimeOption coldIschemiaTimeOption : this.listOptions) {

      if (coldIschemiaTimeOption.hasDuration(durationMinutes)) {
        return coldIschemiaTimeOption;
      }
    }
    throw new UndefinedValueException(
        durationMinutes,
        "ColdIschemiaTime",
        "Value " + durationMinutes + "minutes undefined for ColdIschemiaTime.");
  }
}
