package de.spreclib.java.interfaces;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;

public interface IPreCentrifugation {

  PreCentrifugationType getPreCentrifugationType();

  PreCentrifugationDelay getPreCentrifugationDelay();

  PreCentrifugationTemperature getPreCentrifugationTemperature();
}
