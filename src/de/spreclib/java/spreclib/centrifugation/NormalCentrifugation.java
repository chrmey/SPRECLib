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
