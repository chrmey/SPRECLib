package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationTemperatureListProviderTest {

  private FirstCentrifugationTemperatureListProvider firstCentrifugationTemperatureListProvider;
  private List<FirstCentrifugationTemperatureOption> firstCentrifugationTemperatureList;

  @Before
  public void setUp() {
    this.firstCentrifugationTemperatureListProvider =
        new FirstCentrifugationTemperatureListProvider();
    this.firstCentrifugationTemperatureList = firstCentrifugationTemperatureListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.firstCentrifugationTemperatureList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.firstCentrifugationTemperatureList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    Temperature temperature = new Temperature(20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        this.firstCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNotNull(firstCentrifugationTemperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    Temperature temperature = new Temperature(-20f);

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        this.firstCentrifugationTemperatureListProvider.valueOf(temperature);

    assertNull(firstCentrifugationTemperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption =
        this.firstCentrifugationTemperatureListProvider.valueOf(null);

    assertNull(firstCentrifugationTemperatureOption);
  }
}
