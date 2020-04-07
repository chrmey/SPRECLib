package de.spreclib.api.parameters;


import static org.junit.Assert.assertNotNull;
import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import org.junit.Test;

public class PreCentrifugationTemperatureParameterTest {

  @Test
  public void testWithOption() {

    PreCentrifugationTemperature preCentrifugationTemperature =
        PreCentrifugationTemperature.ROOM_TEMPERATURE;
    PreCentrifugationTemperatureOption preCentrifugationTemperatureOption =
        new PreCentrifugationTemperatureOption(preCentrifugationTemperature);

    PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter =
        new PreCentrifugationTemperatureParameter(preCentrifugationTemperatureOption);

    assertNotNull(preCentrifugationTemperatureParameter.getPreCentrifugationTemperature());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithOptionIsNull() {

    PreCentrifugationTemperatureOption preCentrifugationTemperatureOption = null;

     new PreCentrifugationTemperatureParameter(preCentrifugationTemperatureOption);
  }

  @Test
  public void testWithTemperatureValue() {

    PreCentrifugationTemperatureParameter preCentrifugationTemperatureParameter =
        new PreCentrifugationTemperatureParameter(2);

    assertNotNull(preCentrifugationTemperatureParameter.getPreCentrifugationTemperature());
  }
  
}
