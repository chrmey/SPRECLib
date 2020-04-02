package de.spreclib.api.lists.options;

import de.spreclib.model.enums.FixationTime;

public final class FixationTimeOption extends AbstractListOption {

  private FixationTime fixationTime;

  public FixationTimeOption(FixationTime fixationTime) {
    this.fixationTime = fixationTime;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.fixationTime.name());
  }

  @Override
  public FixationTime getContainedObject() {
    return this.fixationTime;
  }
}
