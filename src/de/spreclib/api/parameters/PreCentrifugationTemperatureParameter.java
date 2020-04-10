package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;

public class PreCentrifugationTemperatureParameter {

  private PreCentrifugationTemperature preCentrifugationTemperature;

  public PreCentrifugationTemperatureParameter(float temperature) {

    this.preCentrifugationTemperature = PreCentrifugationTemperature.valueOf(temperature);
  }

  public PreCentrifugationTemperatureParameter(
      PreCentrifugationTemperatureOption temperatureOption) {

    if (temperatureOption == null) {
      throw new IllegalArgumentException("TemperatureOption cannot be null.");
    }

    this.preCentrifugationTemperature = temperatureOption.getContainedObject();
  }

  public PreCentrifugationTemperature getPreCentrifugationTemperature() {
    return this.preCentrifugationTemperature;
  }
}
