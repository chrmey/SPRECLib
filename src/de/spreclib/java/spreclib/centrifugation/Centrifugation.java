package de.spreclib.java.spreclib.centrifugation;

import java.util.ArrayList;
import java.util.List;

import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICentrifugation;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;

public class Centrifugation implements ICentrifugation {

  protected static final List<ICentrifugation> centrifugations;

  private CentrifugationType centrifugationType;
  private CentrifugationDuration centrifugationDuration;
  private CentrifugationSpeed centrifugationSpeed;
  private CentrifugationTemperature centrifugationTemperature;
  private CentrifugationBraking centrifugationBraking;
  private ICodePart codePart;

  static {
    centrifugations = new ArrayList<>();
    centrifugations.add(new NoCentrifugation(new CodePart("N")));
    centrifugations.add(new UnknownCentrifugation(new CodePart("X")));
    centrifugations.add(new OtherCentrifugation(new CodePart("Z")));
  }
  
  protected Centrifugation(ICodePart codePart) {
	  this.codePart = codePart;
  }

  public Centrifugation(CentrifugationType centrifugationType, 
		  CentrifugationDuration centrifugationDuration,
		  CentrifugationSpeed centrifugationSpeed, 
		  CentrifugationTemperature centrifugationTemperature,
		  CentrifugationBraking centrifugationBraking,
		  ICodePart codePart) {
	  this.centrifugationType = centrifugationType;
	  this.centrifugationDuration = centrifugationDuration;
	  this.centrifugationSpeed = centrifugationSpeed;
	  this.centrifugationTemperature = centrifugationTemperature;
	  this.centrifugationBraking = centrifugationBraking;
	  this.codePart = codePart;
	  
  }

  @Override
  public CentrifugationType getCentrifugationType() {
    return this.centrifugationType;
  }

  @Override
  public CentrifugationSpeed getCentrifugationSpeed() {
    return this.centrifugationSpeed;
  }

  @Override
  public CentrifugationTemperature getCentrifugationTemperature() {
    return this.centrifugationTemperature;
  }

  @Override
  public CentrifugationDuration getCentrifugationDuration() {
    return this.centrifugationDuration;
  }

  @Override
  public CentrifugationBraking getCentrifugationBraking() {
    return this.centrifugationBraking;
  }
}
