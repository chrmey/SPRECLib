package de.spreclib.api.sprec;

import de.spreclib.api.sprec.interfaces.IPreCentrifugationParameter;

public class PreCentrifugationTemperatureParameter implements IPreCentrifugationParameter {

  private float temperatureCelsius;
  private PreCentrifugationTemperatureOption temperatureOption;

  public PreCentrifugationTemperatureParameter(float temperature) {}

  public PreCentrifugationTemperatureParameter(
      PreCentrifugationTemperatureOption temperatureOption) {}
}
