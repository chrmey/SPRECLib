package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class PrimaryContainerOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(PrimaryContainerOption.class).verify();
  }
}
