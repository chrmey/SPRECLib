package de.spreclib.enums;

import de.spreclib.interfaces.ISolidSampleSprec;
import de.spreclib.interfaces.ISprecPart;
import de.spreclib.spreclib.Sprec;

public class SolidSampleSprec extends Sprec implements ISolidSampleSprec {

  public SolidSampleSprec() {
	  
  }

  public boolean isFluidSample() {
    return false;
  }

  public boolean isSolidSample() {
    return true;
  }

  public ISprecPart getSolidSampleType() {
    // TODO implement here
    return null;
  }

  public ISprecPart getTypeOfCollection() {
    // TODO implement here
    return null;
  }

  public ISprecPart getWarmIschemiaTime() {
    // TODO implement here
    return null;
  }

  public ISprecPart getColdIschemiaTime() {
    // TODO implement here
    return null;
  }

  public ISprecPart getFixation() {
    // TODO implement here
    return null;
  }

  public ISprecPart getFixationTime() {
    // TODO implement here
    return null;
  }

  @Override
  public ISprecPart getLongTermStorage() {
    // TODO implement here
    return null;
  }
}
