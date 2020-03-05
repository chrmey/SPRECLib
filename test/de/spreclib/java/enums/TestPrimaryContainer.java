package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

class TestPrimaryContainer {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart codePart = PrimaryContainer.ACID_CITRATE_DEXTROSE.getCodeFromSprecPart();
    ICodePart expected = new CodePart("ACD");
    assertNotNull(codePart);
    assertEquals(expected.getStringRepresentation(), codePart.getStringRepresentation());
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = PrimaryContainer.ACID_CITRATE_DEXTROSE;
    assertEquals(SprecPartType.PRIMARY_CONTAINER, sprecPartType.getSprecPartType());
  }
}
