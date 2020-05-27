package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class LongTermStorageOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(LongTermStorageOption.class).verify();
  }
}
