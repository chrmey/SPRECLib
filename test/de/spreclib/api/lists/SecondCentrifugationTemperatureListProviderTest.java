package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationTemperatureListProviderTest {

  private ArrayList<SecondCentrifugationTemperatureOption> list;

  @Before
  public void setUp() {
    list = SecondCentrifugationTemperatureListProvider.getList();
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
  public void testValueOfWithValidValue() {

    Temperature temperature = new Temperature(20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNotNull(secondCentrifugationTemperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    Temperature temperature = new Temperature(-20f);

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNull(secondCentrifugationTemperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption =
        SecondCentrifugationTemperatureListProvider.valueOf(null);

    assertNull(secondCentrifugationTemperatureOption);
  }
}
