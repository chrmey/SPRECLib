package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import de.spreclib.model.sprec.CodePart;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class ColdIschemiaTimeListProviderTest {

  private ColdIschemiaTimeListProvider coldIschemiaTimeListProvider;
  private List<ColdIschemiaTimeOption> coldIschemiaTimeList;

  @Before
  public void setUp() {
    this.coldIschemiaTimeListProvider = new ColdIschemiaTimeListProvider();
    coldIschemiaTimeList = coldIschemiaTimeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(coldIschemiaTimeList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : coldIschemiaTimeList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        this.coldIschemiaTimeListProvider.valueOf(15);

    assertNotNull(coldIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithinalidValue() {

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        this.coldIschemiaTimeListProvider.valueOf(-15);

    assertNull(coldIschemiaTimeOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        this.coldIschemiaTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(coldIschemiaTimeOption);
  }

  @Test
  public void testValueOfShouldReturnCodeA() {

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        this.coldIschemiaTimeListProvider.valueOf(1);

    assertEquals(
        new CodePart("A"), coldIschemiaTimeOption.getContainedObject().getCodeFromSprecPart());
  }

  @Test
  public void testValueOfShouldReturnCodeB() {

    ColdIschemiaTimeOption coldIschemiaTimeOption =
        this.coldIschemiaTimeListProvider.valueOf(3);

    assertEquals(
        new CodePart("B"), coldIschemiaTimeOption.getContainedObject().getCodeFromSprecPart());
  }
}
