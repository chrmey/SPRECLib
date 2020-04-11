package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.LongTermStorageContainerOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class LongTermStorageListProviderTest {

  private ArrayList<LongTermStorageOption> list;

  @Before
  public void setUp() {
    list = LongTermStorageListProvider.getList();
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

    LongTermStorageTemperatureOption temperatureOption =
        LongTermStorageTemperatureListProvider.valueOf(new Temperature(-70f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageOption longTermStorageOption =
        LongTermStorageListProvider.valueOf(temperatureOption, containerOption);

    assertNotNull(longTermStorageOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithTemperatureOptionIsNull() {

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageListProvider.valueOf(null, containerOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithContainerOptionIsNull() {

    LongTermStorageTemperatureOption temperatureOption =
        LongTermStorageTemperatureListProvider.valueOf(new Temperature(-70f));

    LongTermStorageListProvider.valueOf(temperatureOption, null);
  }

  @Test(expected = InvalidParameterCombinationException.class)
  public void testValueOfWithInvalidParameterCombination() {

    LongTermStorageTemperatureOption temperatureOption =
        LongTermStorageTemperatureListProvider.valueOf(new Temperature(10f));

    LongTermStorageContainerOption containerOption =
        new LongTermStorageContainerOption(LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML);

    LongTermStorageListProvider.valueOf(temperatureOption, containerOption);
  }
}
