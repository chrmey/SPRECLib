package de.spreclib.model.spreclib.precentrifugation;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class NormalPreCentrifugation extends PreCentrifugation {

  private static final PreCentrifugationType PRE_CENTRIFUGATION_TYPE =
      PreCentrifugationType.DEFAULT;
  private final PreCentrifugationDelay preCentrifugationDelay;
  private final PreCentrifugationTemperature preCentrifugationTemperature;

  /**
   * Constructor for NormalPreCentrifugation.
 * @param preCentrifugationDelay enum PreCentrifugationDelay
 * @param preCentrifugationTemperature enum PreCentrifugationTemperature
 * @param codePart Object CodePart
   */
  public NormalPreCentrifugation(
      PreCentrifugationDelay preCentrifugationDelay,
      PreCentrifugationTemperature preCentrifugationTemperature,
      ICodePart codePart) {
    super(PRE_CENTRIFUGATION_TYPE, codePart);
    this.preCentrifugationDelay = preCentrifugationDelay;
    this.preCentrifugationTemperature = preCentrifugationTemperature;
  }

  public PreCentrifugationDelay getPreCentrifugationDelay() {
    return this.preCentrifugationDelay;
  }

  public PreCentrifugationTemperature getPreCentrifugationTemperature() {
    return this.preCentrifugationTemperature;
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
    NormalPreCentrifugation other = (NormalPreCentrifugation) obj;
    if (preCentrifugationDelay != other.preCentrifugationDelay) {
      return false;
    }
    if (preCentrifugationTemperature != other.preCentrifugationTemperature) {
      return false;
    }
    return true;
  }
}
