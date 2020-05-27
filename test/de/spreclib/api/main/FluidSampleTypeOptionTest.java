package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class FluidSampleTypeOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(FluidSampleTypeOption.class).verify();
  }
}
