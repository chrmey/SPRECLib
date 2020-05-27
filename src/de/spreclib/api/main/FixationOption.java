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
  Fixation getContainedObject() {
    return this.fixation;
  }

  boolean hasCodeString(String codeString) {
    if (this.fixation.getCodeFromSprecFactor().getStringRepresentation().equals(codeString)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fixation == null) ? 0 : fixation.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    FixationOption other = (FixationOption) obj;
    if (fixation != other.fixation) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "FixationOption [fixation=" + fixation + "]";
  }
}
