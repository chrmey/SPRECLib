package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationBrakingListProviderTest {

  private FirstCentrifugationBrakingListProvider firstCentrifugationBrakingListProvider;
  private List<FirstCentrifugationBrakingOption> firstCentrifugationBrakingList;

  @Before
  public void setUp() {
    this.firstCentrifugationBrakingListProvider = new FirstCentrifugationBrakingListProvider();
    this.firstCentrifugationBrakingList = firstCentrifugationBrakingListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationBrakingList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.firstCentrifugationBrakingList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = CentrifugationBraking.values().length;
    int actual = firstCentrifugationBrakingList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testWithValidValue() throws UndefinedValueException {

    FirstCentrifugationBrakingOption brakingOption =
        this.firstCentrifugationBrakingListProvider.valueOf(true);

    assertNotNull(brakingOption);
  }

  @Test
  public void testValueOfShouldReturnWithBraking() throws UndefinedValueException {

    FirstCentrifugationBrakingOption brakingOption =
        this.firstCentrifugationBrakingListProvider.valueOf(true);

    assertEquals(CentrifugationBraking.WITH_BRAKING, brakingOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnNoBraking() throws UndefinedValueException {

    FirstCentrifugationBrakingOption brakingOption =
        this.firstCentrifugationBrakingListProvider.valueOf(false);

    assertEquals(CentrifugationBraking.NO_BRAKING, brakingOption.getContainedObject());
  }
}
