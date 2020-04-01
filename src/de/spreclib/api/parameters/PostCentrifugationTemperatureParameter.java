package de.spreclib.api.parameters;

import de.spreclib.api.parameters.interfaces.IPreCentrifugationParameter;
import de.spreclib.api.sprec.PostCentrifugationTemperatureOption;

public class PostCentrifugationTemperatureParameter implements IPreCentrifugationParameter {

  private float temperatureCelsius;
  private PostCentrifugationTemperatureOption temperatureOption;

  public PostCentrifugationTemperatureParameter(float temperature) {
	this.temperatureCelsius = temperature;
    }

  public PostCentrifugationTemperatureParameter(
      PostCentrifugationTemperatureOption temperatureOption) {
    this.temperatureOption = temperatureOption;
  }
}
