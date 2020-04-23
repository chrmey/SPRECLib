package de.spreclib.api.lists;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
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
 * @see de.spreclib.api.lists.PostCentrifugationOption
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
   * that combination is found.
   *
   * @param postCentrifugationTemperatureOption PostCentrifugationTemperatureOption
   * @param postCentrifugationDelayOption PostCentrifugationDelayOption
   * @return PostCentrifugationOption
   * @throws UndefinedValueCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public PostCentrifugationOption valueOf(
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption,
      PostCentrifugationDelayOption postCentrifugationDelayOption)
      throws UndefinedValueCombinationException {

    if (postCentrifugationTemperatureOption == null) {
      throw new IllegalArgumentException("PostCentrifugationTemperatureOption cannot not be null.");
    }

    if (postCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PostCentrifugationDelayOption cannot not be null.");
    }

    for (PostCentrifugationOption postCentrifugationOption : this.listOptions) {

      if (postCentrifugationOption.hasPostCentrifugation(
          postCentrifugationDelayOption, postCentrifugationTemperatureOption)) {

        return postCentrifugationOption;
      }
    }

    throw new UndefinedValueCombinationException(
        "Parameter combination for PostCentrifugation is undefined in SPREC.");
  }
}
