package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.main.exceptions.UndefinedValueException;
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
  public void testFullListSize() {
    int expected = PreCentrifugationTemperature.values().length;
    int actual = preCentrifugationTemperatureList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfShouldReturnTwoToTenDegrees() throws UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(10.49f));

    assertEquals(
        PreCentrifugationTemperature.TWO_TO_TEN_DEGREES, temperatureOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnRoomtemperatureUpperBound() throws UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(28.49f));

    assertEquals(
        PreCentrifugationTemperature.ROOM_TEMPERATURE, temperatureOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnRoomtemperatureLowerBound() throws UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(17.5f));

    assertEquals(
        PreCentrifugationTemperature.ROOM_TEMPERATURE, temperatureOption.getContainedObject());
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.preCentrifugationTemperatureListProvider.valueOf(new Temperature(100f));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithNullValue() throws UndefinedValueException {

    this.preCentrifugationTemperatureListProvider.valueOf(null);
  }
}
