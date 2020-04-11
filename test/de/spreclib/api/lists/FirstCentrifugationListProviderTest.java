package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationBrakingOption;
import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
import de.spreclib.api.lists.options.FirstCentrifugationOption;
import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.exceptions.InvalidParameterCombinationException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationListProviderTest {

  private ArrayList<FirstCentrifugationOption> list;

  @Before
  public void setUp() {
    list = FirstCentrifugationListProvider.getList();
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

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        FirstCentrifugationSpeedListProvider.valueOf(3000);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        FirstCentrifugationBrakingListProvider.valueOf(true);

    FirstCentrifugationOption firstCentrifugationOption =
        FirstCentrifugationListProvider.valueOf(
            firstCentrifugationTemperatureOption,
            firstCentrifugationDurationOption,
            firstCentrifugationSpeedOption,
            firstCentrifugationBrakingOption);

    assertNotNull(firstCentrifugationOption);
  }

  @Test(expected = InvalidParameterCombinationException.class)
  public void testValueOfWithInvalidParameterCombination() {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(15);
    // Speed 100g is invalid in this combination
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        FirstCentrifugationSpeedListProvider.valueOf(100);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        FirstCentrifugationBrakingListProvider.valueOf(true);

    FirstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        firstCentrifugationDurationOption,
        firstCentrifugationSpeedOption,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull() {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        FirstCentrifugationSpeedListProvider.valueOf(3000);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        FirstCentrifugationBrakingListProvider.valueOf(true);

    FirstCentrifugationListProvider.valueOf(
        null,
        firstCentrifugationDurationOption,
        firstCentrifugationSpeedOption,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithDurationOptionIsNull() {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        FirstCentrifugationSpeedListProvider.valueOf(3000);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        FirstCentrifugationBrakingListProvider.valueOf(true);

    FirstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        null,
        firstCentrifugationSpeedOption,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithSpeedOptionIsNull() {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(15);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        FirstCentrifugationBrakingListProvider.valueOf(true);

    FirstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        firstCentrifugationDurationOption,
        null,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithBrakingOptionIsNull() {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        FirstCentrifugationSpeedListProvider.valueOf(100);

    FirstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        firstCentrifugationDurationOption,
        firstCentrifugationSpeedOption,
        null);
  }
}
