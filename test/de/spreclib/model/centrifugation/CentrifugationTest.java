package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class CentrifugationTest {

  Centrifugation centrifugation;

  @Before
  public void setUp() {
    centrifugation =
        new Centrifugation(
            CentrifugationType.NO, new CodePart("N"));
  }

  @Test
  public void testGetCentrifugationType() {
    CentrifugationType expected = CentrifugationType.NO;
    
    assertEquals(expected, centrifugation.getCentrifugationType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("N");
    ICodePart actual = centrifugation.getCodeFromSprecPart();
    
    assertEquals(expected, actual);
  }

  @Test
  public void testIsParameterizedCentrifugation() {
	  
    assertFalse(centrifugation.isParameterizedCentrifugation());
  }

}
