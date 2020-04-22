package de.spreclib.model.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecPart;

public class PreCentrifugation implements ISprecPart, IListProvideable {

  private final PreCentrifugationType preCentrifugationType;
  private final ICodePart codePart;

  PreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    this.preCentrifugationType = preCentrifugationType;
    this.codePart = codePart;
  }

  public boolean isParameterizedPreCentrifugation() {
    return false;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  public PreCentrifugationType getPreCentrifugationType() {
    return preCentrifugationType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    result =
        prime * result + ((preCentrifugationType == null) ? 0 : preCentrifugationType.hashCode());
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
    PreCentrifugation other = (PreCentrifugation) obj;
    if (codePart == null) {
      if (other.codePart != null) {
        return false;
      }
    } else if (!codePart.equals(other.codePart)) {
      return false;
    }
    if (preCentrifugationType != other.preCentrifugationType) {
      return false;
    }
    return true;
  }
}
