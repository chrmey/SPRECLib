package de.spreclib.model.enums;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Test;


public class TypeOfCollectionTest {

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart actual = TypeOfCollection.AUTOPSY_LESS_6_HOURS_POSTMORTEM.getCodeFromSprecPart();
    ICodePart expected = new CodePart("A06");
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }
}
