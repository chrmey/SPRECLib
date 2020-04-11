package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PostCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PostCentrifugationListProviderTest {

  private ArrayList<PostCentrifugationOption> list;

  @Before
  public void setUp() {
    list = PostCentrifugationListProvider.getList();
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

    PostCentrifugationDelayOption delayOption = PostCentrifugationDelayListProvider.valueOf(15);

    PostCentrifugationOption preCentrifugationOption =
        PostCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertNotNull(preCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithTemperatureOptionisNull() {

    PostCentrifugationDelayOption delayOption = PostCentrifugationDelayListProvider.valueOf(15);

    PostCentrifugationListProvider.valueOf(null, delayOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithDelayOptionisNull() {

    PostCentrifugationTemperatureOption temperatureOption =
        PostCentrifugationTemperatureListProvider.valueOf(new Temperature(10f));

    PostCentrifugationListProvider.valueOf(temperatureOption, null);
  }
}
