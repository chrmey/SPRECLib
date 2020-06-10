package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationSpeed;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationSpeedListProviderTest {

  private SecondCentrifugationSpeedListProvider secondCentrifugationSpeedListProvider;
  private List<SecondCentrifugationSpeedOption> secondCentrifugationSpeedList;

  @Before
  public void setUp() {
    this.secondCentrifugationSpeedListProvider = new SecondCentrifugationSpeedListProvider();
    this.secondCentrifugationSpeedList = secondCentrifugationSpeedListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.secondCentrifugationSpeedList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.secondCentrifugationSpeedList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = SecondCentrifugationSpeed.values().length;
    int actual = secondCentrifugationSpeedList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    SecondCentrifugationSpeedOption speedOption =
        this.secondCentrifugationSpeedListProvider.valueOf(3000);

    assertNotNull(speedOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.secondCentrifugationSpeedListProvider.valueOf(-1);
  }

  @Test
  public void testValueOfShouldReturnLessThreehousandG() throws UndefinedValueException {

    SecondCentrifugationSpeedOption speedOption =
        this.secondCentrifugationSpeedListProvider.valueOf(2999);

    assertEquals(SecondCentrifugationSpeed.LESS_THREETHOUSAND_G, speedOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnGreaterThousandG() throws UndefinedValueException {

    SecondCentrifugationSpeedOption speedOption =
        this.secondCentrifugationSpeedListProvider.valueOf(10000);

    assertEquals(SecondCentrifugationSpeed.GREATER_TENTHOUSAND_G, speedOption.getContainedObject());
  }
}
