package de.spreclib.java.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;
import org.junit.Test;


public class TestWarmIschemiaTime {

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
