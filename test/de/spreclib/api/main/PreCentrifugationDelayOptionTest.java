package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class PreCentrifugationDelayOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(PreCentrifugationDelayOption.class).verify();
  }
}
