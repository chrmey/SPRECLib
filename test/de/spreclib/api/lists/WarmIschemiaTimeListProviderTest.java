package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
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
  public void testValueOfWithValidValue() {

    WarmIschemiaTimeOption warmIschemiaTimeOption = this.warmIschemiaTimeListProvider.valueOf(15);

    assertNotNull(warmIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithinalidValue() {

    WarmIschemiaTimeOption warmIschemiaTimeOption = this.warmIschemiaTimeListProvider.valueOf(-15);

    assertNull(warmIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    WarmIschemiaTimeOption warmIschemiaTimeOption =
        this.warmIschemiaTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(warmIschemiaTimeOption);
  }
}
