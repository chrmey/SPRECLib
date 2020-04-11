package de.spreclib.api.lists;

import de.spreclib.api.lists.options.PostCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import java.util.ArrayList;

public final class PostCentrifugationTemperatureListProvider {

  private static final ArrayList<PostCentrifugationTemperatureOption>
      POST_CENTRIFUGATION_TEMPERATURE_OPTIONS;

  static {
    POST_CENTRIFUGATION_TEMPERATURE_OPTIONS = new ArrayList<>();
    for (PostCentrifugationTemperature postCentrifugationTemperature :
        PostCentrifugationTemperature.values()) {
      PostCentrifugationTemperatureOption postCentrifugationTemperatureOption =
          new PostCentrifugationTemperatureOption(postCentrifugationTemperature);
      POST_CENTRIFUGATION_TEMPERATURE_OPTIONS.add(postCentrifugationTemperatureOption);
    }
  }

  public static ArrayList<PostCentrifugationTemperatureOption> getList() {
    return POST_CENTRIFUGATION_TEMPERATURE_OPTIONS;
  }

  public static PostCentrifugationTemperatureOption valueOf(Temperature temperature) {

    if (temperature == null) {
      return null;
    }

    float temperatureCelsius = temperature.getTemperatureCelsius();

    for (PostCentrifugationTemperatureOption postCentrifugationTemperatureOption :
        POST_CENTRIFUGATION_TEMPERATURE_OPTIONS) {
      if (postCentrifugationTemperatureOption.hasTemperature(temperatureCelsius)) {
        return postCentrifugationTemperatureOption;
      }
    }
    return null;
  }
}
