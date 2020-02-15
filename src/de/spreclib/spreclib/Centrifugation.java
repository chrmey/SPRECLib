package de.spreclib.spreclib;

import de.spreclib.enums.CentrifugationDuration;
import de.spreclib.enums.CentrifugationSpeed;
import de.spreclib.enums.CentrifugationTemperature;
import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public abstract class Centrifugation implements ISprecPart, ICodePart {

  private CentrifugationDuration centrifugationDuration;
  private CentrifugationSpeed centrifugationSpeed;
  private CentrifugationTemperature centrifugationTemperature;
  private boolean centrifugationBrake;

  public Centrifugation() {}
}
