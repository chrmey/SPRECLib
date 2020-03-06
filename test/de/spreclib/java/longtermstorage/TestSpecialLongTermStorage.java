package de.spreclib.java.longtermstorage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;
import de.spreclib.java.spreclib.longtermstorage.SpecialLongTermStorage;

public class TestSpecialLongTermStorage {

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
  }

  @Test
  public void testGetSprecPartType() {
    SprecPartType expected = SprecPartType.LONG_TERM_STORAGE;
    SprecPartType actual = specialLongTermStorage.getSprecPartType();
    assertEquals(expected, actual);
  }
}
