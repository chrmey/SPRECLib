package de.spreclib.api.parameters;

import de.spreclib.api.handlers.TimeStampHandler;
import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;

public class PreCentrifugationDelayParameter {

  private PreCentrifugationDelay preCentrifugationDelay;

  public PreCentrifugationDelayParameter(long collectionTime, long firstCentrifugationStartTime) {

    int delayMinutes =
        new TimeStampHandler(collectionTime, firstCentrifugationStartTime).getDelayMinutes();
    this.preCentrifugationDelay = PreCentrifugationDelay.valueOf(delayMinutes);
  }

  public PreCentrifugationDelayParameter(
      PreCentrifugationDelayOption preCentrifugationDelayOption) {

    if (preCentrifugationDelayOption == null) {
      throw new IllegalArgumentException("PreCentrifugationDelayOption cannot be null.");
    }

    this.preCentrifugationDelay = preCentrifugationDelayOption.getContainedObject();
  }

  public PreCentrifugationDelay getPreCentrifugationDelay() {
    return this.preCentrifugationDelay;
  }
}
