package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FirstCentrifugationOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(FirstCentrifugationOption.class).verify();
  }
}
