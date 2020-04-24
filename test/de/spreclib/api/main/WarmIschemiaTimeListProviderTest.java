package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.WarmIschemiaTimeListProvider;
import de.spreclib.api.main.WarmIschemiaTimeOption;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.enums.WarmIschemiaTime;
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

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

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
}
