package de.spreclib.java.postcentrifugation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.spreclib.java.spreclib.postcentrifugation.PostCentrifugationList;

public class TestPostCentrifugationList {

  @Test
  public void testPostCentrifugationListSize() {
    int actualSize = PostCentrifugationList.postCentrifugations.size();
    int expectedSize = 13;
    assertEquals(expectedSize, actualSize);
  }
}
