package de.spreclib.model.primarycontainer;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.primarycontainer.PrimaryContainer;
import org.junit.Test;


public class PrimaryContainerTest {

  @Test
  public void testGetCodeFromSprecPart() {
    for (PrimaryContainer primaryContainer : PrimaryContainer.values()) {
      assertNotNull(PrimaryContainer.contains(primaryContainer));
    }
  }

  @Test
  public void testContains() {
    for (PrimaryContainer primaryContainer : PrimaryContainer.values()) {
      assertTrue(PrimaryContainer.contains(primaryContainer));
    }
  }
}
