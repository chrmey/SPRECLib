package de.spreclib.model.spreclib.precentrifugation;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.interfaces.ISprecPart;

public abstract class PreCentrifugation implements ISprecPart, IListObject {

  private static final SprecPartType SPREC_PART_TYPE = SprecPartType.PRE_CENTRIFUGATION;
  private final PreCentrifugationType preCentrifugationType;
  private final ICodePart codePart;

  public PreCentrifugation(PreCentrifugationType preCentrifugationType, ICodePart codePart) {
    this.preCentrifugationType = preCentrifugationType;
    this.codePart = codePart;
  }

  public abstract boolean isNormalPreCentrifugation();

  public abstract boolean isSpecialPreCentrifugation();

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return PreCentrifugation.SPREC_PART_TYPE;
  }

  public PreCentrifugationType getPreCentrifugationType() {
    return preCentrifugationType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((SPREC_PART_TYPE == null) ? 0 : SPREC_PART_TYPE.hashCode());
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
