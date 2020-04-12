package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FixationTimeOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FixationTimeListProviderTest {

  private ArrayList<FixationTimeOption> list;

  @Before
  public void setUp() {
    list = FixationTimeListProvider.getList();
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

    FixationTimeOption fixationTimeOption = FixationTimeListProvider.valueOf(15);

    assertNotNull(fixationTimeOption);
  }

  @Test
  public void testValueOfWithinalidValue() {

    FixationTimeOption fixationTimeOption = FixationTimeListProvider.valueOf(-15);

    assertNull(fixationTimeOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    FixationTimeOption fixationTimeOption =
        FixationTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(fixationTimeOption);
  }
}
