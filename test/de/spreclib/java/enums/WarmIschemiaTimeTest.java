package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.WarmIschemiaTime;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;
import org.junit.Test;


public class WarmIschemiaTimeTest {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = WarmIschemiaTime.LESS_TWO_MINUTES.getCodeFromSprecPart();
    ICodePart expected = new CodePart("A");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }

  @Test
  public void testGetSprecPartType() {
    ISprecPart sprecPartType = WarmIschemiaTime.LESS_TWO_MINUTES;
    assertEquals(SprecPartType.WARM_ISCHEMIA_TIME, sprecPartType.getSprecPartType());
  }
}
