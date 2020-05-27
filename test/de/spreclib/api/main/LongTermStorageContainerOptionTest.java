package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class LongTermStorageContainerOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(LongTermStorageContainerOption.class).verify();
  }
}
