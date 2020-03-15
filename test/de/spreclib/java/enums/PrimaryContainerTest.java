package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.PrimaryContainer;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;
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

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = PrimaryContainer.ACID_CITRATE_DEXTROSE;
    assertEquals(SprecPartType.PRIMARY_CONTAINER, sprecPartType.getSprecPartType());
  }
}
