package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;
import de.spreclib.model.sprec.CodePart;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class LongTermStorageListProviderTest {

  private LongTermStorageListProvider longTermStorageListProvider;
  private List<LongTermStorageOption> longTermStorageList;

  @Before
  public void setUp() {
    this.longTermStorageListProvider = new LongTermStorageListProvider();
    this.longTermStorageList = longTermStorageListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(longTermStorageList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : longTermStorageList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = LongTermStorageList.LONG_TERM_STORAGES.size();
    int actual = longTermStorageList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValues()
      throws UndefinedValueCombinationException, UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-70f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);

    assertNotNull(longTermStorageOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull() throws UndefinedValueCombinationException {

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    this.longTermStorageListProvider.valueOf(null, containerOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithContainerOptionIsNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-70f));

    this.longTermStorageListProvider.valueOf(temperatureOption, null);
  }

  @Test(expected = UndefinedValueCombinationException.class)
  public void testValueOfWithInvalidParameterCombination()
      throws UndefinedValueCombinationException, UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(10f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);
  }

  @Test
  public void testValueOfShouldReturnCodeA()
      throws UndefinedValueCombinationException, UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-60.99999f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);

    assertEquals(
        new CodePart("A"), longTermStorageOption.getContainedObject().getCodeFromSprecFactor());
  }

  @Test
  public void testValueOfShouldReturnCodeB()
      throws UndefinedValueCombinationException, UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-35.001f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);
    assertEquals(
        new CodePart("B"), longTermStorageOption.getContainedObject().getCodeFromSprecFactor());
  }
}
