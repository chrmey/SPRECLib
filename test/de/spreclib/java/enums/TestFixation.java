package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;
import org.junit.Test;


public class TestFixation {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = Fixation.ALCOHOL_BASED.getCodeFromSprecPart();
    ICodePart expected = new CodePart("ETH");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = Fixation.ALCOHOL_BASED;
    assertEquals(SprecPartType.FIXATION, sprecPartType.getSprecPartType());
  }
}
