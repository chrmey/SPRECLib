package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.api.parameters.interfaces.IPreCentrifugationParameter;

public class PreCentrifugationTemperatureParameter implements IPreCentrifugationParameter {

  private float temperatureCelsius;
  private PreCentrifugationTemperatureOption temperatureOption;

  public PreCentrifugationTemperatureParameter(float temperature) {
	this.temperatureCelsius = temperature;
    }

  public PreCentrifugationTemperatureParameter(
      PreCentrifugationTemperatureOption temperatureOption) {
    this.temperatureOption = temperatureOption;
  }
}
