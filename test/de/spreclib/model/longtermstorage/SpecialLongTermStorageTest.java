package de.spreclib.model.longtermstorage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import de.spreclib.model.enums.longtermstorage.LongTermStorageType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.longtermstorage.SpecialLongTermStorage;
import de.spreclib.model.sprec.CodePart;
import org.junit.Before;
import org.junit.Test;


public class SpecialLongTermStorageTest {

  SpecialLongTermStorage specialLongTermStorage;

  @Before
  public void setUp() {
    specialLongTermStorage =
        new SpecialLongTermStorage(LongTermStorageType.UNKNOWN, new CodePart("X"));
  }

  @Test
  public void testGetLongTermStorageType() {
    LongTermStorageType expected = LongTermStorageType.UNKNOWN;
    assertEquals(expected, specialLongTermStorage.getLongTermStorageType());
  }

  @Test
  public void testGetCodeFromSprecPart() {
    ICodePart expected = new CodePart("X");
    ICodePart actual = specialLongTermStorage.getCodeFromSprecPart();
    assertNotNull(actual);
    assertEquals(expected.getStringRepresentation(), actual.getStringRepresentation());
    assertEquals(expected, actual);
  }
}
