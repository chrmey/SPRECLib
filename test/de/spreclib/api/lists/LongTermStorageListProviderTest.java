package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.LongTermStorageContainerOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
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
  public void testValueOfWithValidValues() {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-70f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);

    assertNotNull(longTermStorageOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull() {

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    this.longTermStorageListProvider.valueOf(null, containerOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithContainerOptionIsNull() {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-70f));

    this.longTermStorageListProvider.valueOf(temperatureOption, null);
  }

  @Test(expected = InvalidParameterCombinationException.class)
  public void testValueOfWithInvalidParameterCombination() {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(10f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);
  }

  @Test
  public void testValueOfShouldReturnCodeA() {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-60.99999f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);

    assertEquals(
        new CodePart("A"), longTermStorageOption.getContainedObject().getCodeFromSprecPart());
  }

  @Test
  public void testValueOfShouldReturnCodeB() {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-35.001f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        this.longTermStorageListProvider.valueOf(temperatureOption, containerOption);
    assertEquals(
        new CodePart("B"), longTermStorageOption.getContainedObject().getCodeFromSprecPart());
  }
}
