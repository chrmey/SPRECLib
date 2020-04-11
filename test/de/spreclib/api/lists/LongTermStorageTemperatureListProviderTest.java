package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class LongTermStorageTemperatureListProviderTest {

  private ArrayList<LongTermStorageTemperatureOption> list;

  @Before
  public void setUp() {
    list = LongTermStorageTemperatureListProvider.getList();
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
        LongTermStorageTemperatureListProvider.valueOf(new Temperature(-60f));

    assertNotNull(temperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    LongTermStorageTemperatureOption temperatureOption =
        LongTermStorageTemperatureListProvider.valueOf(new Temperature(-100f));

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    LongTermStorageTemperatureOption temperatureOption =
        LongTermStorageTemperatureListProvider.valueOf(null);

    assertNull(temperatureOption);
  }
}
