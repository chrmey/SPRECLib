package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.LongTermStorageTemperatureListProvider;
import de.spreclib.api.main.LongTermStorageTemperatureOption;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
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
  public void testValueOfWithValidValues() throws UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        this.longTermStorageTemperatureListProvider.valueOf(new Temperature(-60.9999f));

    assertNotNull(temperatureOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.longTermStorageTemperatureListProvider.valueOf(new Temperature(-100f));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithNullValue() throws UndefinedValueException {

    this.longTermStorageTemperatureListProvider.valueOf(null);
  }

  @Test
  public void testValueOfShouldReturnMinus35ToMinus18() throws UndefinedValueException {

    LongTermStorageTemperatureOption temperatureOption =
        new LongTermStorageTemperatureListProvider().valueOf(new Temperature(-35.9999f));

    assertEquals(
        LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
        temperatureOption.getContainedObject());
  }
}
