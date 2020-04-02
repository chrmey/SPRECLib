package de.spreclib.api.lists.options;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.spreclib.precentrifugation.NormalPreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;

public final class PreCentrifugationOption extends AbstractListOption {

  private final PreCentrifugation preCentrifugation;

  public PreCentrifugationOption(PreCentrifugation preCentrifugation) {
    this.preCentrifugation = preCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    PreCentrifugationType preCentrifugationType = this.preCentrifugation.getPreCentrifugationType();

    name.append(NAMES_DEFAULT.getString(preCentrifugationType.name()));

    if (this.preCentrifugation.isNormalPreCentrifugation()) {

      NormalPreCentrifugation normalPreCentrifugation =
          (NormalPreCentrifugation) this.preCentrifugation;

      PreCentrifugationTemperature preCentrifugationTemperature =
          normalPreCentrifugation.getPreCentrifugationTemperature();
      PreCentrifugationDelay preCentrifugationDelay =
          normalPreCentrifugation.getPreCentrifugationDelay();

      name.append(NAMES_DEFAULT.getString(preCentrifugationTemperature.name()))
          .append(" ")
          .append(NAMES_DEFAULT.getString(preCentrifugationDelay.name()));
    }

    return name.toString();
  }

  @Override
  public PreCentrifugation getContainedObject() {
    return this.preCentrifugation;
  }
}
