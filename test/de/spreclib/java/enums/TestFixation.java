package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public class TestFixation {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart codePart = Fixation.ALCOHOL_BASED.getCodeFromSprecPart();
    ICodePart expected = new CodePart("ETH");
    assertNotNull(codePart);
    assertEquals(expected.getStringRepresentation(), codePart.getStringRepresentation());
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = Fixation.ALCOHOL_BASED;
    assertEquals(SprecPartType.FIXATION, sprecPartType.getSprecPartType());
  }
}
