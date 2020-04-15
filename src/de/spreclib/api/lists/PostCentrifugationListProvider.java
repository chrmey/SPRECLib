package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PostCentrifugationTemperatureOption;
import de.spreclib.model.postcentrifugation.PostCentrifugation;
import de.spreclib.model.postcentrifugation.PostCentrifugationList;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PostCentrifugationOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.PostCentrifugationOption
 */
public final class PostCentrifugationListProvider
    extends AbstractListProvider<PostCentrifugationOption> {

  public PostCentrifugationListProvider() {
    super();
  }

  @Override
  protected List<PostCentrifugationOption> generateList() {
    List<PostCentrifugationOption> postCentrifugationOptions = new ArrayList<>();
    for (PostCentrifugation postCentrifugation : PostCentrifugationList.POST_CENTRIFUGATIONS) {
      PostCentrifugationOption postCentrifugationOption =
          new PostCentrifugationOption(postCentrifugation);
      postCentrifugationOptions.add(postCentrifugationOption);
    }
    return postCentrifugationOptions;
  }

  /**
   * Takes all parameters for PostCentrifugation and returns an option if a PostCentrifugation with
   * that combination is found. Returns null otherwise.
   *
   * @param postCentrifugationTemperatureOption PostCentrifugationTemperatureOption
   * @param postCentrifugationDelayOption PostCentrifugationDelayOption
   * @return PostCentrifugationOption
   * @throws InvalidParameterCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public PostCentrifugationOption valueOf(
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption,
      PostCentrifugationDelayOption postCentrifugationDelayOption) {

    if (postCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("PostCentrifugationTemperatureOption cannot not be null.");
    }

    if (postCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PostCentrifugationDelayOption cannot not be null.");
    }

    for (PostCentrifugationOption postCentrifugationOption : this.listOptions) {

      if (postCentrifugationOption.hasPostCentrifugation(
          postCentrifugationTemperatureOption, postCentrifugationDelayOption)) {

        return postCentrifugationOption;
      }
    }

    throw new InvalidParameterCombinationException(
        "Parameter combination for PostCentrifugation is no valid combination.");
  }
}
