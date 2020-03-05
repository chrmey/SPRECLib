package de.spreclib.java.spreclib;

import de.spreclib.java.enums.ColdIschemiaTime;
import de.spreclib.java.enums.Fixation;
import de.spreclib.java.enums.FixationTime;
import de.spreclib.java.enums.SolidSampleType;
import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.TypeOfCollection;
import de.spreclib.java.enums.WarmIschemiaTime;
import de.spreclib.java.interfaces.ISolidSampleSprec;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.longtermstorage.LongTermStorage;

public class SolidSampleSprec extends Sprec implements ISolidSampleSprec {

  private SolidSampleType solidSampleType;
  private TypeOfCollection typeOfCollection;
  private WarmIschemiaTime warmIschemiaTime;
  private ColdIschemiaTime coldIschemiaTime;
  private Fixation fixation;
  private FixationTime fixationTime;
  private LongTermStorage longTermStorage;

  public SolidSampleSprec() {
    super();
  }

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
  public String getSprecCode() {
    return null;
  }
}
