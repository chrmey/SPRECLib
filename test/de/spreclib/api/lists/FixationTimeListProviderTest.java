package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FixationTimeOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FixationTimeListProviderTest {

  private FixationTimeListProvider fixationTimeListProvider;
  private List<FixationTimeOption> fixationTimeList;

  @Before
  public void setUp() {
    this.fixationTimeListProvider = new FixationTimeListProvider();
    this.fixationTimeList = fixationTimeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(fixationTimeList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : fixationTimeList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    FixationTimeOption fixationTimeOption = this.fixationTimeListProvider.valueOf(15);

    assertNotNull(fixationTimeOption);
  }

  @Test
  public void testValueOfWithinalidValue() {

    FixationTimeOption fixationTimeOption = this.fixationTimeListProvider.valueOf(-15);

    assertNull(fixationTimeOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    FixationTimeOption fixationTimeOption =
        this.fixationTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(fixationTimeOption);
  }
}
