package de.spreclib.java.spreclib;

import static org.junit.Assert.*;

import org.junit.Test;

import de.spreclib.java.interfaces.ISprecPart;

public class SolidSampleSprecTest {

  @Test
  public void test1() {
    ISprecPart solidSampleType = new SolidSampleSprec().getSolidSampleType();
    assertNotNull(solidSampleType);
  }

  @Test
  public void test2() {
    Sprec sprec = new SolidSampleSprec();
    assertNotNull(sprec.sprecParts);
  }
}
