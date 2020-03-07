package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class NormalPreCentrifugation extends PreCentrifugation {

  private PreCentrifugationDelay preCentrifugationDelay;
  private PreCentrifugationTemperature preCentrifugationTemperature;

  public NormalPreCentrifugation(
      PreCentrifugationType preCentrifugationType,
      PreCentrifugationDelay preCentrifugationDelay,
      PreCentrifugationTemperature preCentrifugationTemperature,
      ICodePart codePart) {
    super(preCentrifugationType, codePart);
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
    if (this == obj) return true;
    if (!super.equals(obj)) return false;
    if (getClass() != obj.getClass()) return false;
    NormalPreCentrifugation other = (NormalPreCentrifugation) obj;
    if (preCentrifugationDelay != other.preCentrifugationDelay) return false;
    if (preCentrifugationTemperature != other.preCentrifugationTemperature) return false;
    return true;
  }
}
