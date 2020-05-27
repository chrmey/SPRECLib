package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FixationOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(FixationOption.class).verify();
  }
}
