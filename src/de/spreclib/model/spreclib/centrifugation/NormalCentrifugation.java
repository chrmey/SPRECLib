package de.spreclib.model.spreclib.centrifugation;

import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationDuration;
import de.spreclib.model.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class NormalCentrifugation extends Centrifugation {

  private static final CentrifugationType CENTRIFUGATION_TYPE = CentrifugationType.DEFAULT;
  private final CentrifugationDuration centrifugationDuration;
  private final CentrifugationSpeed centrifugationSpeed;
  private final CentrifugationTemperature centrifugationTemperature;
  private final CentrifugationBraking centrifugationBraking;

  /**
   * Constructor for NormalCentrifugation.
   *
   * @param centrifugationDuration enum CentrifugationDuration
   * @param centrifugationSpeed enum CentrifugationSpeed
   * @param centrifugationTemperature enum CentrifugationTemperature
   * @param centrifugationBraking enum CentrifugationBraking
   * @param codePart object CodePart
   * @param sprecPartType enum SprecPartType -> needed for differention between first and second
   *     centrifugation
   */
  public NormalCentrifugation(
      CentrifugationDuration centrifugationDuration,
      CentrifugationSpeed centrifugationSpeed,
      CentrifugationTemperature centrifugationTemperature,
      CentrifugationBraking centrifugationBraking,
      ICodePart codePart,
      SprecPartType sprecPartType) {
    super(CENTRIFUGATION_TYPE, codePart, sprecPartType);
    this.centrifugationDuration = centrifugationDuration;
    this.centrifugationSpeed = centrifugationSpeed;
    this.centrifugationTemperature = centrifugationTemperature;
    this.centrifugationBraking = centrifugationBraking;
  }

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

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result =
        prime * result + ((centrifugationBraking == null) ? 0 : centrifugationBraking.hashCode());
    result =
        prime * result + ((centrifugationDuration == null) ? 0 : centrifugationDuration.hashCode());
    result = prime * result + ((centrifugationSpeed == null) ? 0 : centrifugationSpeed.hashCode());
    result =
        prime * result
            + ((centrifugationTemperature == null) ? 0 : centrifugationTemperature.hashCode());
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
    NormalCentrifugation other = (NormalCentrifugation) obj;
    if (centrifugationBraking != other.centrifugationBraking) {
      return false;
    }
    if (centrifugationDuration != other.centrifugationDuration) {
      return false;
    }
    if (centrifugationSpeed != other.centrifugationSpeed) {
      return false;
    }
    if (centrifugationTemperature != other.centrifugationTemperature) {
      return false;
    }
    return true;
  }
}
