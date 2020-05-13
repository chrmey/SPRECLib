package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.parameters.Temperature;
import de.spreclib.model.postcentrifugation.PostCentrifugationList;
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
  public void testFullListSize() {
    int expected = PostCentrifugationList.POST_CENTRIFUGATIONS.size();
    int actual = postCentrifugationList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValues()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(15);

    PostCentrifugationOption postCentrifugationOption =
        this.postCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertNotNull(postCentrifugationOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithTemperatureOptionisNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(15);

    this.postCentrifugationListProvider.valueOf(null, delayOption);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testValueOfWithDelayOptionisNull()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    this.postCentrifugationListProvider.valueOf(temperatureOption, null);
  }

  @Test
  public void TestValueOfShouldReturnCodeA()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(10f));

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(59);

    PostCentrifugationOption postCentrifugationOption =
        this.postCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertEquals(
        new CodePart("A"), postCentrifugationOption.getContainedObject().getCodeFromSprecFactor());
  }

  @Test
  public void TestValueOfShouldReturnCodeJ()
      throws UndefinedValueCombinationException, UndefinedValueException {

    PostCentrifugationTemperatureOption temperatureOption =
        new PostCentrifugationTemperatureListProvider().valueOf(new Temperature(18f));

    PostCentrifugationDelayOption delayOption =
        new PostCentrifugationDelayListProvider().valueOf(1140);

    PostCentrifugationOption postCentrifugationOption =
        this.postCentrifugationListProvider.valueOf(temperatureOption, delayOption);

    assertEquals(
        new CodePart("J"), postCentrifugationOption.getContainedObject().getCodeFromSprecFactor());
  }
}
