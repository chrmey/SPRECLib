package de.spreclib.api.lists.precentrifugation;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;

public final class PreCentrifugationOption implements IListOption {

  private PreCentrifugation preCentrifugation;

  protected PreCentrifugationOption(PreCentrifugation preCentrifugation) {
    this.preCentrifugation = preCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    return preCentrifugation.toString();
  }
}
