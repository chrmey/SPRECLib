package de.spreclib.java.longtermstorage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.spreclib.java.spreclib.longtermstorage.LongTermStorageList;

public class TestLongTermStorageList {

  @Test
  public void testLongTermStorageListSize() {
    int actualSize = LongTermStorageList.longTermStorages.size();
    int expectedSize = 27;
    assertEquals(expectedSize, actualSize);
  }
}
