package de.spreclib.api.lists;

import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.NormalCentrifugation;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;

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

    if (this.secondCentrifugation.isNormalCentrifugation()) {

      NormalCentrifugation normalCentrifugation = (NormalCentrifugation) this.secondCentrifugation;

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
  public Centrifugation getContainedObject() {
    return this.secondCentrifugation;
  }

  protected boolean hasSecondCentrifugation(
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

    if (this.secondCentrifugation.isNormalCentrifugation()) {

      SecondCentrifugationTemperature secondCentrifugationTemperature =
          secondCentrifugationTemperatureOption.getContainedObject();
      SecondCentrifugationDuration secondCentrifugationDuration =
          secondCentrifugationDurationOption.getContainedObject();
      SecondCentrifugationSpeed secondCentrifugationSpeed =
          secondCentrifugationSpeedOption.getContainedObject();
      CentrifugationBraking secondCentrifugationBraking =
          secondCentrifugationBrakingOption.getContainedObject();

      NormalCentrifugation normalSecondCentrifugation =
          (NormalCentrifugation) this.secondCentrifugation;

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
}
