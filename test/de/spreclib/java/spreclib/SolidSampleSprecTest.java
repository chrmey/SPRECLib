package de.spreclib.java.spreclib;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.SolidSampleSprec;
import de.spreclib.model.spreclib.Sprec;
import org.junit.Test;

public class SolidSampleSprecTest {

  @Test
  public void testIsFluidSample() {
    Sprec solidSample = new SolidSampleSprec();
    assertFalse(solidSample.isFluidSample());
  }

  @Test
  public void testIsSolidSample() {
    Sprec solidSample = new SolidSampleSprec();
    assertTrue(solidSample.isSolidSample());
  }

  @Test
  public void testGetSolidSampleType() {
    ISprecPart solidSampleType = new SolidSampleSprec().getSolidSampleType();
    assertNull(solidSampleType);
  }

  @Test
  public void testGetTypeOfCollection() {
    ISprecPart typeOfCollection = new SolidSampleSprec().getTypeOfCollection();
    assertNull(typeOfCollection);
  }

  @Test
  public void testGetWarmIschemiaTime() {
    ISprecPart warmIschemiaTima = new SolidSampleSprec().getWarmIschemiaTime();
    assertNull(warmIschemiaTima);
  }

  @Test
  public void testGetColdIschemiaTime() {
    ISprecPart coldIschemiaTime = new SolidSampleSprec().getColdIschemiaTime();
    assertNull(coldIschemiaTime);
  }

  @Test
  public void testGetFixation() {
    ISprecPart fixation = new SolidSampleSprec().getFixation();
    assertNull(fixation);
  }

  @Test
  public void testGetFixationTime() {
    ISprecPart fixationTime = new SolidSampleSprec().getFixationTime();
    assertNull(fixationTime);
  }

  @Test
  public void testGetLongTermStorage() {
    ISprecPart longTermStorage = new SolidSampleSprec().getLongTermStorage();
    assertNull(longTermStorage);
  }

  @Test
  public void testGetSprecParts() {
    Sprec sprec = new SolidSampleSprec();
    assertNotNull(sprec.sprecParts);
  }

  @Test
  public void testGetSprecCode() {
    Sprec sprec = new SolidSampleSprec();
    assertNull(sprec.getSprecCode());
  }
}
