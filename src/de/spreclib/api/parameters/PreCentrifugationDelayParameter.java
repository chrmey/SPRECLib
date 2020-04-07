package de.spreclib.api.parameters;

import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;

public class PreCentrifugationDelayParameter {

  private int delayMinutes;
  private PreCentrifugationDelayOption delayOption;

  public PreCentrifugationDelayParameter(long collectionTime, long firstCentrifugationStartTime) {

    this.delayMinutes =
        new TimeStampHandler(collectionTime, firstCentrifugationStartTime).getDelayMinutes();
  }

  public PreCentrifugationDelayParameter(
      PreCentrifugationDelayOption preCentrifugationDelayOption) {

    if (preCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PreCentrifugationDelayOption cannot be null");
    }

    this.delayOption = preCentrifugationDelayOption;
  }

  public PreCentrifugationDelay getPreCentrifugationDelay() {

    if (delayOption != null) {

      return delayOption.getContainedObject();
    } else {
      PreCentrifugationDelay delay = PreCentrifugationDelay.valueOf(delayMinutes);

      return delay;
    }
  }
 
}
