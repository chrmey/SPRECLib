package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class PreCentrifugation implements ISprecPart {

  private final SprecPartType SPRECPARTTYPE = SprecPartType.PRE_CENTRIFUGATION;
  private PreCentrifugationType preCentrifugationType;
  private ICodePart codePart;

  public PreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    this.preCentrifugationType = preCentrifugationType;
    this.codePart = codePart;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return this.SPRECPARTTYPE;
  }

  public PreCentrifugationType getPreCentrifugationType() {
    return preCentrifugationType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((SPRECPARTTYPE == null) ? 0 : SPRECPARTTYPE.hashCode());
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    result =
        prime * result + ((preCentrifugationType == null) ? 0 : preCentrifugationType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PreCentrifugation other = (PreCentrifugation) obj;
    if (SPRECPARTTYPE != other.SPRECPARTTYPE) return false;
    if (codePart == null) {
      if (other.codePart != null) return false;
    } else if (!codePart.equals(other.codePart)) return false;
    if (preCentrifugationType != other.preCentrifugationType) return false;
    return true;
  }
}
