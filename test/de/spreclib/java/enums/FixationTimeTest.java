package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.FixationTime;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;
import org.junit.Test;


public class FixationTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = FixationTime.LESS_THAN_15_MINUTES.getCodeFromSprecPart();
    ICodePart expected = new CodePart("A");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = FixationTime.LESS_THAN_15_MINUTES;
    assertEquals(SprecPartType.FIXATION_TIME, sprecPartType.getSprecPartType());
  }
}
