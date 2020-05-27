package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class PreCentrifugationTemperatureOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(PreCentrifugationTemperatureOption.class).verify();
  }
}
