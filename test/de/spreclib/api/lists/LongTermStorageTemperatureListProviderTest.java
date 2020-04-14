package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class LongTermStorageTemperatureListProviderTest {

  private LongTermStorageTemperatureListProvider longTermStorageTemperatureListProvider;
  private List<LongTermStorageTemperatureOption> longTermStorageTemperatureList;

  @Before
  public void setUp() {
    this.longTermStorageTemperatureListProvider = new LongTermStorageTemperatureListProvider();
    this.longTermStorageTemperatureList = longTermStorageTemperatureListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(longTermStorageTemperatureList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : longTermStorageTemperatureList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues() {

    LongTermStorageTemperatureOption temperatureOption =
        this.longTermStorageTemperatureListProvider.valueOf(new Temperature(-60f));

    assertNotNull(temperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    LongTermStorageTemperatureOption temperatureOption =
        this.longTermStorageTemperatureListProvider.valueOf(new Temperature(-100f));

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    LongTermStorageTemperatureOption temperatureOption =
        this.longTermStorageTemperatureListProvider.valueOf(null);

    assertNull(temperatureOption);
  }
}
