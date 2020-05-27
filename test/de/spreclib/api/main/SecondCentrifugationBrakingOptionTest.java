package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SecondCentrifugationBrakingOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(SecondCentrifugationBrakingOption.class).verify();
  }
}
