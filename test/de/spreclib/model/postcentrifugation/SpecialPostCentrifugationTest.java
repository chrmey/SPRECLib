package de.spreclib.model.postcentrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.postcentrifugation.SpecialPostCentrifugation;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class SpecialPostCentrifugationTest {

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
}
