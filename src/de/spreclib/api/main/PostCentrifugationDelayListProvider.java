package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationDelay;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PostCentrifugationDelayOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.PostCentrifugationDelayOption
 */
public final class PostCentrifugationDelayListProvider
    extends AbstractListProvider<PostCentrifugationDelayOption> {

  public PostCentrifugationDelayListProvider() {
    super();
  }

  @Override
  protected List<PostCentrifugationDelayOption> generateList() {
    List<PostCentrifugationDelayOption> postCentrifugationDelayOptions = new ArrayList<>();
    for (PostCentrifugationDelay postCentrifugationDelay : PostCentrifugationDelay.values()) {
      PostCentrifugationDelayOption postCentrifugationDelayOption =
          new PostCentrifugationDelayOption(postCentrifugationDelay);
      postCentrifugationDelayOptions.add(postCentrifugationDelayOption);
    }
    return postCentrifugationDelayOptions;
  }

  /**
   * Takes two timestamps milliseconds EPOCH time and returns a PostCentrifugationDelayOption if a
   * PostCentrifugationDelayOption with that timespan is found.
   *
   * @param lastCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @param longTermStorageStartTimeMillis timestamp milliseconds EPOCH time
   * @return PostCentrifugationDelayOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public PostCentrifugationDelayOption valueOf(
      long lastCentrifugationEndTimeMillis, long longTermStorageStartTimeMillis)
      throws UndefinedValueException {

    int delayMinutes =
        new Timespan(lastCentrifugationEndTimeMillis, longTermStorageStartTimeMillis)
            .getTimespanMinutes();

    return this.valueOf(delayMinutes);
  }

  /**
   * Takes a duration in minutes and returns a PostCentrifugationDelayOption if a
   * PostCentrifugationDelayOption with that duration is found.
   *
   * @param delayMinutes delay in Minutes
   * @return PostCentrifugationDelayOption
   * @throws UndefinedValueException if value for the duration cannot be found in ListOptions
   */
  public PostCentrifugationDelayOption valueOf(int delayMinutes) throws UndefinedValueException {

    for (PostCentrifugationDelayOption postCentrifugationDelayOption : this.listOptions) {

      if (postCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return postCentrifugationDelayOption;
      }
    }
    throw new UndefinedValueException(
        delayMinutes,
        "Post Centrifugation Delay",
        "Value " + delayMinutes + "minutes undefined for PostCentrifugationDelay.");
  }
}
