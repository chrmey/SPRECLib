package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.fixationtime.FixationTime;
import de.spreclib.model.sprec.CodePart;
import java.time.Instant;
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
  public void testFullListSize() {
    int expected = FixationTime.values().length;
    int actual = fixationTimeList.size();

    assertEquals(expected, actual);
  }
 

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    FixationTimeOption valueOf = this.fixationTimeListProvider.valueOf(15);
    FixationTimeOption fixationTimeOption = valueOf;

    assertNotNull(fixationTimeOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.fixationTimeListProvider.valueOf(-15);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenMinutesLater = Instant.ofEpochMilli(1577837700000L);

    FixationTimeOption fixationTimeOption =
        this.fixationTimeListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(fixationTimeOption);
  }

  @Test
  public void testShouldReturnLess15Minutes() throws UndefinedValueException {

    FixationTimeOption fixationTimeOption = this.fixationTimeListProvider.valueOf(14);

    assertEquals(FixationTime.LESS_FIFTEEN_MINUTES, fixationTimeOption.getContainedObject());
  }

  @Test
  public void testShouldReturnCodeB() throws UndefinedValueException {

    FixationTimeOption fixationTimeOption = this.fixationTimeListProvider.valueOf(15);

    assertEquals(new CodePart("B"), fixationTimeOption.getContainedObject().getCodeFromSprecFactor());
  }
}
