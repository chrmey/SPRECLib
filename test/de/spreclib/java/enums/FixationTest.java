package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.Fixation;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;
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

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = Fixation.ALCOHOL_BASED;
    assertEquals(SprecPartType.FIXATION, sprecPartType.getSprecPartType());
  }
}
