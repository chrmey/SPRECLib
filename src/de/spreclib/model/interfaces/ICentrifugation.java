package de.spreclib.model.interfaces;

import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationDuration;
import de.spreclib.model.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.model.enums.centrifugation.CentrifugationType;

public interface ICentrifugation {

  CentrifugationType getCentrifugationType();

  CentrifugationSpeed getCentrifugationSpeed();

  CentrifugationTemperature getCentrifugationTemperature();

  CentrifugationDuration getCentrifugationDuration();

  CentrifugationBraking getCentrifugationBraking();
}
