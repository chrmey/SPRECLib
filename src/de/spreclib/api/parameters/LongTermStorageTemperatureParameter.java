package de.spreclib.api.parameters;

import de.spreclib.api.parameters.interfaces.ILongTermStorageParameter;
import de.spreclib.api.sprec.LongTermStorageTemperatureOption;

public class LongTermStorageTemperatureParameter implements ILongTermStorageParameter {

  private float temperatureCelsius;
  private LongTermStorageTemperatureOption temperatureOption;

  public LongTermStorageTemperatureParameter(float temperature) {
    this.temperatureCelsius = temperature;
  }

  public LongTermStorageTemperatureParameter(LongTermStorageTemperatureOption temperatureOption) {
    this.temperatureOption = temperatureOption;
  }
}
