package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.warmischemiatime.WarmIschemiaTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for WarmIschemiaTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.WarmIschemiaTimeOption
 */
public final class WarmIschemiaTimeListProvider
    extends AbstractListProvider<WarmIschemiaTimeOption> {

  public WarmIschemiaTimeListProvider() {
    super();
  }

  @Override
  protected List<WarmIschemiaTimeOption> generateList() {
    List<WarmIschemiaTimeOption> warmIschemiaTimeOptions = new ArrayList<>();
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      WarmIschemiaTimeOption warmIschemiaTimeOption = new WarmIschemiaTimeOption(warmIschemiaTime);
      warmIschemiaTimeOptions.add(warmIschemiaTimeOption);
    }
    return warmIschemiaTimeOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a WarmIschemiaTimeOption if a
   * WarmIschemiaTimeOption with that timespan is found.
   *
   * @param vascularClampTimeMillis timestamp milliseconds EPOCH time
   * @param collectionTimeMillis timestamp milliseconds EPOCH time
   * @return WarmIschemiaTimeOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public WarmIschemiaTimeOption valueOf(long vascularClampTimeMillis, long collectionTimeMillis)
      throws UndefinedValueException {

    int durationMinutes =
        new Timespan(vascularClampTimeMillis, collectionTimeMillis).getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a WarmIschemiaTimeOption if a WarmIschemiaTimeOption
   * with that duration is found.
   *
   * @param durationMinutes duration in Minutes
   * @return WarmIschemiaTimeOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   */
  public WarmIschemiaTimeOption valueOf(int durationMinutes) throws UndefinedValueException {

    for (WarmIschemiaTimeOption warmIschemiaTimeOption : this.listOptions) {

      if (warmIschemiaTimeOption.hasDuration(durationMinutes)) {
        return warmIschemiaTimeOption;
      }
    }
    throw new UndefinedValueException(
        durationMinutes,
        "WarmIschemiaTime",
        "Value " + durationMinutes + "minutes undefined for WarmIschemiaTime.");
  }
}
