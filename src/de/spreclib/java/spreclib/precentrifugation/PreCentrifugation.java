package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class PreCentrifugation implements ISprecPart {

  private final SprecPartType SPRECPARTTYPE = SprecPartType.PRE_CENTRIFUGATION;
  private final PreCentrifugationType PRECENTRIFUGATIONTYPE;
  private final ICodePart CODEPART;

  public PreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    this.PRECENTRIFUGATIONTYPE = preCentrifugationType;
    this.CODEPART = codePart;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.CODEPART;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return this.SPRECPARTTYPE;
  }

  public PreCentrifugationType getPreCentrifugationType() {
    return PRECENTRIFUGATIONTYPE;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((SPRECPARTTYPE == null) ? 0 : SPRECPARTTYPE.hashCode());
    result = prime * result + ((CODEPART == null) ? 0 : CODEPART.hashCode());
    result =
        prime * result + ((PRECENTRIFUGATIONTYPE == null) ? 0 : PRECENTRIFUGATIONTYPE.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PreCentrifugation other = (PreCentrifugation) obj;
    if (SPRECPARTTYPE != other.SPRECPARTTYPE) return false;
    if (CODEPART == null) {
      if (other.CODEPART != null) return false;
    } else if (!CODEPART.equals(other.CODEPART)) return false;
    if (PRECENTRIFUGATIONTYPE != other.PRECENTRIFUGATIONTYPE) return false;
    return true;
  }
}
