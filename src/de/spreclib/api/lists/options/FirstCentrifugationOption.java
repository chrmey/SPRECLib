package de.spreclib.api.lists.options;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.NormalCentrifugation;

public final class FirstCentrifugationOption extends AbstractListOption {

  private final Centrifugation firstCentrifugation;

  public FirstCentrifugationOption(Centrifugation firstCentrifugation) {
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
  public IListObject getContainedObject() {
    return null;
  }
}
