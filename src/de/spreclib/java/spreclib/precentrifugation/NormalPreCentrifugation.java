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
}
