package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.precentrifugation.PreCentrifugationList;
import de.spreclib.model.sprec.CodePart;
import java.time.Instant;
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
  public void testFullListSize() {
    int expected = PreCentrifugationList.PRE_CENTRIFUGATIONS.size();
    int actual = preCentrifugationList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValues()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PreCentrifugationDelayOption delayOption = new PreCentrifugationDelayListProvider().valueOf(15);

    PreCentrifugationOption preCentrifugationOption =
        this.preCentrifugationListProvider.valueOf(delayOption, temperatureOption);

    assertNotNull(preCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithTemperatureOptionisNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PreCentrifugationDelayOption delayOption = new PreCentrifugationDelayListProvider().valueOf(15);

    this.preCentrifugationListProvider.valueOf(delayOption, null);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithDelayOptionisNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    this.preCentrifugationListProvider.valueOf(null, temperatureOption);
  }

  @Test(expected = UndefinedValueCombinationException.class)
  public void testWithInvalidParameterCombination()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(35f));

    PreCentrifugationDelayOption delayOption =
        new PreCentrifugationDelayListProvider().valueOf(300);

    this.preCentrifugationListProvider.valueOf(delayOption, temperatureOption);
  }

  @Test
  public void testValueOfShouldReturnCodeA()
      throws UndefinedValueCombinationException, UndefinedValueException {

    Instant collectionTime = Instant.ofEpochMilli(1577836800000L);
    Instant firstCentrifugationStartTime = Instant.ofEpochMilli(1577837700000L);

    // Timespan is 15 minutes
    PreCentrifugationDelayOption delayOption =
        new PreCentrifugationDelayListProvider()
            .valueOf(collectionTime, firstCentrifugationStartTime);

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(18f));

    PreCentrifugationOption preCentrifugationOption =
        this.preCentrifugationListProvider.valueOf(delayOption, temperatureOption);

    assertEquals(
        new CodePart("A"), preCentrifugationOption.getContainedObject().getCodeFromSprecFactor());
  }

  @Test
  public void testValueOfShouldReturnCodeN()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PreCentrifugationTemperatureOption temperatureOption =
        new PreCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PreCentrifugationDelayOption delayOption =
        new PreCentrifugationDelayListProvider().valueOf(2880);

    PreCentrifugationOption preCentrifugationOption =
        this.preCentrifugationListProvider.valueOf(delayOption, temperatureOption);

    assertEquals(
        new CodePart("N"), preCentrifugationOption.getContainedObject().getCodeFromSprecFactor());
  }
}
