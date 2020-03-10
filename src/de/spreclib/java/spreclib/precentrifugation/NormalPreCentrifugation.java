package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public final class NormalPreCentrifugation extends PreCentrifugation {

  private final PreCentrifugationDelay PRECENTRIFUGATIONDELAY;
  private final PreCentrifugationTemperature PRECENTRIFUGATIONTEMPERATURE;

  public NormalPreCentrifugation(
      PreCentrifugationType preCentrifugationType,
      PreCentrifugationDelay preCentrifugationDelay,
      PreCentrifugationTemperature preCentrifugationTemperature,
      ICodePart codePart) {
    super(preCentrifugationType, codePart);
    this.PRECENTRIFUGATIONDELAY = preCentrifugationDelay;
    this.PRECENTRIFUGATIONTEMPERATURE = preCentrifugationTemperature;
  }

  public PreCentrifugationDelay getPreCentrifugationDelay() {
    return this.PRECENTRIFUGATIONDELAY;
  }

  public PreCentrifugationTemperature getPreCentrifugationTemperature() {
    return this.PRECENTRIFUGATIONTEMPERATURE;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result =
        prime * result + ((PRECENTRIFUGATIONDELAY == null) ? 0 : PRECENTRIFUGATIONDELAY.hashCode());
    result =
        prime * result
            + ((PRECENTRIFUGATIONTEMPERATURE == null)
                ? 0
                : PRECENTRIFUGATIONTEMPERATURE.hashCode());
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
    if (PRECENTRIFUGATIONDELAY != other.PRECENTRIFUGATIONDELAY) {
      return false;
    }
    if (PRECENTRIFUGATIONTEMPERATURE != other.PRECENTRIFUGATIONTEMPERATURE) {
      return false;
    }
    return true;
  }
}
