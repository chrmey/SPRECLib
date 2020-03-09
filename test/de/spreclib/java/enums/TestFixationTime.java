package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

class TestFixationTime {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart codePart = FixationTime.LESS_THAN_15_MINUTES.getCodeFromSprecPart();
    ICodePart expected = new CodePart("A");
    assertNotNull(codePart);
    assertEquals(expected.getStringRepresentation(), codePart.getStringRepresentation());
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = FixationTime.LESS_THAN_15_MINUTES;
    assertEquals(SprecPartType.FIXATION_TIME, sprecPartType.getSprecPartType());
  }
}
