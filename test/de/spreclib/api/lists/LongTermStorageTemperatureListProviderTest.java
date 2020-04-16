package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
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
        this.longTermStorageTemperatureListProvider.valueOf(new Temperature(-60.9999f));

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

  @Test
  public void testValueOfShouldReturnMinus35ToMinus18() {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-35.9999f));

    assertEquals(
        LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
        temperatureOption.getContainedObject());
  }
}
