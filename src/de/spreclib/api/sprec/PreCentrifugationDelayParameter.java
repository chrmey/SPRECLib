package de.spreclib.api.sprec;

import java.sql.Timestamp;

import de.spreclib.api.sprec.interfaces.IPreCentrifugationParameter;

public class PreCentrifugationDelayParameter implements IPreCentrifugationParameter {
    
    private int delayMinutes;
    private PreCentrifugationDelayOption delayOption;

  public PreCentrifugationDelayParameter(
      Timestamp collectionTime, Timestamp firstCentrifugationStartTime) {
    // TODO Timestamp utility needed
  }

  public PreCentrifugationDelayParameter(PreCentrifugationDelayOption delayOption) {
    this.delayOption = delayOption;
  }
}
