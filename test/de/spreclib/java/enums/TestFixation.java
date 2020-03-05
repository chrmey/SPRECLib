package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public class TestFixation {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart codePart = Fixation.ALCOHOL_BASED.getCodeFromSprecPart();
    assertNotNull(codePart);
    assertEquals("ETH", codePart.getStringRepresentation());
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart fixation = Fixation.ALCOHOL_BASED;
    assertEquals(SprecPartType.FIXATION, fixation.getSprecPartType());
  }
}
