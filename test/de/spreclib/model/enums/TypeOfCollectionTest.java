package de.spreclib.model.enums;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypeOfCollectionTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (TypeOfCollection typeOfCollection : TypeOfCollection.values()) {
      assertNotNull(typeOfCollection.getCodeFromSprecPart());
    }
  }

  @Test
  public void testContains() {
    for (TypeOfCollection typeOfCollection : TypeOfCollection.values()) {
      assertTrue(TypeOfCollection.contains(typeOfCollection));
    }
  }
}
