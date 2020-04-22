package de.spreclib.model.centrifugation;

import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecPart;

public class Centrifugation implements ISprecPart, IListProvideable {

  private final CentrifugationType centrifugationType;
  private final ICodePart codePart;

  /**
   * * Centrifugation Constructor.
   *
   * @param centrifugationType enum CentrifugationType
   * @param codePart CodePart Object
   * @param sprecPartType enum SprecPartType
   */
  Centrifugation(CentrifugationType centrifugationType, ICodePart codePart) {
    this.centrifugationType = centrifugationType;
    this.codePart = codePart;
  }

  public boolean isParameterizedCentrifugation() {
    return false;
  }

  public CentrifugationType getCentrifugationType() {
    return this.centrifugationType;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((centrifugationType == null) ? 0 : centrifugationType.hashCode());
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
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
    Centrifugation other = (Centrifugation) obj;
    if (centrifugationType != other.centrifugationType) {
      return false;
    }
    if (codePart == null) {
      if (other.codePart != null) {
        return false;
      }
    } else if (!codePart.equals(other.codePart)) {
      return false;
    }
    return true;
  }
}
