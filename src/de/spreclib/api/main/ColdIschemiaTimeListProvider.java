package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.coldischemiatime.ColdIschemiaTime;
import java.time.Instant;
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
public final class ColdIschemiaTimeListProvider extends AbstractListProvider<ColdIschemiaTimeOption>
    implements IFactorListProvider<ColdIschemiaTimeOption> {

  public ColdIschemiaTimeListProvider() {
    super();
  }

  @Override
  List<ColdIschemiaTimeOption> generateList() {
    List<ColdIschemiaTimeOption> coldIschemiaTimeOptions = new ArrayList<>();
    for (ColdIschemiaTime coldIschemiaTime : ColdIschemiaTime.values()) {
      ColdIschemiaTimeOption coldIschemiaTimeOption = new ColdIschemiaTimeOption(coldIschemiaTime);
      coldIschemiaTimeOptions.add(coldIschemiaTimeOption);
    }
    return coldIschemiaTimeOptions;
  }

  /**
   * Takes two instants and returns a ColdIschemiaTimeOption if a ColdIschemiaTimeOption with that
   * timespan is found.
   *
   * @param colletionTimeMillis Instant
   * @param fixationStartTime Instant
   * @return ColdIschemiaTimeOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public ColdIschemiaTimeOption valueOf(Instant collectionTime, Instant fixationStartTime)
      throws UndefinedValueException {

    long durationMinutes = new Timespan(collectionTime, fixationStartTime).getTimespanMinutes();

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
  public ColdIschemiaTimeOption valueOf(long durationMinutes) throws UndefinedValueException {

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

  public ColdIschemiaTimeOption getOptionFromCodeString(String codeString) {
    for (ColdIschemiaTimeOption coldIschemiaTimeOption : this.listOptions) {
      if (coldIschemiaTimeOption.hasCodeString(codeString)) {
        return coldIschemiaTimeOption;
      }
    }
    return null;
  }
}
