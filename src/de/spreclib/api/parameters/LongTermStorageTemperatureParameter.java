package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.interfaces.ILongTermStorageParameter;

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
