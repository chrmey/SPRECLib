package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationDuration;
import java.time.Instant;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationDurationListProviderTest {

  private FirstCentrifugationDurationListProvider firstCentrifugationDurationListProvider;
  private List<FirstCentrifugationDurationOption> firstCentrifugationDurationList;

  @Before
  public void setUp() {
    firstCentrifugationDurationListProvider = new FirstCentrifugationDurationListProvider();
    firstCentrifugationDurationList = firstCentrifugationDurationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationDurationList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : firstCentrifugationDurationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = FirstCentrifugationDuration.values().length;
    int actual = firstCentrifugationDurationList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        this.firstCentrifugationDurationListProvider.valueOf(15);

    assertNotNull(firstCentrifugationDurationOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.firstCentrifugationDurationListProvider.valueOf(100);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenMinutesLater = Instant.ofEpochMilli(1577837700000L);

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        this.firstCentrifugationDurationListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(firstCentrifugationDurationOption);
  }

  @Test
  public void testValueOfShouldReturn10To15Minutes() throws UndefinedValueException {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        this.firstCentrifugationDurationListProvider.valueOf(10);

    assertEquals(
        FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
        firstCentrifugationDurationOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturn30Minutes() throws UndefinedValueException {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        this.firstCentrifugationDurationListProvider.valueOf(30);

    assertEquals(
        FirstCentrifugationDuration.THIRTY_MINUTES,
        firstCentrifugationDurationOption.getContainedObject());
  }
}
