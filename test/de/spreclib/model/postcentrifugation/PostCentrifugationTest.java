package de.spreclib.model.postcentrifugation;

import static org.junit.Assert.assertEquals;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationType;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class PostCentrifugationTest {

  PostCentrifugation postCentrifugation;

  @Before
  public void setUp() {
    postCentrifugation =
        new PostCentrifugation(PostCentrifugationType.NOT_APPLICABLE, new CodePart("N"));
  }

  @Test
  public void testGetPostCentrifugationType() {
    PostCentrifugationType expected = PostCentrifugationType.NOT_APPLICABLE;
    
    assertEquals(expected, postCentrifugation.getPostCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("N");
    ICodePart actual = postCentrifugation.getCodeFromSprecPart();

    assertEquals(expected, actual);
  }
}
