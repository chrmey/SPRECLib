package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;

public final class PreCentrifugationOption implements IListOption {

  private PreCentrifugation preCentrifugation;

  public PreCentrifugationOption(PreCentrifugation preCentrifugation) {
    this.preCentrifugation = preCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    // TODO Implement
    return null;
  }
}
