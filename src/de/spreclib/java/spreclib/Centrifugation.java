package de.spreclib.java.spreclib;

import java.util.List;
import java.util.Map;

import de.spreclib.java.enums.CentrifugationBraking;
import de.spreclib.java.enums.CentrifugationDuration;
import de.spreclib.java.enums.CentrifugationSpeed;
import de.spreclib.java.enums.CentrifugationTemperature;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class Centrifugation implements ISprecPart, ICodePart {

  protected CentrifugationDuration centrifugationDuration;
  protected CentrifugationSpeed centrifugationSpeed;
  protected CentrifugationTemperature centrifugationTemperature;
  protected CentrifugationBraking centrifugationBraking;

  protected Map<String, List> centrifugationRuleMap;

  protected String codePart;

  public Centrifugation() {}

  public String getCodePart() {
    return this.codePart;
  }

  public String getCodeFromSprecPart() {
    return this.codePart;
  }
}
