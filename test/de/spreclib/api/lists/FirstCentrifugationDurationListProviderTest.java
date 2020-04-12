package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationDurationListProviderTest {

  private ArrayList<FirstCentrifugationDurationOption> list;

  @Before
  public void setUp() {
    list = FirstCentrifugationDurationListProvider.getList();
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

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(15);

    assertNotNull(firstCentrifugationDurationOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(100);

    assertNull(firstCentrifugationDurationOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        FirstCentrifugationDurationListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(firstCentrifugationDurationOption);
  }
}
