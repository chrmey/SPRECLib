package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PreCentrifugationTemperatureListProviderTest {

  private PreCentrifugationTemperatureListProvider preCentrifugationTemperatureListProvider;
  private List<PreCentrifugationTemperatureOption> preCentrifugationTemperatureList;

  @Before
  public void setUp() {
    this.preCentrifugationTemperatureListProvider = new PreCentrifugationTemperatureListProvider();
    this.preCentrifugationTemperatureList = preCentrifugationTemperatureListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.preCentrifugationTemperatureList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.preCentrifugationTemperatureList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues() {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(10.9999f));

    assertNotNull(temperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(100f));

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(null);

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfShouldReturnRoomtemperature() {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(28.9999f));

    assertEquals(
        PreCentrifugationTemperature.ROOM_TEMPERATURE, temperatureOption.getContainedObject());
  }
}
