package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.coldischemiatime.ColdIschemiaTime;
import java.time.Instant;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ColdIschemiaTimeListProviderTest {

  private ColdIschemiaTimeListProvider coldIschemiaTimeListProvider;
  private List<ColdIschemiaTimeOption> coldIschemiaTimeList;

  @Before
  public void setUp() {
    this.coldIschemiaTimeListProvider = new ColdIschemiaTimeListProvider();
    coldIschemiaTimeList = coldIschemiaTimeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(coldIschemiaTimeList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : coldIschemiaTimeList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = ColdIschemiaTime.values().length;
    int actual = coldIschemiaTimeList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    ColdIschemiaTimeOption coldIschemiaTimeOption = this.coldIschemiaTimeListProvider.valueOf(15);

    assertNotNull(coldIschemiaTimeOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInalidValue() throws UndefinedValueException {

    this.coldIschemiaTimeListProvider.valueOf(-15);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenMinutesLater = Instant.ofEpochMilli(1577837700000L);

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        this.coldIschemiaTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(coldIschemiaTimeOption);
  }

  @Test
  public void testValueOfShouldReturnLessOTwoMinutes() throws UndefinedValueException {

    ColdIschemiaTimeOption coldIschemiaTimeOption = this.coldIschemiaTimeListProvider.valueOf(1);

    assertEquals(ColdIschemiaTime.LESS_TWO_MINUTES, coldIschemiaTimeOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwoToTenMinutes() throws UndefinedValueException {

    ColdIschemiaTimeOption coldIschemiaTimeOption = this.coldIschemiaTimeListProvider.valueOf(3);

    assertEquals(ColdIschemiaTime.TWO_TO_TEN_MINUTES, coldIschemiaTimeOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnGreaterSixtyMinutes() throws UndefinedValueException {

    ColdIschemiaTimeOption coldIschemiaTimeOption = this.coldIschemiaTimeListProvider.valueOf(60);

    assertEquals(
        ColdIschemiaTime.GREATER_SIXTY_MINUTES, coldIschemiaTimeOption.getContainedObject());
  }
}
