package de.spreclib.java.centrifugation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.spreclib.java.spreclib.centrifugation.SecondCentrifugationList;

public class TestSecondCentrifugationList {

  @Test
  public void testSecondCentrifugationList() {
    int actualSize = SecondCentrifugationList.centrifugations.size();
    int expectedSize = 13;
    assertEquals(expectedSize, actualSize);
  }
}
