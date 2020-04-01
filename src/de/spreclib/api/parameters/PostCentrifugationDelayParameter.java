package de.spreclib.api.parameters;

import de.spreclib.api.parameters.interfaces.IPreCentrifugationParameter;
import de.spreclib.api.sprec.PostCentrifugationDelayOption;
import java.sql.Timestamp;

public class PostCentrifugationDelayParameter implements IPreCentrifugationParameter {

  private int delayMinutes;
  private PostCentrifugationDelayOption delayOption;

  public PostCentrifugationDelayParameter(
      Timestamp lastCentrifugationEndTime, Timestamp longTermStorageStartTime) {}

  public PostCentrifugationDelayParameter(
      PostCentrifugationDelayOption postCentrifugationDelayOption) {
    this.delayOption = postCentrifugationDelayOption;
  }
}
