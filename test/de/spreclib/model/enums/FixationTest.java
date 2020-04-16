package de.spreclib.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Test;


public class FixationTest {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = Fixation.ALCOHOL_BASED.getCodeFromSprecPart();
    ICodePart expected = new CodePart("ETH");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }
}
