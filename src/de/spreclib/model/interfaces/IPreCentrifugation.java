package de.spreclib.model.interfaces;

import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;

public interface IPreCentrifugation {

  PreCentrifugationType getPreCentrifugationType();

  PreCentrifugationDelay getPreCentrifugationDelay();

  PreCentrifugationTemperature getPreCentrifugationTemperature();
}
