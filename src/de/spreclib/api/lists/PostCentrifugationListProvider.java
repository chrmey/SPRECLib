package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PostCentrifugationTemperatureOption;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugationList;
import java.util.ArrayList;

public final class PostCentrifugationListProvider {

  private static final ArrayList<PostCentrifugationOption> POST_CENTRIFUGATION_OPTIONS;

  static {
    POST_CENTRIFUGATION_OPTIONS = new ArrayList<>();
    for (PostCentrifugation postCentrifugation : PostCentrifugationList.POST_CENTRIFUGATIONS) {
      PostCentrifugationOption postCentrifugationOption =
          new PostCentrifugationOption(postCentrifugation);
      POST_CENTRIFUGATION_OPTIONS.add(postCentrifugationOption);
    }
  }

  public static ArrayList<PostCentrifugationOption> getList() {
    return POST_CENTRIFUGATION_OPTIONS;
    }

  public static PostCentrifugationOption valueOf(
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption,
      PostCentrifugationDelayOption postCentrifugationDelayOption) {

    if (postCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("PostCentrifugationTemperatureOption cannot not be null.");
    }

    if (postCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PostCentrifugationDelayOption cannot not be null.");
    }

    for (PostCentrifugationOption postCentrifugationOption : POST_CENTRIFUGATION_OPTIONS) {

      if (postCentrifugationOption.hasPostCentrifugation(
          postCentrifugationTemperatureOption, postCentrifugationDelayOption)) {

        return postCentrifugationOption;
      }
    }

    throw new InvalidParameterCombinationException(
        "Parameter combination for PostCentrifugation is no valid combination.");
  }
}
