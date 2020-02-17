package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public enum Fixation implements ISprecPart, ICodePart {
  NON_ALDEHYDE_WITH_ACETIC_ACID("ACA"),
  ALDEHYDE_BASED("ALD"),
  ALLPROTECT_TISSUE_REAGENT("ALL"),
  ALCOHOL_BASED("ETH"),
  NON_BUFFERED_FORMALIN("FOR"),
  HEAT_STABILIZATION("HST"),
  SNAP_FREEZING("SNP"),
  NON_ALDEHYDE_BASE_WITHOUT_ACETIC_ACID("NAA"),
  NEUTRAL_BUFFERED_FORMALIN("NBF"),
  OPTIMUM_CUTTING_TEMPERATURE_MEDIUM("OCT"),
  PAXGENE_TISSUE("PXT"),
  RNA_LATER("RNL"),
  UNKNOWN("XXX"),
  OTHER("ZZZ");

  private String codePart;

  private Fixation(String code) {
    this.codePart = code;
  }

  @Override
  public String getCodePart() {
    return codePart;
  }
  
  @Override
  public ISprecPart getSprecPart() {
    // TODO könnte vielleicht eher this.name() zurückgeben
    //	Methodensignatur auf String ändern
    return null;
  }

  @Override
  public String getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIXATION;
  }
  
  @Override 
  public String toString() {
	  return codePart;
  }
}
