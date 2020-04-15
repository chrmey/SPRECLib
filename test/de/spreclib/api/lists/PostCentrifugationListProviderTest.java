package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import de.spreclib.api.lists.options.PostCentrifugationOption;
import de.spreclib.api.lists.options.PostCentrifugationTemperatureOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.sprec.CodePart;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PostCentrifugationListProviderTest {

  private PostCentrifugationListProvider postCentrifugationListProvider;
  private List<PostCentrifugationOption> postCentrifugationList;

  @Before
  public void setUp() {
    this.postCentrifugationListProvider = new PostCentrifugationListProvider();
    this.postCentrifugationList = postCentrifugationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(postCentrifugationList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : postCentrifugationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValues() {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(15);

    PostCentrifugationOption postCentrifugationOption =
        this.postCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertNotNull(postCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithTemperatureOptionisNull() {

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(15);

    this.postCentrifugationListProvider.valueOf(null, delayOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithDelayOptionisNull() {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    this.postCentrifugationListProvider.valueOf(temperatureOption, null);
  }

  @Test
  public void TestValueOfShouldReturnCodeA() {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(59);

    PostCentrifugationOption postCentrifugationOption =
        this.postCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertEquals(
        new CodePart("A"), postCentrifugationOption.getContainedObject().getCodeFromSprecPart());
  }

  @Test
  public void TestValueOfShouldReturnCodeJ() {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(18f));

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(1140);

    PostCentrifugationOption postCentrifugationOption =
        this.postCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertEquals(
        new CodePart("J"), postCentrifugationOption.getContainedObject().getCodeFromSprecPart());
  }
}
