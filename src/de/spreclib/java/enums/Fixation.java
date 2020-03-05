package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public enum Fixation implements ISprecPart {
  NON_ALDEHYDE_WITH_ACETIC_ACID(new CodePart("ACA")),
  ALDEHYDE_BASED(new CodePart("ALD")),
  ALLPROTECT_TISSUE_REAGENT(new CodePart("ALL")),
  ALCOHOL_BASED(new CodePart("ETH")),
  NON_BUFFERED_FORMALIN(new CodePart("FOR")),
  HEAT_STABILIZATION(new CodePart("HST")),
  SNAP_FREEZING(new CodePart("SNP")),
  NON_ALDEHYDE_BASE_WITHOUT_ACETIC_ACID(new CodePart("NAA")),
  NEUTRAL_BUFFERED_FORMALIN(new CodePart("NBF")),
  OPTIMUM_CUTTING_TEMPERATURE_MEDIUM(new CodePart("OCT")),
  PAXGENE_TISSUE(new CodePart("PXT")),
  RNA_LATER(new CodePart("RNL")),
  UNKNOWN(new CodePart("XXX")),
  OTHER(new CodePart("ZZZ")),
  ;

  private ICodePart codePart;

  private Fixation(ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIXATION;
  }
}
