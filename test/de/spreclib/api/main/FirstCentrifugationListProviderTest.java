package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.FirstCentrifugationBrakingListProvider;
import de.spreclib.api.main.FirstCentrifugationBrakingOption;
import de.spreclib.api.main.FirstCentrifugationDurationListProvider;
import de.spreclib.api.main.FirstCentrifugationDurationOption;
import de.spreclib.api.main.FirstCentrifugationListProvider;
import de.spreclib.api.main.FirstCentrifugationOption;
import de.spreclib.api.main.FirstCentrifugationSpeedListProvider;
import de.spreclib.api.main.FirstCentrifugationSpeedOption;
import de.spreclib.api.main.FirstCentrifugationTemperatureListProvider;
import de.spreclib.api.main.FirstCentrifugationTemperatureOption;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.sprec.CodePart;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationListProviderTest {

  private FirstCentrifugationListProvider firstCentrifugationListProvider;
  private List<FirstCentrifugationOption> firstCentrifugationList;

  @Before
  public void setUp() {
    this.firstCentrifugationListProvider = new FirstCentrifugationListProvider();
    this.firstCentrifugationList = firstCentrifugationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : firstCentrifugationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues()
      throws UndefinedValueException, UndefinedValueCombinationException {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(3000);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(true);

    FirstCentrifugationOption firstCentrifugationOption =
        this.firstCentrifugationListProvider.valueOf(
            firstCentrifugationTemperatureOption,
            firstCentrifugationDurationOption,
            firstCentrifugationSpeedOption,
            firstCentrifugationBrakingOption);

    assertNotNull(firstCentrifugationOption);
  }

  @Test(expected = UndefinedValueCombinationException.class)
  public void testValueOfWithInvalidParameterCombination()
      throws UndefinedValueException, UndefinedValueCombinationException {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(15);
    // Speed 100g is invalid in this combination
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(100);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(true);

    this.firstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        firstCentrifugationDurationOption,
        firstCentrifugationSpeedOption,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull()
      throws UndefinedValueException, UndefinedValueCombinationException {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(3000);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(true);

    this.firstCentrifugationListProvider.valueOf(
        null,
        firstCentrifugationDurationOption,
        firstCentrifugationSpeedOption,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithDurationOptionIsNull()
      throws UndefinedValueException, UndefinedValueCombinationException {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(3000);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(true);

    this.firstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        null,
        firstCentrifugationSpeedOption,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithSpeedOptionIsNull()
      throws UndefinedValueException, UndefinedValueCombinationException {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(15);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(true);

    this.firstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        firstCentrifugationDurationOption,
        null,
        firstCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithBrakingOptionIsNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(100);

    this.firstCentrifugationListProvider.valueOf(
        firstCentrifugationTemperatureOption,
        firstCentrifugationDurationOption,
        firstCentrifugationSpeedOption,
        null);
  }

  @Test
  public void testValueOfShouldReturnCodeB()
      throws UndefinedValueException, UndefinedValueCombinationException {

    Temperature temperature = new Temperature(28.9999f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(15);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(2999);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(true);

    FirstCentrifugationOption firstCentrifugationOption =
        this.firstCentrifugationListProvider.valueOf(
            firstCentrifugationTemperatureOption,
            firstCentrifugationDurationOption,
            firstCentrifugationSpeedOption,
            firstCentrifugationBrakingOption);

    assertEquals(
        new CodePart("B"), firstCentrifugationOption.getContainedObject().getCodeFromSprecPart());
  }

  @Test
  public void testValueOfShouldReturnCodeM()
      throws UndefinedValueException, UndefinedValueCombinationException {

    Temperature temperature = new Temperature(28.999f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        new FirstCentrifugationTemperatureListProvider().valueOf(temperature);
    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        new FirstCentrifugationDurationListProvider().valueOf(30);
    FirstCentrifugationSpeedOption firstCentrifugationSpeedOption =
        new FirstCentrifugationSpeedListProvider().valueOf(999);
    FirstCentrifugationBrakingOption firstCentrifugationBrakingOption =
        new FirstCentrifugationBrakingListProvider().valueOf(false);

    FirstCentrifugationOption firstCentrifugationOption =
        this.firstCentrifugationListProvider.valueOf(
            firstCentrifugationTemperatureOption,
            firstCentrifugationDurationOption,
            firstCentrifugationSpeedOption,
            firstCentrifugationBrakingOption);

    assertEquals(
        new CodePart("M"), firstCentrifugationOption.getContainedObject().getCodeFromSprecPart());
  }
}
