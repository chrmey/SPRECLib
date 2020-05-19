package de.spreclib.api.main;

import de.spreclib.model.precentrifugation.ParameterizedPreCentrifugation;
import de.spreclib.model.precentrifugation.PreCentrifugation;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationDelay;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationTemperature;
import de.spreclib.model.precentrifugation.enums.PreCentrifugationType;

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

  PreCentrifugationOption(PreCentrifugation preCentrifugation) {
    this.preCentrifugation = preCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    StringBuilder name = new StringBuilder();

    PreCentrifugationType preCentrifugationType = this.preCentrifugation.getPreCentrifugationType();

    name.append(NAMES_DEFAULT.getString(preCentrifugationType.name()));

    if (this.preCentrifugation.isParameterizedPreCentrifugation()) {

      ParameterizedPreCentrifugation normalPreCentrifugation =
          (ParameterizedPreCentrifugation) this.preCentrifugation;

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
  PreCentrifugation getContainedObject() {
    return this.preCentrifugation;
  }

  boolean hasPreCentrifugation(
      PreCentrifugationDelayOption preCentrifugationDelayOption,
      PreCentrifugationTemperatureOption preCentrifugationTemperatureOption) {

    if (preCentrifugationTemperatureOption == null) {
      return false;
    }
    if (preCentrifugationDelayOption == null) {
      return false;
    }

    if (this.preCentrifugation.isParameterizedPreCentrifugation()) {

      PreCentrifugationTemperature preCentrifugationTemperature =
          preCentrifugationTemperatureOption.getContainedObject();
      PreCentrifugationDelay preCentrifugationDelay =
          preCentrifugationDelayOption.getContainedObject();

      ParameterizedPreCentrifugation normalPreCentrifugation =
          (ParameterizedPreCentrifugation) this.preCentrifugation;

      if (normalPreCentrifugation.contains(preCentrifugationDelay, preCentrifugationTemperature)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    return "PreCentrifugationOption [preCentrifugation=" + preCentrifugation + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((preCentrifugation == null) ? 0 : preCentrifugation.hashCode());
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
    PreCentrifugationOption other = (PreCentrifugationOption) obj;
    if (preCentrifugation == null) {
      if (other.preCentrifugation != null) {
        return false;
      }
    } else if (!preCentrifugation.equals(other.preCentrifugation)) {
      return false;
    }
    return true;
  }
}
