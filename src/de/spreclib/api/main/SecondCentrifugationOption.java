package de.spreclib.api.main;

import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.ParameterizedCentrifugation;
import de.spreclib.model.centrifugation.enums.CentrifugationBraking;
import de.spreclib.model.centrifugation.enums.CentrifugationType;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationDuration;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationSpeed;
import de.spreclib.model.centrifugation.enums.SecondCentrifugationTemperature;

/**
 * SecondCentrifugationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class SecondCentrifugationOption extends AbstractListOption {

  private final Centrifugation secondCentrifugation;

  SecondCentrifugationOption(Centrifugation secondCentrifugation) {
    this.secondCentrifugation = secondCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    CentrifugationType centrifugationType = this.secondCentrifugation.getCentrifugationType();

    name.append(NAMES_DEFAULT.getString(centrifugationType.name()));

    if (this.secondCentrifugation.isParameterizedCentrifugation()) {

      ParameterizedCentrifugation normalCentrifugation =
          (ParameterizedCentrifugation) this.secondCentrifugation;

      SecondCentrifugationTemperature centrifugationTemperature =
          (SecondCentrifugationTemperature) normalCentrifugation.getCentrifugationTemperature();
      SecondCentrifugationDuration centrifugationDuration =
          (SecondCentrifugationDuration) normalCentrifugation.getCentrifugationDuration();
      SecondCentrifugationSpeed centrifugationSpeed =
          (SecondCentrifugationSpeed) normalCentrifugation.getCentrifugationSpeed();
      CentrifugationBraking centrifugationBraking = normalCentrifugation.getCentrifugationBraking();

      name.append(NAMES_DEFAULT.getString(centrifugationTemperature.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(centrifugationDuration.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(centrifugationSpeed.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(centrifugationBraking.name()));
    }

    return name.toString();
  }

  @Override
  Centrifugation getContainedObject() {
    return this.secondCentrifugation;
  }

  boolean hasSecondCentrifugation(
      SecondCentrifugationTemperatureOption secondCentrifugationTemperatureOption,
      SecondCentrifugationDurationOption secondCentrifugationDurationOption,
      SecondCentrifugationSpeedOption secondCentrifugationSpeedOption,
      SecondCentrifugationBrakingOption secondCentrifugationBrakingOption) {

    if (secondCentrifugationTemperatureOption == null) {
      return false;
    }

    if (secondCentrifugationDurationOption == null) {
      return false;
    }

    if (secondCentrifugationSpeedOption == null) {
      return false;
    }

    if (secondCentrifugationBrakingOption == null) {
      return false;
    }

    if (this.secondCentrifugation.isParameterizedCentrifugation()) {

      SecondCentrifugationTemperature secondCentrifugationTemperature =
          secondCentrifugationTemperatureOption.getContainedObject();
      SecondCentrifugationDuration secondCentrifugationDuration =
          secondCentrifugationDurationOption.getContainedObject();
      SecondCentrifugationSpeed secondCentrifugationSpeed =
          secondCentrifugationSpeedOption.getContainedObject();
      CentrifugationBraking secondCentrifugationBraking =
          secondCentrifugationBrakingOption.getContainedObject();

      ParameterizedCentrifugation normalSecondCentrifugation =
          (ParameterizedCentrifugation) this.secondCentrifugation;

      if (normalSecondCentrifugation.contains(
          secondCentrifugationTemperature,
          secondCentrifugationDuration,
          secondCentrifugationSpeed,
          secondCentrifugationBraking)) {
        return true;
      }
    }
    return false;
  }

  boolean hasCodeString(String codeString) {
    if (this.secondCentrifugation
        .getCodeFromSprecFactor()
        .getStringRepresentation()
        .equals(codeString)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result + ((secondCentrifugation == null) ? 0 : secondCentrifugation.hashCode());
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
    SecondCentrifugationOption other = (SecondCentrifugationOption) obj;
    if (secondCentrifugation == null) {
      if (other.secondCentrifugation != null) {
        return false;
      }
    } else if (!secondCentrifugation.equals(other.secondCentrifugation)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "SecondCentrifugationOption [secondCentrifugation=" + secondCentrifugation + "]";
  }
}
