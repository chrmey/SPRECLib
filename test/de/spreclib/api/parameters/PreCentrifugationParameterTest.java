package de.spreclib.api.parameters;

import static org.junit.Assert.*;

import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import org.junit.Test;

public class PreCentrifugationParameterTest {

  @Test
  public void testWithValidParameters() {

    PreCentrifugationTemperature preCentrifugationTemperature =
        PreCentrifugationTemperature.ROOM_TEMPERATURE;
    PreCentrifugationTemperatureOption preCentrifugationTemperatureOption =
        new PreCentrifugationTemperatureOption(preCentrifugationTemperature);
    PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter =
        new PreCentrifugationTemperatureParameter(preCentrifugationTemperatureOption);

    PreCentrifugationDelay preCentrifugationDelay = PreCentrifugationDelay.LESS_TWO_HOURS;
    PreCentrifugationDelayOption preCentrifugationDelayOption =
        new PreCentrifugationDelayOption(preCentrifugationDelay);
    PreCentrifugationDelayParameter preCentrifugationDelayParameter =
        new PreCentrifugationDelayParameter(preCentrifugationDelayOption);

    PreCentrifugationParameter preCentrifugationParameter =
        new PreCentrifugationParameter(
            preCentrifugationTemperatureParameter, preCentrifugationDelayParameter);

    assertNotNull(preCentrifugationParameter.getPreCentrifugation());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureParameterIsNull() {

    PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter = null;

    PreCentrifugationDelay preCentrifugationDelay = PreCentrifugationDelay.LESS_TWO_HOURS;
    PreCentrifugationDelayOption preCentrifugationDelayOption =
        new PreCentrifugationDelayOption(preCentrifugationDelay);
    PreCentrifugationDelayParameter preCentrifugationDelayParameter =
        new PreCentrifugationDelayParameter(preCentrifugationDelayOption);

    new PreCentrifugationParameter(
        preCentrifugationTemperatureParameter, preCentrifugationDelayParameter);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithDelayParameterIsNull() {

    PreCentrifugationTemperature preCentrifugationTemperature =
        PreCentrifugationTemperature.ROOM_TEMPERATURE;
    PreCentrifugationTemperatureOption preCentrifugationTemperatureOption =
        new PreCentrifugationTemperatureOption(preCentrifugationTemperature);
    PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter =
        new PreCentrifugationTemperatureParameter(preCentrifugationTemperatureOption);

    PreCentrifugationDelayParameter preCentrifugationDelayParameter = null;

    new PreCentrifugationParameter(
        preCentrifugationTemperatureParameter, preCentrifugationDelayParameter);
  }
}
