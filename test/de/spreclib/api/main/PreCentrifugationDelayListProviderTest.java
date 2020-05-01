package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PreCentrifugationDelayListProviderTest {

  private PreCentrifugationDelayListProvider preCentrifugationDelayListProvider;
  private List<PreCentrifugationDelayOption> preCentrifugationDelayList;

  @Before
  public void setUp() {
    this.preCentrifugationDelayListProvider = new PreCentrifugationDelayListProvider();
    this.preCentrifugationDelayList = preCentrifugationDelayListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(preCentrifugationDelayList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : preCentrifugationDelayList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = PreCentrifugationDelay.values().length;
    int actual = preCentrifugationDelayList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    PreCentrifugationDelayOption delayOption = this.preCentrifugationDelayListProvider.valueOf(15);

    assertNotNull(delayOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.preCentrifugationDelayListProvider.valueOf(-1);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    PreCentrifugationDelayOption preCentrifugationDurationOption =
        this.preCentrifugationDelayListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(preCentrifugationDurationOption);
  }

  @Test
  public void testValueOfShouldReturnLessTwoHours() throws UndefinedValueException {

    PreCentrifugationDelayOption delayOption = this.preCentrifugationDelayListProvider.valueOf(59);

    assertEquals(PreCentrifugationDelay.LESS_TWO_HOURS, delayOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnGreaterEightyfourHours() throws UndefinedValueException {

    PreCentrifugationDelayOption delayOption =
        this.preCentrifugationDelayListProvider.valueOf(2880);

    assertEquals(PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS, delayOption.getContainedObject());
  }
}
