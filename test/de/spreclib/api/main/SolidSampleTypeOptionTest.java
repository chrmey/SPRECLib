package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class SolidSampleTypeOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(ColdIschemiaTimeOption.class).verify();
  }
}
