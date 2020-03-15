package de.spreclib.model.postcentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.CodePart;
import de.spreclib.model.spreclib.postcentrifugation.NormalPostCentrifugation;
import org.junit.Before;
import org.junit.Test;


public class NormalPostCentrifugationTest {

  NormalPostCentrifugation normalPostCentrifugation;

  @Before
  public void setUp() {
    normalPostCentrifugation =
        new NormalPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A"));
  }

  @Test
  public void testGetPostCentrifugationType() {
    PostCentrifugationType expected = PostCentrifugationType.DEFAULT;
    assertEquals(expected, normalPostCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = normalPostCentrifugation.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.POST_CENTRIFUGATION;
    SprecPartType actual = normalPostCentrifugation.getSprecPartType();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetPostCentrifugationDelay() {
    PostCentrifugationDelay expected = PostCentrifugationDelay.LESS_ONE_HOUR;
    PostCentrifugationDelay actual = normalPostCentrifugation.getPostCentrifugationDelay();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetPostCentrifugationTemperature() {
    PostCentrifugationTemperature expected = PostCentrifugationTemperature.TWO_TO_TEN_DEGREES;
    PostCentrifugationTemperature actual =
        normalPostCentrifugation.getPostCentrifugationTemperature();
    assertEquals(expected, actual);
  }
}
