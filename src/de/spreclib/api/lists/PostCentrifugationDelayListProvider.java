package de.spreclib.api.lists;

import de.spreclib.api.parameters.Timespan;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PostCentrifugationDelayOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.PostCentrifugationDelayOption
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
   * PostCentrifugationDelayOption with that timespan is found. Returns null otherwise.
   *
   * @param lastCentrifugationEndTimeMillis timestamp milliseconds EPOCH time
   * @param longTermStorageStartTimeMillis timestamp milliseconds EPOCH time
   * @return PostCentrifugationDelayOption
   * @see #valueOf(int)
   */
  public PostCentrifugationDelayOption valueOf(
      long lastCentrifugationEndTimeMillis, long longTermStorageStartTimeMillis) {

    int delayMinutes =
        new Timespan(lastCentrifugationEndTimeMillis, longTermStorageStartTimeMillis)
            .getTimespanMinutes();

    return this.valueOf(delayMinutes);
  }

  /**
   * Takes a duration in minutes and returns a PostCentrifugationDelayOption if a
   * PostCentrifugationDelayOption with that duration is found. Returns null otherwise
   *
   * @param delayMinutes delay in Minutes
   * @return PostCentrifugationDelayOption
   */
  public PostCentrifugationDelayOption valueOf(int delayMinutes) {

    for (PostCentrifugationDelayOption postCentrifugationDelayOption : this.listOptions) {

      if (postCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return postCentrifugationDelayOption;
      }
    }
    return null;
  }
}
