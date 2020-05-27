package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FirstCentrifugationSpeedOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(FirstCentrifugationSpeedOption.class).verify();
  }
}
