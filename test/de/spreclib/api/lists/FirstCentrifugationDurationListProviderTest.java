package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
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
  public void testValueOfWithValidValue() {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption = firstCentrifugationDurationListProvider.valueOf(15);

    assertNotNull(firstCentrifugationDurationOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    FirstCentrifugationDurationOption firstCentrifugationDurationOption = firstCentrifugationDurationListProvider.valueOf(100);

    assertNull(firstCentrifugationDurationOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    FirstCentrifugationDurationOption firstCentrifugationDurationOption =
        firstCentrifugationDurationListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(firstCentrifugationDurationOption);
  }
}
