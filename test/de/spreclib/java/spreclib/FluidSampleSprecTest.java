package de.spreclib.java.spreclib;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.FluidSampleSprec;
import de.spreclib.model.spreclib.Sprec;
import org.junit.Test;


public class FluidSampleSprecTest {

  @Test
  public void testIsFluidSample() {
    Sprec fluidSample = new FluidSampleSprec();
    assertTrue(fluidSample.isFluidSample());
  }

  @Test
  public void testIsSolidSample() {
    Sprec fluidSample = new FluidSampleSprec();
    assertFalse(fluidSample.isSolidSample());
  }

  @Test
  public void testGetFluidSampleType() {
    ISprecPart fluidSampleType = new FluidSampleSprec().getFluidSampleType();
    assertNull(fluidSampleType);
  }

  @Test
  public void testGetPrimaryContainer() {
    ISprecPart primaryContainer = new FluidSampleSprec().getPrimaryContainer();
    assertNull(primaryContainer);
  }

  @Test
  public void testGetPreCentrifugation() {
    ISprecPart preCentrifugation = new FluidSampleSprec().getPreCentrifugation();
    assertNull(preCentrifugation);
  }

  @Test
  public void testGetFirstCentrifugation() {
    ISprecPart firstCentrifugation = new FluidSampleSprec().getFirstCentrifugation();
    assertNull(firstCentrifugation);
  }

  @Test
  public void testGetSecondCentrifugation() {
    ISprecPart secondCentrifugation = new FluidSampleSprec().getSecondCentrifugation();
    assertNull(secondCentrifugation);
  }

  @Test
  public void testPostCentrifugation() {
    ISprecPart postCentrifugation = new FluidSampleSprec().getPostCentrifugation();
    assertNull(postCentrifugation);
  }

  @Test
  public void testGetLongTermStorage() {
    ISprecPart longTermStorage = new FluidSampleSprec().getLongTermStorage();
    assertNull(longTermStorage);
  }

  @Test
  public void testGetSprecParts() {
    Sprec sprec = new FluidSampleSprec();
    assertNotNull(sprec.sprecParts);
  }

  @Test
  public void testGetSprecCode() {
    Sprec sprec = new FluidSampleSprec();
    assertNull(sprec.getSprecCode());
  }
}
