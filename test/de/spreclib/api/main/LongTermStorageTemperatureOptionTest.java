package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class LongTermStorageTemperatureOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(LongTermStorageTemperatureOption.class).verify();
  }
}
