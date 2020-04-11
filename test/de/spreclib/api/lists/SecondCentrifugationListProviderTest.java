package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationBrakingOption;
import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
import de.spreclib.api.lists.options.SecondCentrifugationSpeedOption;
import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationListProviderTest {

  private ArrayList<SecondCentrifugationOption> list;

  @Before
  public void setUp() {
    list = SecondCentrifugationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(list.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : list) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues() {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        SecondCentrifugationSpeedListProvider.valueOf(3000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        SecondCentrifugationBrakingListProvider.valueOf(true);

    SecondCentrifugationOption secondCentrifugationOption =
        SecondCentrifugationListProvider.valueOf(
            secondCentrifugationTemperatureOption,
            secondCentrifugationDurationOption,
            secondCentrifugationSpeedOption,
            secondCentrifugationBrakingOption);

    assertNotNull(secondCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull() {

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        SecondCentrifugationSpeedListProvider.valueOf(3000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        SecondCentrifugationBrakingListProvider.valueOf(true);

    SecondCentrifugationListProvider.valueOf(
        null,
        secondCentrifugationDurationOption,
        secondCentrifugationSpeedOption,
        secondCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithDurationOptionIsNull() {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(temperature);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        SecondCentrifugationSpeedListProvider.valueOf(3000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        SecondCentrifugationBrakingListProvider.valueOf(true);

    SecondCentrifugationListProvider.valueOf(
        secondCentrifugationTemperatureOption,
        null,
        secondCentrifugationSpeedOption,
        secondCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithSpeedOptionIsNull() {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(15);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        SecondCentrifugationBrakingListProvider.valueOf(true);

    SecondCentrifugationListProvider.valueOf(
        secondCentrifugationTemperatureOption,
        secondCentrifugationDurationOption,
        null,
        secondCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithBrakingOptionIsNull() {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        SecondCentrifugationSpeedListProvider.valueOf(100);

    SecondCentrifugationListProvider.valueOf(
        secondCentrifugationTemperatureOption,
        secondCentrifugationDurationOption,
        secondCentrifugationSpeedOption,
        null);
  }
}
