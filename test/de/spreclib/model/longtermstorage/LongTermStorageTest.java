package de.spreclib.model.longtermstorage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class LongTermStorageTest {

  LongTermStorage longTermStorage;

  @Before
  public void setUp() {
    longTermStorage =
        new LongTermStorage(LongTermStorageType.UNKNOWN, new CodePart("X"));
  }

  @Test
  public void testGetLongTermStorageType() {
    LongTermStorageType expected = LongTermStorageType.UNKNOWN;
    assertEquals(expected, longTermStorage.getLongTermStorageType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("X");
    ICodePart actual = longTermStorage.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }
  
 
}
