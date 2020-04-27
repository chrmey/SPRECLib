package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.SecondCentrifugationBrakingListProvider;
import de.spreclib.api.main.SecondCentrifugationBrakingOption;
import de.spreclib.api.main.SecondCentrifugationDurationListProvider;
import de.spreclib.api.main.SecondCentrifugationDurationOption;
import de.spreclib.api.main.SecondCentrifugationListProvider;
import de.spreclib.api.main.SecondCentrifugationOption;
import de.spreclib.api.main.SecondCentrifugationSpeedListProvider;
import de.spreclib.api.main.SecondCentrifugationSpeedOption;
import de.spreclib.api.main.SecondCentrifugationTemperatureListProvider;
import de.spreclib.api.main.SecondCentrifugationTemperatureOption;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.sprec.CodePart;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationListProviderTest {

  private SecondCentrifugationListProvider secondCentrifugationListProvider;
  private List<SecondCentrifugationOption> secondCentrifugationList;

  @Before
  public void setUp() {
    this.secondCentrifugationListProvider = new SecondCentrifugationListProvider();
    this.secondCentrifugationList = secondCentrifugationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.secondCentrifugationList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.secondCentrifugationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        new SecondCentrifugationTemperatureListProvider().valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        new SecondCentrifugationDurationListProvider().valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        new SecondCentrifugationSpeedListProvider().valueOf(3000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        new SecondCentrifugationBrakingListProvider().valueOf(true);

    SecondCentrifugationOption secondCentrifugationOption =
        this.secondCentrifugationListProvider.valueOf(
            secondCentrifugationTemperatureOption,
            secondCentrifugationDurationOption,
            secondCentrifugationSpeedOption,
            secondCentrifugationBrakingOption);

    assertNotNull(secondCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        new SecondCentrifugationDurationListProvider().valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        new SecondCentrifugationSpeedListProvider().valueOf(3000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        new SecondCentrifugationBrakingListProvider().valueOf(true);

    this.secondCentrifugationListProvider.valueOf(
        null,
        secondCentrifugationDurationOption,
        secondCentrifugationSpeedOption,
        secondCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithDurationOptionIsNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        new SecondCentrifugationTemperatureListProvider().valueOf(temperature);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        new SecondCentrifugationSpeedListProvider().valueOf(3000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        new SecondCentrifugationBrakingListProvider().valueOf(true);

    this.secondCentrifugationListProvider.valueOf(
        secondCentrifugationTemperatureOption,
        null,
        secondCentrifugationSpeedOption,
        secondCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithSpeedOptionIsNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        new SecondCentrifugationTemperatureListProvider().valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        new SecondCentrifugationDurationListProvider().valueOf(15);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        new SecondCentrifugationBrakingListProvider().valueOf(true);

    this.secondCentrifugationListProvider.valueOf(
        secondCentrifugationTemperatureOption,
        secondCentrifugationDurationOption,
        null,
        secondCentrifugationBrakingOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithBrakingOptionIsNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        new SecondCentrifugationTemperatureListProvider().valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        new SecondCentrifugationDurationListProvider().valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        new SecondCentrifugationSpeedListProvider().valueOf(100);

    this.secondCentrifugationListProvider.valueOf(
        secondCentrifugationTemperatureOption,
        secondCentrifugationDurationOption,
        secondCentrifugationSpeedOption,
        null);
  }

  @Test
  public void testValueOfShouldReturnCodeA()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(28.9999f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        new SecondCentrifugationTemperatureListProvider().valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        new SecondCentrifugationDurationListProvider().valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        new SecondCentrifugationSpeedListProvider().valueOf(2999);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        new SecondCentrifugationBrakingListProvider().valueOf(false);

    SecondCentrifugationOption secondCentrifugationOption =
        this.secondCentrifugationListProvider.valueOf(
            secondCentrifugationTemperatureOption,
            secondCentrifugationDurationOption,
            secondCentrifugationSpeedOption,
            secondCentrifugationBrakingOption);

    assertEquals(
        new CodePart("A"), secondCentrifugationOption.getContainedObject().getCodeFromSprecPart());
  }

  @Test
  public void testValueOfShouldReturnCodeJ()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Temperature temperature = new Temperature(10.9999f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        new SecondCentrifugationTemperatureListProvider().valueOf(temperature);
    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        new SecondCentrifugationDurationListProvider().valueOf(15);
    SecondCentrifugationSpeedOption secondCentrifugationSpeedOption =
        new SecondCentrifugationSpeedListProvider().valueOf(10000);
    SecondCentrifugationBrakingOption secondCentrifugationBrakingOption =
        new SecondCentrifugationBrakingListProvider().valueOf(true);

    SecondCentrifugationOption secondCentrifugationOption =
        this.secondCentrifugationListProvider.valueOf(
            secondCentrifugationTemperatureOption,
            secondCentrifugationDurationOption,
            secondCentrifugationSpeedOption,
            secondCentrifugationBrakingOption);

    assertEquals(
        new CodePart("J"), secondCentrifugationOption.getContainedObject().getCodeFromSprecPart());
  }
}
