package de.spreclib.api.lists;

import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.NormalCentrifugation;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;

/**
 * FirstCentrifugationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class FirstCentrifugationOption extends AbstractListOption {

  private final Centrifugation firstCentrifugation;

  FirstCentrifugationOption(Centrifugation firstCentrifugation) {
    this.firstCentrifugation = firstCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    CentrifugationType centrifugationType = this.firstCentrifugation.getCentrifugationType();

    name.append(NAMES_DEFAULT.getString(centrifugationType.name()));

    if (this.firstCentrifugation.isNormalCentrifugation()) {

      NormalCentrifugation normalCentrifugation = (NormalCentrifugation) this.firstCentrifugation;

      FirstCentrifugationTemperature centrifugationTemperature =
          (FirstCentrifugationTemperature) normalCentrifugation.getCentrifugationTemperature();
      FirstCentrifugationDuration centrifugationDuration =
          (FirstCentrifugationDuration) normalCentrifugation.getCentrifugationDuration();
      FirstCentrifugationSpeed centrifugationSpeed =
          (FirstCentrifugationSpeed) normalCentrifugation.getCentrifugationSpeed();
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
    return this.firstCentrifugation;
  }

  protected boolean hasFirstCentrifugation(
      FirstCentrifugationTemperatureOption firstCentrifugationTemperatureOption,
      FirstCentrifugationDurationOption firstCentrifugationDurationOption,
      FirstCentrifugationSpeedOption firstCentrifugationSpeedOption,
      FirstCentrifugationBrakingOption firstCentrifugationBrakingOption) {

    if (firstCentrifugationTemperatureOption == null) {
      return false;
    }

    if (firstCentrifugationDurationOption == null) {
      return false;
    }

    if (firstCentrifugationSpeedOption == null) {
      return false;
    }

    if (firstCentrifugationBrakingOption == null) {
      return false;
    }

    if (this.firstCentrifugation.isNormalCentrifugation()) {

      FirstCentrifugationTemperature firstCentrifugationTemperature =
          firstCentrifugationTemperatureOption.getContainedObject();
      FirstCentrifugationDuration firstCentrifugationDuration =
          firstCentrifugationDurationOption.getContainedObject();
      FirstCentrifugationSpeed firstCentrifugationSpeed =
          firstCentrifugationSpeedOption.getContainedObject();
      CentrifugationBraking firstCentrifugationBraking =
          firstCentrifugationBrakingOption.getContainedObject();

      NormalCentrifugation normalFirstCentrifugation =
          (NormalCentrifugation) this.firstCentrifugation;

      if (normalFirstCentrifugation.contains(
          firstCentrifugationTemperature,
          firstCentrifugationDuration,
          firstCentrifugationSpeed,
          firstCentrifugationBraking)) {
        return true;
      }
    }
    return false;
  }
}
