package de.spreclib.api.main;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.Test;

public class PostCentrifugationDelayOptionTest {

  @Test
  public void testEquals() {
    EqualsVerifier.forClass(PostCentrifugationDelayOption.class).verify();
  }
}
