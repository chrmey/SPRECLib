package de.spreclib.api.lists.options;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.precentrifugation.NormalPreCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugation;

/**
 * PreCentrifugationOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
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

  public boolean hasPreCentrifugation(
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption,
      PreCentrifugationDelayOption preCentrifugationDelayOption) {

    if (preCentrifugationTemperatureOption == null) {
      return false;
    }
    if (preCentrifugationDelayOption == null) {
      return false;
    }
    
    if (this.preCentrifugation.isNormalPreCentrifugation()) {

      PreCentrifugationTemperature preCentrifugationTemperature =
          preCentrifugationTemperatureOption.getContainedObject();
      PreCentrifugationDelay preCentrifugationDelay =
          preCentrifugationDelayOption.getContainedObject();

      NormalPreCentrifugation normalPreCentrifugation =
          (NormalPreCentrifugation) this.preCentrifugation;

      if (normalPreCentrifugation.contains(preCentrifugationTemperature, preCentrifugationDelay)) {
        return true;
      }
    }
    return false;
  }
}
