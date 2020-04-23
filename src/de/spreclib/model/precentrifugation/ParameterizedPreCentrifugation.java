package de.spreclib.model.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class ParameterizedPreCentrifugation extends PreCentrifugation {

  private static final PreCentrifugationType PRE_CENTRIFUGATION_TYPE =
      PreCentrifugationType.DEFAULT;
  private final PreCentrifugationDelay preCentrifugationDelay;
  private final PreCentrifugationTemperature preCentrifugationTemperature;

  ParameterizedPreCentrifugation(
      PreCentrifugationDelay preCentrifugationDelay,
      PreCentrifugationTemperature preCentrifugationTemperature,
      ICodePart codePart) {
    super(PRE_CENTRIFUGATION_TYPE, codePart);
    this.preCentrifugationDelay = preCentrifugationDelay;
    this.preCentrifugationTemperature = preCentrifugationTemperature;
  }

  @Override
  public boolean isParameterizedPreCentrifugation() {
    return true;
  }

  public PreCentrifugationDelay getPreCentrifugationDelay() {
    return this.preCentrifugationDelay;
  }

  public PreCentrifugationTemperature getPreCentrifugationTemperature() {
    return this.preCentrifugationTemperature;
  }

  public boolean contains(
      PreCentrifugationDelay preCentrifugationDelay,
      PreCentrifugationTemperature preCentrifugationTemperature) {

    if (this.preCentrifugationTemperature == preCentrifugationTemperature
        && this.preCentrifugationDelay == preCentrifugationDelay) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result =
        prime * result + ((preCentrifugationDelay == null) ? 0 : preCentrifugationDelay.hashCode());
    result =
        prime * result
            + ((preCentrifugationTemperature == null)
                ? 0
                : preCentrifugationTemperature.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!super.equals(obj)) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ParameterizedPreCentrifugation other = (ParameterizedPreCentrifugation) obj;
    if (preCentrifugationDelay != other.preCentrifugationDelay) {
      return false;
    }
    if (preCentrifugationTemperature != other.preCentrifugationTemperature) {
      return false;
    }
    return true;
  }
}
