package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FixationTimeOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(FixationTimeOption.class).verify();
  }
}
