package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationTemperatureListProviderTest {

  private ArrayList<FirstCentrifugationTemperatureOption> firstCentrifugationTemperatureList;

  @Before
  public void setUp() {
    firstCentrifugationTemperatureList = FirstCentrifugationTemperatureListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationTemperatureList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : firstCentrifugationTemperatureList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNotNull(firstCentrifugationTemperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    Temperature temperature = new Temperature(-20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNull(firstCentrifugationTemperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        FirstCentrifugationTemperatureListProvider.valueOf(null);

    assertNull(firstCentrifugationTemperatureOption);
  }
}
