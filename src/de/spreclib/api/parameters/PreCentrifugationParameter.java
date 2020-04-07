package de.spreclib.api.parameters;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;

public class PreCentrifugationParameter {

  private final PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter;
  private final PreCentrifugationDelayParameter preCentrifugationDelayParameter;

  public PreCentrifugationParameter(
      PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter,
      PreCentrifugationDelayParameter preCentrifugationDelayParameter) {

    if (preCentrifugationTemperatureParameter == null) {
      throw new IllegalArgumentException("PreCentrifugationTemperatureParameter cannot be null");
    }

    if (preCentrifugationDelayParameter == null) {
      throw new IllegalArgumentException("PreCentrifugationDelayParameter cannot be null");
    }

    this.preCentrifugationTemperatureParameter = preCentrifugationTemperatureParameter;
    this.preCentrifugationDelayParameter = preCentrifugationDelayParameter;
  }

  public PreCentrifugation getPreCentrifugation() {

    PreCentrifugationTemperature temperature =
        this.preCentrifugationTemperatureParameter.getPreCentrifugationTemperature();
    PreCentrifugationDelay delay = this.preCentrifugationDelayParameter.getPreCentrifugationDelay();

    PreCentrifugation preCentrifugation =
        PreCentrifugationList.getPreCentrifugationFromParameters(temperature, delay);

    return preCentrifugation;
  }
}
