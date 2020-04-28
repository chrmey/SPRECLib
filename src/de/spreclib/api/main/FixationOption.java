package de.spreclib.api.main;

import de.spreclib.model.fixation.Fixation;

/**
 * FixationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FixationOption extends AbstractListOption {

  private final Fixation fixation;

  FixationOption(Fixation fixation) {
    this.fixation = fixation;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.fixation.name());
  }

  @Override
  protected Fixation getContainedObject() {
    return this.fixation;
  }
}
