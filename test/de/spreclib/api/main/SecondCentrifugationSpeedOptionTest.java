package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SecondCentrifugationSpeedOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(SecondCentrifugationSpeedOption.class).verify();
  }
}
