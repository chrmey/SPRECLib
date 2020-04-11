package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import java.util.ArrayList;

public final class PostCentrifugationDelayListProvider {

  private static final ArrayList<PostCentrifugationDelayOption> POST_CENTRIFUGATION_DELAY_OPTIONS;

  static {
    POST_CENTRIFUGATION_DELAY_OPTIONS = new ArrayList<>();
    for (PostCentrifugationDelay postCentrifugationDelay : PostCentrifugationDelay.values()) {
      PostCentrifugationDelayOption postCentrifugationDelayOption =
          new PostCentrifugationDelayOption(postCentrifugationDelay);
      POST_CENTRIFUGATION_DELAY_OPTIONS.add(postCentrifugationDelayOption);
    }
  }

  public static ArrayList<PostCentrifugationDelayOption> getList() {
    return POST_CENTRIFUGATION_DELAY_OPTIONS;
  }

  public static PostCentrifugationDelayOption valueOf(int delayMinutes) {

    for (PostCentrifugationDelayOption postCentrifugationDelayOption :
        POST_CENTRIFUGATION_DELAY_OPTIONS) {

      if (postCentrifugationDelayOption.hasDelay(delayMinutes)) {
        return postCentrifugationDelayOption;
      }
    }
    return null;
  }
}
