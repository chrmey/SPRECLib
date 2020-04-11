package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PostCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PostCentrifugationTemperatureListProviderTest {

  private ArrayList<PostCentrifugationTemperatureOption> list;

  @Before
  public void setUp() {
    list = PostCentrifugationTemperatureListProvider.getList();
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

    PostCentrifugationTemperatureOption temperatureOption =
        PostCentrifugationTemperatureListProvider.valueOf(new Temperature(10f));

    assertNotNull(temperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    PostCentrifugationTemperatureOption temperatureOption =
        PostCentrifugationTemperatureListProvider.valueOf(new Temperature(100f));

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    PostCentrifugationTemperatureOption temperatureOption =
        PostCentrifugationTemperatureListProvider.valueOf(null);

    assertNull(temperatureOption);
  }
}
