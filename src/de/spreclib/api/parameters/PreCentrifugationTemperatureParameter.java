package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;

public class PreCentrifugationTemperatureParameter {

  private float temperatureCelsius;
  private PreCentrifugationTemperatureOption temperatureOption;

  public PreCentrifugationTemperatureParameter(float temperature) {
    this.temperatureCelsius = temperature;
  }


  public PreCentrifugationTemperatureParameter(
      PreCentrifugationTemperatureOption temperatureOption) {
      
    if (temperatureOption == null) {
      throw new IllegalArgumentException("TemperatureOption cannot be null");
    }
    
    this.temperatureOption = temperatureOption;
  }

  public PreCentrifugationTemperature getPreCentrifugationTemperature() {

    if (temperatureOption != null) {
	
      return temperatureOption.getContainedObject();
    } else {
      PreCentrifugationTemperature temperature =
          PreCentrifugationTemperature.valueOf(temperatureCelsius);

      return temperature;
    }
  }
}
