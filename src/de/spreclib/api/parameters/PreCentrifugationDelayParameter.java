package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.api.parameters.interfaces.IPreCentrifugationParameter;
import java.sql.Timestamp;

public class PreCentrifugationDelayParameter implements IPreCentrifugationParameter {

  private int delayMinutes;
  private PreCentrifugationDelayOption delayOption;

  public PreCentrifugationDelayParameter(
      Timestamp collectionTime, Timestamp firstCentrifugationStartTime) {}

  public PreCentrifugationDelayParameter(
      PreCentrifugationDelayOption preCentrifugationDelayOption) {
    this.delayOption = preCentrifugationDelayOption;
  }
}
