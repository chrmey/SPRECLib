package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SecondCentrifugationOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(SecondCentrifugationOption.class).verify();
  }
}
