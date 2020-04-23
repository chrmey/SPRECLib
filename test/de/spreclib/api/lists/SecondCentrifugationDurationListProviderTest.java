package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationDurationListProviderTest {

  private SecondCentrifugationDurationListProvider secondCentrifugationDurationListProvider;
  private List<SecondCentrifugationDurationOption> secondCentrifugationDurationList;

  @Before
  public void setUp() {
    this.secondCentrifugationDurationListProvider = new SecondCentrifugationDurationListProvider();
    this.secondCentrifugationDurationList = secondCentrifugationDurationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.secondCentrifugationDurationList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.secondCentrifugationDurationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        this.secondCentrifugationDurationListProvider.valueOf(15);

    assertNotNull(secondCentrifugationDurationOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.secondCentrifugationDurationListProvider.valueOf(100);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        this.secondCentrifugationDurationListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(secondCentrifugationDurationOption);
  }

  @Test
  public void testValueOfShouldReturn10To15Minutes() throws UndefinedValueException {

    SecondCentrifugationDurationOption secondCentrifugationDurationOption =
        this.secondCentrifugationDurationListProvider.valueOf(10);

    assertEquals(
        SecondCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
        secondCentrifugationDurationOption.getContainedObject());
  }
}
