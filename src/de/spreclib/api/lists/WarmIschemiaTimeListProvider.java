package de.spreclib.api.lists;

import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.WarmIschemiaTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for WarmIschemiaTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.WarmIschemiaTimeOption
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
   * WarmIschemiaTimeOption with that timespan is found. Returns null otherwise.
   *
   * @param vascularClampTimeMillis timestamp milliseconds EPOCH time
   * @param collectionTimeMillis timestamp milliseconds EPOCH time
   * @return WarmIschemiaTimeOption
   * @see #valueOf(int)
   */
  public WarmIschemiaTimeOption valueOf(long vascularClampTimeMillis, long collectionTimeMillis) {

    int durationMinutes =
        new Timespan(vascularClampTimeMillis, collectionTimeMillis).getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a WarmIschemiaTimeOption if a WarmIschemiaTimeOption
   * with that duration is found. Returns null otherwise
   *
   * @param durationMinutes duration in Minutes
   * @return WarmIschemiaTimeOption
   */
  public WarmIschemiaTimeOption valueOf(int durationMinutes) {

    for (WarmIschemiaTimeOption warmIschemiaTimeOption : this.listOptions) {

      if (warmIschemiaTimeOption.hasDuration(durationMinutes)) {
        return warmIschemiaTimeOption;
      }
    }
    return null;
  }
}
