package de.spreclib.model.centrifugation;

import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.centrifugation.enums.ICentrifugationDuration;
import de.spreclib.model.centrifugation.enums.ICentrifugationSpeed;
import de.spreclib.model.centrifugation.enums.ICentrifugationTemperature;
import de.spreclib.model.interfaces.ICodePart;

public final class ParameterizedCentrifugation extends Centrifugation {

  private static final CentrifugationType CENTRIFUGATION_TYPE = CentrifugationType.DEFAULT;
  private final ICentrifugationTemperature centrifugationTemperature;
  private final ICentrifugationDuration centrifugationDuration;
  private final ICentrifugationSpeed centrifugationSpeed;
  private final CentrifugationBraking centrifugationBraking;

  ParameterizedCentrifugation(
      ICentrifugationTemperature centrifugationTemperature,
      ICentrifugationDuration centrifugationDuration,
      ICentrifugationSpeed centrifugationSpeed,
      CentrifugationBraking centrifugationBraking,
      ICodePart codePart) {
    super(CENTRIFUGATION_TYPE, codePart);
    this.centrifugationDuration = centrifugationDuration;
    this.centrifugationSpeed = centrifugationSpeed;
    this.centrifugationTemperature = centrifugationTemperature;
    this.centrifugationBraking = centrifugationBraking;
  }

  @Override
  public boolean isParameterizedCentrifugation() {
    return true;
  }

  public ICentrifugationTemperature getCentrifugationTemperature() {
    return centrifugationTemperature;
  }

  public ICentrifugationDuration getCentrifugationDuration() {
    return centrifugationDuration;
  }

  public ICentrifugationSpeed getCentrifugationSpeed() {
    return centrifugationSpeed;
  }

  public CentrifugationBraking getCentrifugationBraking() {
    return centrifugationBraking;
  }

  public boolean contains(
      ICentrifugationTemperature centrifugationTemperature,
      ICentrifugationDuration centrifugationDuration,
      ICentrifugationSpeed centrifugationSpeed,
      CentrifugationBraking centrifugationBraking) {

    if (this.centrifugationTemperature == centrifugationTemperature
        && this.centrifugationDuration == centrifugationDuration
        && this.centrifugationSpeed == centrifugationSpeed
        && this.centrifugationBraking == centrifugationBraking) {
      return true;
    } else {
      return false;
    }
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
    ParameterizedCentrifugation other = (ParameterizedCentrifugation) obj;
    if (centrifugationBraking != other.centrifugationBraking) {
      return false;
    }
    if (centrifugationDuration == null) {
      if (other.centrifugationDuration != null) {
        return false;
      }
    } else if (!centrifugationDuration.equals(other.centrifugationDuration)) {
      return false;
    }
    if (centrifugationSpeed == null) {
      if (other.centrifugationSpeed != null) {
        return false;
      }
    } else if (!centrifugationSpeed.equals(other.centrifugationSpeed)) {
      return false;
    }
    if (centrifugationTemperature == null) {
      if (other.centrifugationTemperature != null) {
        return false;
      }
    } else if (!centrifugationTemperature.equals(other.centrifugationTemperature)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "ParameterizedCentrifugation [centrifugationTemperature="
        + centrifugationTemperature
        + ", centrifugationDuration="
        + centrifugationDuration
        + ", centrifugationSpeed="
        + centrifugationSpeed
        + ", centrifugationBraking="
        + centrifugationBraking
        + "]";
  }
}
