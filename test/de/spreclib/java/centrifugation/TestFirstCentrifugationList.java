package de.spreclib.java.centrifugation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.spreclib.java.spreclib.centrifugation.FirstCentrifugationList;

public class TestFirstCentrifugationList {

  @Test
  public void testFirstCentrifugationList() {
    int actualSize = FirstCentrifugationList.centrifugations.size();
    int expectedSize = 14;
    assertEquals(expectedSize, actualSize);
  }
}
