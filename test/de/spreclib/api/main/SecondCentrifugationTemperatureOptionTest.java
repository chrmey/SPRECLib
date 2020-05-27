package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SecondCentrifugationTemperatureOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(SecondCentrifugationTemperatureOption.class).verify();
  }
}
