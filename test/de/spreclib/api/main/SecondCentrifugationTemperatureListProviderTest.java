package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.SecondCentrifugationTemperatureListProvider;
import de.spreclib.api.main.SecondCentrifugationTemperatureOption;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationTemperatureListProviderTest {

  private SecondCentrifugationTemperatureListProvider secondCentrifugationTemperatureListProvider;
  private List<SecondCentrifugationTemperatureOption> secondCentrifugationTemperatureList;

  @Before
  public void setUp() {
    this.secondCentrifugationTemperatureListProvider =
        new SecondCentrifugationTemperatureListProvider();
    this.secondCentrifugationTemperatureList =
        secondCentrifugationTemperatureListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.secondCentrifugationTemperatureList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.secondCentrifugationTemperatureList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        this.secondCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNotNull(secondCentrifugationTemperatureOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    Temperature temperature = new Temperature(-20f);

    this.secondCentrifugationTemperatureListProvider.valueOf(temperature);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithNullValue() throws UndefinedValueException {

    this.secondCentrifugationTemperatureListProvider.valueOf(null);
  }

  @Test
  public void testValueOfShouldReturnRoomTemperature() throws UndefinedValueException {

    Temperature temperature = new Temperature(28.9999f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        this.secondCentrifugationTemperatureListProvider.valueOf(temperature);

    assertEquals(
        SecondCentrifugationTemperature.ROOM_TEMPERATURE,
        secondCentrifugationTemperatureOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwotoTenDegrees() throws UndefinedValueException {

    Temperature temperature = new Temperature(10.9999f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        this.secondCentrifugationTemperatureListProvider.valueOf(temperature);

    assertEquals(
        SecondCentrifugationTemperature.TWO_TO_TEN_DEGREES,
        secondCentrifugationTemperatureOption.getContainedObject());
  }
}
