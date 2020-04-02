package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import de.spreclib.api.parameters.interfaces.IPreCentrifugationParameter;
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
