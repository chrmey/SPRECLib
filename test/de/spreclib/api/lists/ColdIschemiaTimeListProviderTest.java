package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class ColdIschemiaTimeListProviderTest {

  private ArrayList<ColdIschemiaTimeOption> list;

  @Before
  public void setUp() {
    list = ColdIschemiaTimeListProvider.getList();
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

    ColdIschemiaTimeOption coldIschemiaTimeOption = ColdIschemiaTimeListProvider.valueOf(15);

    assertNotNull(coldIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithinalidValue() {

    ColdIschemiaTimeOption coldIschemiaTimeOption = ColdIschemiaTimeListProvider.valueOf(-15);

    assertNull(coldIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        ColdIschemiaTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(coldIschemiaTimeOption);
  }
}
