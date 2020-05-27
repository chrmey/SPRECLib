package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class PostCentrifugationOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(PostCentrifugationOption.class).verify();
  }
}
