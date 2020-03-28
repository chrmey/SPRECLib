package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;

public final class FirstCentrifugationOption implements IListOption {

  private Centrifugation centrifugation;

  public FirstCentrifugationOption(Centrifugation centrifugation) {
    this.centrifugation = centrifugation;
  }

  @Override
  public String getStringRepresentation() {
    // TODO Implement
    return null;
  }
}
