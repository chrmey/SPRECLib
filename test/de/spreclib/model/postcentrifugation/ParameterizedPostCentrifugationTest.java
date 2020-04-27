package de.spreclib.model.postcentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.postcentrifugation.ParameterizedPostCentrifugation;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;

public class ParameterizedPostCentrifugationTest {

  ParameterizedPostCentrifugation parameterizedPostCentrifugation;

  @Before
  public void setUp() {
    parameterizedPostCentrifugation =
        new ParameterizedPostCentrifugation(
            PostCentrifugationType.DEFAULT,
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("A"));
  }

  @Test
  public void testGetPostCentrifugationType() {
    PostCentrifugationType expected = PostCentrifugationType.DEFAULT;

    assertEquals(expected, parameterizedPostCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("A");
    ICodePart actual = parameterizedPostCentrifugation.getCodeFromSprecPart();

    assertEquals(expected, actual);
  }

  @Test
  public void testGetPostCentrifugationDelay() {
    PostCentrifugationDelay expected = PostCentrifugationDelay.LESS_ONE_HOUR;
    PostCentrifugationDelay actual = parameterizedPostCentrifugation.getPostCentrifugationDelay();
    assertEquals(expected, actual);
  }

  @Test
  public void testGetPostCentrifugationTemperature() {
    PostCentrifugationTemperature expected = PostCentrifugationTemperature.TWO_TO_TEN_DEGREES;
    PostCentrifugationTemperature actual =
        parameterizedPostCentrifugation.getPostCentrifugationTemperature();

    assertEquals(expected, actual);
  }

  @Test
  public void testContainsShouldReturnTrue() {

    assertTrue(
        parameterizedPostCentrifugation.contains(
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.TWO_TO_TEN_DEGREES));
  }
  
  @Test
  public void testContainsShouldReturnFalse() {

    assertFalse(
        parameterizedPostCentrifugation.contains(
            PostCentrifugationDelay.LESS_ONE_HOUR,
            PostCentrifugationTemperature.ROOM_TEMPERATURE));
  }
}
