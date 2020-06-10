package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.centrifugation.enums.FirstCentrifugationSpeed;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationSpeedListProviderTest {

  private FirstCentrifugationSpeedListProvider firstCentrifugationSpeedListProvider;
  private List<FirstCentrifugationSpeedOption> firstCentrifugationSpeedList;

  @Before
  public void setUp() {
    this.firstCentrifugationSpeedListProvider = new FirstCentrifugationSpeedListProvider();
    this.firstCentrifugationSpeedList = firstCentrifugationSpeedListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationSpeedList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : firstCentrifugationSpeedList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = FirstCentrifugationSpeed.values().length;
    int actual = firstCentrifugationSpeedList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    FirstCentrifugationSpeedOption speedOption =
        this.firstCentrifugationSpeedListProvider.valueOf(3000);

    assertNotNull(speedOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.firstCentrifugationSpeedListProvider.valueOf(-1);
  }

  @Test
  public void testValueOfShouldReturnLessThousandG() throws UndefinedValueException {

    FirstCentrifugationSpeedOption speedOption =
        this.firstCentrifugationSpeedListProvider.valueOf(999);

    assertEquals(FirstCentrifugationSpeed.LESS_THOUSAND_G, speedOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnLessThreeThousandG() throws UndefinedValueException {

    FirstCentrifugationSpeedOption speedOption =
        this.firstCentrifugationSpeedListProvider.valueOf(1000);

    assertEquals(FirstCentrifugationSpeed.LESS_THREETHOUSAND_G, speedOption.getContainedObject());
  }
}
