package de.spreclib.java.spreclib;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISolidSampleSprec;
import de.spreclib.java.interfaces.ISprecPart;

public class SolidSampleSprec extends Sprec implements ISolidSampleSprec {

  public SolidSampleSprec() {}

  public boolean isFluidSample() {
    return false;
  }

  public boolean isSolidSample() {
    return true;
  }

  public ISprecPart getSolidSampleType() {
    return this.sprecParts.get(SprecPartType.SOLID_SAMPLE_TYPE);
  }

  public ISprecPart getTypeOfCollection() {
    return this.sprecParts.get(SprecPartType.TYPE_OF_COLLECTION);
  }

  public ISprecPart getWarmIschemiaTime() {
    return this.sprecParts.get(SprecPartType.WARM_ISCHEMIA_TIME);
  }

  public ISprecPart getColdIschemiaTime() {
    return this.sprecParts.get(SprecPartType.COLD_ISCHEMIA_TIME);
  }

  public ISprecPart getFixation() {
    return this.sprecParts.get(SprecPartType.FIXATION);
  }

  public ISprecPart getFixationTime() {
    return this.sprecParts.get(SprecPartType.FIXATION_TIME);
  }

  @Override
  public ISprecPart getLongTermStorage() {
    return this.sprecParts.get(SprecPartType.LONG_TERM_STORAGE);
  }

  @Override
  public String getSprecCode() {
    // TODO Auto-generated method stub
    return null;
  }
}
