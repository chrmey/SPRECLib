package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FirstCentrifugationBrakingOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(FirstCentrifugationBrakingOption.class).verify();
  }
}
