package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SecondCentrifugationDurationOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(SecondCentrifugationDurationOption.class).verify();
  }
}
