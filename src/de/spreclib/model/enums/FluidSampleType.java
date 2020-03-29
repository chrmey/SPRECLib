package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;

public enum FluidSampleType implements ISprecPart {
  ASCITIES_FLUID(new CodePart("ASC")),
  AMNIOTIC_FLUID(new CodePart("AMN")),
  BRONCHOALVEOLAR_LAVAGE(new CodePart("BAL")),
  BLOOD_WHOLE(new CodePart("BLD")),
  BONE_MARROW_ASPIRATE(new CodePart("BMA")),
  BREAST_MILK(new CodePart("BMK")),
  BUCCAL_CELLS(new CodePart("BUC")),
  UNFICOLLED_BUFFY_COAT_VIABLE(new CodePart("BUF")),
  UNFICOLLED_BUFFY_COAT_NON_VIABLE(new CodePart("BFF")),
  FICOLL_MONONUCLEAR_CELLS_VIABLE(new CodePart("CEL")),
  FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN_TYPE(new CodePart("CEN")),
  CELLS_FROM_NON_BLOOD_SPECIMEN_TYPE_VIABLE(new CodePart("CLN")),
  CORD_BLOOD(new CodePart("CRD")),
  CEREBROSPINAL_FLUID(new CodePart("CSF")),
  DRIED_WHOLE_BLOOD(new CodePart("DWB")),
  NASAL_WASHING(new CodePart("NAS")),
  FICOLL_MONONUCLEAR_CELLS_NON_VIABLE(new CodePart("PEL")),
  CELLS_FROM_NON_BLOOD_SPECIMEN_TYPE_NON_VIABLE(new CodePart("PEN")),
  PLEURAL_FLUID(new CodePart("PFL")),
  PLASMA_SINGLE_SPUN(new CodePart("PL1")),
  PLASMA_DOUBLE_SPUN(new CodePart("PL2")),
  RED_BLOOD_CELLS(new CodePart("RBC")),
  SALIVA(new CodePart("SAL")),
  SEMEN(new CodePart("SEM")),
  SERUM(new CodePart("SER")),
  SPUTUM(new CodePart("SPT")),
  STOOL(new CodePart("STL")),
  SYNOVIAL_FLUID(new CodePart("SYN")),
  TEARS(new CodePart("TER")),
  TWENTYFOUR_HOUR_URINE(new CodePart("U24")),
  URINE_RANDOM(new CodePart("URN")),
  URINE_FIRST_MORNING(new CodePart("URM")),
  URINE_TIMED(new CodePart("URT")),
  OTHER(new CodePart("ZZZ"));

  private static final SprecPartType SPREC_PART_TYPE = SprecPartType.FLUID_SAMPLE_TYPE;
  private final ICodePart codePart;

  FluidSampleType(CodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return FluidSampleType.SPREC_PART_TYPE;
  }

  public String getLocaleName() {
    return ISprecPart.names.getString(this.name());
  }
}
