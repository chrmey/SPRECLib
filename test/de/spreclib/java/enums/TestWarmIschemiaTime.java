package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

class TestWarmIschemiaTime {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart codePart = WarmIschemiaTime.LESS_TWO_MINUTES.getCodeFromSprecPart();
    ICodePart expected = new CodePart("A");
    assertNotNull(codePart);
    assertEquals(expected.getStringRepresentation(), codePart.getStringRepresentation());
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = WarmIschemiaTime.LESS_TWO_MINUTES;
    assertEquals(SprecPartType.WARM_ISCHEMIA_TIME, sprecPartType.getSprecPartType());
  }
}
