package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class TypeOfCollectionOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(TypeOfCollectionOption.class).verify();
  }
}
