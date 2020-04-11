package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.exceptions.InvalidParameterCombinationException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PreCentrifugationListProviderTest {

  private ArrayList<PreCentrifugationOption> list;

  @Before
  public void setUp() {
    list = PreCentrifugationListProvider.getList();
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

    PreCentrifugationTemperatureOption temperatureOption =
        PreCentrifugationTemperatureListProvider.valueOf(new Temperature(10f));

    PreCentrifugationDelayOption delayOption = PreCentrifugationDelayListProvider.valueOf(15);

    PreCentrifugationOption preCentrifugationOption =
        PreCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertNotNull(preCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithTemperatureOptionisNull() {

    PreCentrifugationDelayOption delayOption = PreCentrifugationDelayListProvider.valueOf(15);

    PreCentrifugationListProvider.valueOf(null, delayOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithDelayOptionisNull() {

    PreCentrifugationTemperatureOption temperatureOption =
        PreCentrifugationTemperatureListProvider.valueOf(new Temperature(10f));

    PreCentrifugationListProvider.valueOf(temperatureOption, null);
  }

  @Test(expected = InvalidParameterCombinationException.class)
  public void testWithInvalidParameterCombination() {

    PreCentrifugationTemperatureOption temperatureOption =
        PreCentrifugationTemperatureListProvider.valueOf(new Temperature(35f));

    PreCentrifugationDelayOption delayOption = PreCentrifugationDelayListProvider.valueOf(300);

    PreCentrifugationListProvider.valueOf(temperatureOption, delayOption);
  }
}
