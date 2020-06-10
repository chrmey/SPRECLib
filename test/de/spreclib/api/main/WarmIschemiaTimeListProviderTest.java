package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.warmischemiatime.WarmIschemiaTime;
import java.time.Instant;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class WarmIschemiaTimeListProviderTest {

  private WarmIschemiaTimeListProvider warmIschemiaTimeListProvider;
  private List<WarmIschemiaTimeOption> warmIschemiaTimeList;

  @Before
  public void setUp() {
    this.warmIschemiaTimeListProvider = new WarmIschemiaTimeListProvider();
    this.warmIschemiaTimeList = warmIschemiaTimeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.warmIschemiaTimeList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.warmIschemiaTimeList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = WarmIschemiaTime.values().length;
    int actual = warmIschemiaTimeList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    WarmIschemiaTimeOption warmIschemiaTimeOption = this.warmIschemiaTimeListProvider.valueOf(15);

    assertNotNull(warmIschemiaTimeOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithinalidValue() throws UndefinedValueException {

    this.warmIschemiaTimeListProvider.valueOf(-15);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenMinutesLater = Instant.ofEpochMilli(1577837700000L);

    WarmIschemiaTimeOption warmIschemiaTimeOption =
        this.warmIschemiaTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(warmIschemiaTimeOption);
  }

  @Test
  public void testValueOfShouldReturnLessTwoMinutes() throws UndefinedValueException {

    WarmIschemiaTimeOption warmIschemiaTimeOption = this.warmIschemiaTimeListProvider.valueOf(1);

    assertEquals(WarmIschemiaTime.LESS_TWO_MINUTES, warmIschemiaTimeOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwoToTenMinutes() throws UndefinedValueException {

    WarmIschemiaTimeOption warmIschemiaTimeOption = this.warmIschemiaTimeListProvider.valueOf(3);

    assertEquals(WarmIschemiaTime.TWO_TO_TEN_MINUTES, warmIschemiaTimeOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnGreaterSixtyMinutes() throws UndefinedValueException {

    WarmIschemiaTimeOption warmIschemiaTimeOption = this.warmIschemiaTimeListProvider.valueOf(60);

    assertEquals(
        WarmIschemiaTime.GREATER_SIXTY_MINUTES, warmIschemiaTimeOption.getContainedObject());
  }

  @Test
  public void testGetOptionFromCodeString() {

    assertNotNull(this.warmIschemiaTimeListProvider.getOptionFromCodeString("A"));
  }

  @Test
  public void testGetOptionFromCodeStringReturnNull() {

    assertNull(this.warmIschemiaTimeListProvider.getOptionFromCodeString("AA"));
  }
}
