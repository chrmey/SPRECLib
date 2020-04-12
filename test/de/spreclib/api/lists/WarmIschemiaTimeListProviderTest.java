package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.WarmIschemiaTimeOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class WarmIschemiaTimeListProviderTest {

  private ArrayList<WarmIschemiaTimeOption> list;

  @Before
  public void setUp() {
    list = WarmIschemiaTimeListProvider.getList();
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
  public void testValueOfWithValidValue() {

    WarmIschemiaTimeOption warmIschemiaTimeOption = WarmIschemiaTimeListProvider.valueOf(15);

    assertNotNull(warmIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithinalidValue() {

    WarmIschemiaTimeOption warmIschemiaTimeOption = WarmIschemiaTimeListProvider.valueOf(-15);

    assertNull(warmIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    WarmIschemiaTimeOption warmIschemiaTimeOption =
        WarmIschemiaTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(warmIschemiaTimeOption);
  }
}
