package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
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
  public void testValueOfWithValidValues() {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(10.9999f));

    assertNotNull(temperatureOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(100f));

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfWithNullValue() {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(null);

    assertNull(temperatureOption);
  }

  @Test
  public void testValueOfShouldReturnRoomtemperature() {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(28.9999f));

    assertEquals(
        PostCentrifugationTemperature.ROOM_TEMPERATURE, temperatureOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwoToTenDegrees() {

    PostCentrifugationTemperatureOption temperatureOption =
        this.postCentrifugationTemperatureListProvider.valueOf(new Temperature(10.9999f));

    assertEquals(
        PostCentrifugationTemperature.TWO_TO_TEN_DEGREES, temperatureOption.getContainedObject());
  }
}
