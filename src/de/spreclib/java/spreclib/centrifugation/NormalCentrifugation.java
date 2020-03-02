package de.spreclib.java.spreclib.centrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class NormalCentrifugation extends Centrifugation {

  public NormalCentrifugation(
      CentrifugationType centrifugationType,
      CentrifugationDuration centrifugationDuration,
      CentrifugationSpeed centrifugationSpeed,
      CentrifugationTemperature centrifugationTemperature,
      CentrifugationBraking centrifugationBraking,
      ICodePart codePart,
      SprecPartType sprecPartType) {
    super(centrifugationType, codePart, sprecPartType);
    this.centrifugationDuration = centrifugationDuration;
    this.centrifugationSpeed = centrifugationSpeed;
    this.centrifugationTemperature = centrifugationTemperature;
    this.centrifugationBraking = centrifugationBraking;
  }

  private CentrifugationDuration centrifugationDuration;
  private CentrifugationSpeed centrifugationSpeed;
  private CentrifugationTemperature centrifugationTemperature;
  private CentrifugationBraking centrifugationBraking;

  public CentrifugationSpeed getCentrifugationSpeed() {
    return this.centrifugationSpeed;
  }

  public CentrifugationTemperature getCentrifugationTemperature() {
    return this.centrifugationTemperature;
  }

  public CentrifugationDuration getCentrifugationDuration() {
    return this.centrifugationDuration;
  }

  public CentrifugationBraking getCentrifugationBraking() {
    return this.centrifugationBraking;
  }
}
