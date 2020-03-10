package de.spreclib.java.postcentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.postcentrifugation.SpecialPostCentrifugation;
import org.junit.Before;
import org.junit.Test;


public class TestSpecialPostCentrifugation {

  SpecialPostCentrifugation specialPostCentrifugation;

  @Before
  public void setUp() {
    specialPostCentrifugation =
        new SpecialPostCentrifugation(PostCentrifugationType.NOT_APPLICABLE, new CodePart("N"));
  }

  @Test
  public void testGetPostCentrifugationType() {
    PostCentrifugationType expected = PostCentrifugationType.NOT_APPLICABLE;
    assertEquals(expected, specialPostCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("N");
    ICodePart actual = specialPostCentrifugation.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.POST_CENTRIFUGATION;
    SprecPartType actual = specialPostCentrifugation.getSprecPartType();
    assertEquals(expected, actual);
  }
}
