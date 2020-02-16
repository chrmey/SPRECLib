package de.spreclib.java.spreclib;

import de.spreclib.java.enums.CentrifugationDuration;
import de.spreclib.java.enums.CentrifugationSpeed;
import de.spreclib.java.enums.CentrifugationTemperature;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class Centrifugation implements ISprecPart, ICodePart {

  private CentrifugationDuration centrifugationDuration;
  private CentrifugationSpeed centrifugationSpeed;
  private CentrifugationTemperature centrifugationTemperature;
  private boolean centrifugationBrake;

  public Centrifugation() {}
}
