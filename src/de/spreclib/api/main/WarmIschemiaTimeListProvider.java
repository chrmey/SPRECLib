package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.warmischemiatime.WarmIschemiaTime;
import java.time.Instant;
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
public final class WarmIschemiaTimeListProvider extends AbstractListProvider<WarmIschemiaTimeOption>
    implements IFactorListProvider<WarmIschemiaTimeOption> {

  public WarmIschemiaTimeListProvider() {
    super();
  }

  @Override
  List<WarmIschemiaTimeOption> generateList() {
    List<WarmIschemiaTimeOption> warmIschemiaTimeOptions = new ArrayList<>();
    for (WarmIschemiaTime warmIschemiaTime : WarmIschemiaTime.values()) {
      WarmIschemiaTimeOption warmIschemiaTimeOption = new WarmIschemiaTimeOption(warmIschemiaTime);
      warmIschemiaTimeOptions.add(warmIschemiaTimeOption);
    }
    return warmIschemiaTimeOptions;
  }

  /**
   * Takes two instants time and returns a WarmIschemiaTimeOption if a WarmIschemiaTimeOption with
   * that timespan is found.
   *
   * @param vascularClampTime Instant
   * @param collectionTime Instant
   * @return WarmIschemiaTimeOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public WarmIschemiaTimeOption valueOf(Instant vascularClampTime, Instant collectionTime)
      throws UndefinedValueException {

    long durationMinutes = new Timespan(vascularClampTime, collectionTime).getTimespanMinutes();

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
  public WarmIschemiaTimeOption valueOf(long durationMinutes) throws UndefinedValueException {

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

  @Override
public WarmIschemiaTimeOption getOptionFromCodeString(String codeString) {
    for (WarmIschemiaTimeOption warmIschemiaTimeOption : this.listOptions) {
      if (warmIschemiaTimeOption.hasCodeString(codeString)) {
        return warmIschemiaTimeOption;
      }
    }
    return null;
  }
}
