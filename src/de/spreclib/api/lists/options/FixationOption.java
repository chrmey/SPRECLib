package de.spreclib.api.lists.options;

import de.spreclib.model.enums.Fixation;

public final class FixationOption extends AbstractListOption {

  private final Fixation fixation;

  public FixationOption(Fixation fixation) {
    this.fixation = fixation;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.fixation.name());
  }

  @Override
  public Fixation getContainedObject() {
    return this.fixation;
  }
}
