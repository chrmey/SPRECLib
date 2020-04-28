package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.PreCentrifugationTemperatureListProvider;
import de.spreclib.api.main.PreCentrifugationTemperatureOption;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;
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
  public void testValueOfWithValidValues() throws UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(10.9999f));

    assertNotNull(temperatureOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(100f));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithNullValue() throws UndefinedValueException {

    this.preCentrifugationTemperatureListProvider.valueOf(null);
  }

  @Test
  public void testValueOfShouldReturnRoomtemperature() throws UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(28.9999f));

    assertEquals(
        PreCentrifugationTemperature.ROOM_TEMPERATURE, temperatureOption.getContainedObject());
  }
}
