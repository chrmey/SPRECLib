package de.spreclib.java.precentrifugation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.spreclib.java.spreclib.precentrifugation.PreCentrifugationList;

public class TestPreCentrifugationList {

  @Test
  public void testPreCentrifugationListSize() {
    int actualSize = PreCentrifugationList.preCentrifugations.size();
    int expectedSize = 17;
    assertEquals(expectedSize, actualSize);
  }
}
