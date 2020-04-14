package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.lists.options.PreCentrifugationOption;
import de.spreclib.api.lists.options.PreCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PreCentrifugationListProviderTest {

  private PreCentrifugationListProvider preCentrifugationListProvider;
  private List<PreCentrifugationOption> preCentrifugationList;

  @Before
  public void setUp() {
    this.preCentrifugationListProvider = new PreCentrifugationListProvider();
    this.preCentrifugationList = preCentrifugationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.preCentrifugationList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.preCentrifugationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues() {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PreCentrifugationDelayOption delayOption = new PreCentrifugationDelayListProvider().valueOf(15);

    PreCentrifugationOption preCentrifugationOption =
        this.preCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertNotNull(preCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithTemperatureOptionisNull() {

    PreCentrifugationDelayOption delayOption = new PreCentrifugationDelayListProvider().valueOf(15);

    this.preCentrifugationListProvider.valueOf(null, delayOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithDelayOptionisNull() {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    this.preCentrifugationListProvider.valueOf(temperatureOption, null);
  }

  @Test(expected = InvalidParameterCombinationException.class)
  public void testWithInvalidParameterCombination() {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(35f));

    PreCentrifugationDelayOption delayOption =
        new PreCentrifugationDelayListProvider().valueOf(300);

    this.preCentrifugationListProvider.valueOf(temperatureOption, delayOption);
  }
}
