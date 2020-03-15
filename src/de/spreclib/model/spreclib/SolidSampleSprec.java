package de.spreclib.model.spreclib;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.interfaces.ISolidSampleSprec;
import de.spreclib.model.interfaces.ISprecPart;

public final class SolidSampleSprec extends Sprec implements ISolidSampleSprec {

  public SolidSampleSprec() {
    super();
  }

  @Override
  public boolean isFluidSample() {
    return false;
  }

  @Override
  public boolean isSolidSample() {
    return true;
  }

  @Override
  public ISprecPart getSolidSampleType() {
    return this.sprecParts.get(SprecPartType.SOLID_SAMPLE_TYPE);
  }

  @Override
  public ISprecPart getTypeOfCollection() {
    return this.sprecParts.get(SprecPartType.TYPE_OF_COLLECTION);
  }

  @Override
  public ISprecPart getWarmIschemiaTime() {
    return this.sprecParts.get(SprecPartType.WARM_ISCHEMIA_TIME);
  }

  @Override
  public ISprecPart getColdIschemiaTime() {
    return this.sprecParts.get(SprecPartType.COLD_ISCHEMIA_TIME);
  }

  @Override
  public ISprecPart getFixation() {
    return this.sprecParts.get(SprecPartType.FIXATION);
  }

  @Override
  public ISprecPart getFixationTime() {
    return this.sprecParts.get(SprecPartType.FIXATION_TIME);
  }

  @Override
  public String getSprecCode() {
    return null;
  }
}
