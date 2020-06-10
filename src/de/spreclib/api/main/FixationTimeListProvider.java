package de.spreclib.api.main;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.fixationtime.FixationTime;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FixationTimeOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.FixationOption
 */
public final class FixationTimeListProvider extends AbstractListProvider<FixationTimeOption>
    implements IFactorListProvider<FixationTimeOption> {

  public FixationTimeListProvider() {
    super();
  }

  @Override
  List<FixationTimeOption> generateList() {
    List<FixationTimeOption> fixationTimeOptions = new ArrayList<>();
    for (FixationTime fixationTime : FixationTime.values()) {
      FixationTimeOption fixationOption = new FixationTimeOption(fixationTime);
      fixationTimeOptions.add(fixationOption);
    }
    return fixationTimeOptions;
  }

  /**
   * Takes two instants time and returns a FixationTimeOption if a FixationTimeOption with that
   * timespan is found.
   *
   * @param fixationStartTime Instant
   * @param fixationEndTime Instant
   * @return FixationTimeOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public FixationTimeOption valueOf(Instant fixationStartTime, Instant fixationEndTime)
      throws UndefinedValueException {

    long durationMinutes =
        new Timespan(fixationStartTime, fixationEndTime).getTimespanMinutes();

    return this.valueOf(durationMinutes);
  }

  /**
   * Takes a duration in minutes and returns a FixationTimeOption if a FixationTimeOption with that
   * duration is found.
   *
   * @param durationMinutes durationMinutes
   * @return FixationTimeOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   */
  public FixationTimeOption valueOf(long durationMinutes) throws UndefinedValueException {

    for (FixationTimeOption fixationTimeOption : listOptions) {

      if (fixationTimeOption.hasDuration(durationMinutes)) {
        return fixationTimeOption;
      }
    }
    throw new UndefinedValueException(
        durationMinutes,
        "FixationTime",
        "Value " + durationMinutes + "minutes undefined for FixationTime.");
  }

  @Override
public FixationTimeOption getOptionFromCodeString(String codeString) {
    for (FixationTimeOption fixationTimeOption : this.listOptions) {
      if (fixationTimeOption.hasCodeString(codeString)) {
        return fixationTimeOption;
      }
    }
    return null;
  }
}
