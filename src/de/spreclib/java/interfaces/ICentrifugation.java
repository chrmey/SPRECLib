package de.spreclib.java.interfaces;

import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;

public interface ICentrifugation {

  CentrifugationType getCentrifugationType();

  CentrifugationSpeed getCentrifugationSpeed();

  CentrifugationTemperature getCentrifugationTemperature();

  CentrifugationDuration getCentrifugationDuration();

  CentrifugationBraking getCentrifugationBraking();
}
