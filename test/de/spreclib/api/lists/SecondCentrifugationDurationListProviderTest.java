package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationDurationListProviderTest {

  private ArrayList<SecondCentrifugationDurationOption> list;

  @Before
  public void setUp() {
    list = SecondCentrifugationDurationListProvider.getList();
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

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(15);

    assertNotNull(secondCentrifugationDurationOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(100);

    assertNull(secondCentrifugationDurationOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        SecondCentrifugationDurationListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(secondCentrifugationDurationOption);
  }
}
