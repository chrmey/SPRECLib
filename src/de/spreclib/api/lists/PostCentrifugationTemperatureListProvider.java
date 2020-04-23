package de.spreclib.api.lists;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for PostCentrifugationTemperatureOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.PostCentrifugationTemperatureOption
 */
public final class PostCentrifugationTemperatureListProvider
    extends AbstractListProvider<PostCentrifugationTemperatureOption> {

  public PostCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  protected List<PostCentrifugationTemperatureOption> generateList() {
    List<PostCentrifugationTemperatureOption> postCentrifugationTemperatureOptions =
        new ArrayList<>();
    for (PostCentrifugationTemperature postCentrifugationTemperature :
        PostCentrifugationTemperature.values()) {
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption =
          new PostCentrifugationTemperatureOption(postCentrifugationTemperature);
      postCentrifugationTemperatureOptions.add(postCentrifugationTemperatureOption);
    }
    return postCentrifugationTemperatureOptions;
  }

  /**
   * Takes a temperature object and returns a PostCentrifugationTemperatureOption if a
   * PostCentrifugationTemperatureOption for the Celsius value in the temperature object is found.
   *
   * @param temperature Temperature object
   * @return PostCentrifugationTemperatureOption
   * @throws UndefinedValueException if value for the temperature cannot be found in ListOptions
   * @throws IllegalArgumentException if temperature is null
   */
  public PostCentrifugationTemperatureOption valueOf(Temperature temperature)
      throws UndefinedValueException {

    if (temperature == null) {
      throw new IllegalArgumentException("Temperature cannot be null.");
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (PostCentrifugationTemperatureOption postCentrifugationTemperatureOption :
        this.listOptions) {
      if (postCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return postCentrifugationTemperatureOption;
      }
    }
    throw new UndefinedValueException(
        temperature,
        "Post Centrifugation Temperature",
        "Value "
            + temperatureCelsius
            + " degrees celsius undefined for PostCentrifugationTemperature.");
  }
}
