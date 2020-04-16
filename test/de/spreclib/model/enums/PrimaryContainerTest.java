package de.spreclib.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Test;


public class PrimaryContainerTest {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = PrimaryContainer.ACID_CITRATE_DEXTROSE.getCodeFromSprecPart();
    ICodePart expected = new CodePart("ACD");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }
}
