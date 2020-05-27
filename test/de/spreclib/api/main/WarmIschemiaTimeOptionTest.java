package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class WarmIschemiaTimeOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(WarmIschemiaTimeOption.class).verify();
  }
}
