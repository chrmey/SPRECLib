package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.main.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationTemperature;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PostCentrifugationTemperatureListProviderTest {

  private PostCentrifugationTemperatureListProvider postCentrifugationTemperatureListProvider;
  private List<PostCentrifugationTemperatureOption> postCentrifugationTemperatureList;

  @Before
  public void setUp() {
    this.postCentrifugationTemperatureListProvider =
        new PostCentrifugationTemperatureListProvider();
    this.postCentrifugationTemperatureList = postCentrifugationTemperatureListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(postCentrifugationTemperatureList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : postCentrifugationTemperatureList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = PostCentrifugationTemperature.values().length;
    int actual = postCentrifugationTemperatureList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValues() throws UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(10.49f));

    assertNotNull(temperatureOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(100f));
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithNullValue() throws UndefinedValueException {

    this.postCentrifugationTemperatureListProvider.valueOf(null);
  }

  @Test
  public void testValueOfShouldReturnRoomtemperature() throws UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(28.49f));

    assertEquals(
        PostCentrifugationTemperature.ROOM_TEMPERATURE, temperatureOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwoToTenDegreesUpperBound() throws UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(10.49f));

    assertEquals(
        PostCentrifugationTemperature.TWO_TO_TEN_DEGREES, temperatureOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwoToTenDegreesLowerBound() throws UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(1.5f));

    assertEquals(
        PostCentrifugationTemperature.TWO_TO_TEN_DEGREES, temperatureOption.getContainedObject());
  }
}
