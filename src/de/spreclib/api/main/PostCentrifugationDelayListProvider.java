package de.spreclib.api.main;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationDelay;
import java.time.Instant;
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
  List<PostCentrifugationDelayOption> generateList() {
    List<PostCentrifugationDelayOption> postCentrifugationDelayOptions = new ArrayList<>();
    for (PostCentrifugationDelay postCentrifugationDelay : PostCentrifugationDelay.values()) {
      PostCentrifugationDelayOption postCentrifugationDelayOption =
          new PostCentrifugationDelayOption(postCentrifugationDelay);
      postCentrifugationDelayOptions.add(postCentrifugationDelayOption);
    }
    return postCentrifugationDelayOptions;
  }

  /**
   * Takes two instants and returns a PostCentrifugationDelayOption if a
   * PostCentrifugationDelayOption with that timespan is found.
   *
   * @param lastCentrifugationEndTime Instant
   * @param longTermStorageStartTime Instant
   * @return PostCentrifugationDelayOption
   * @throws UndefinedValueException if value for the timespan cannot be found in ListOptions
   * @see #valueOf(int)
   * @see de.spreclib.api.parameters.timespan
   */
  public PostCentrifugationDelayOption valueOf(
      Instant lastCentrifugationEndTime, Instant longTermStorageStartTime)
      throws UndefinedValueException {

    long delayMinutes =
        new Timespan(lastCentrifugationEndTime, longTermStorageStartTime).getTimespanMinutes();

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
  public PostCentrifugationDelayOption valueOf(long delayMinutes) throws UndefinedValueException {

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
