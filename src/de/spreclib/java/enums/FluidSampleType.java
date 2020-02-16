package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public enum FluidSampleType implements ISprecPart, ICodePart {
  ASCITIES_FLUID("ASC"),
  AMNIOTIC_FLUID("AMN"),
  BRONCHOALVEOLAR_LAVAGE("BAL"),
  BLOOD_WHOLE("BLD"),
  BONE_MARROW_ASPIRATE("BMA"),
  BREAST_MILK("BMK"),
  BUCCAL_CELLS("BUC"),
  UNFICOLLED_BUFFY_COAT_VIABLE("BUF"),
  UNFICOLLED_BUFFY_COAT_NON_VIABLE("BFF"),
  FICOLL_MONONUCLEAR_CELLS_VIABLE("CEL"),
  FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN_TYPE("CEN"),
  CELLS_FROM_NON_BLOOD_SPECIMEN_TYPE_VIABLE("CLN"),
  CORD_BLOOD("CRD"),
  CEREBROSPINAL_FLUID("CSF"),
  DRIED_WHOLE_BLOOD("DWB"),
  NASAL_WASHING("NAS"),
  FICOLL_MONONUCLEAR_CELLS_NON_VIABLE("PEL"),
  CELLS_FROM_NON_BLOOD_SPECIMEN_TYPE_NON_VIABLE("PEN"),
  PLEURAL_FLUID("PFL"),
  PLASMA_SINGLE_SPUN("PL1"),
  PLASMA_DOUBLE_SPUN("PL2"),
  RED_BLOOD_CELLS("RBC"),
  SALIVA("SAL"),
  SEMEN("SEM"),
  SERUM("SER"),
  SPUTUM("SPT"),
  STOOL("STL"),
  SYNOVIAL_FLUID("SYN"),
  TEARS("TER"),
  TWENTYFOUR_HOUR_URINE("U24"),
  URINE_RANDOM("URN"),
  URINE_FIRST_MORNING("URM"),
  URINE_TIMED("URT"),
  OTHER("ZZZ");

  private String codePart;

  FluidSampleType(String code) {
    this.codePart = code;
  }

  @Override
  public String getCodePart() {
    return this.codePart;
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FLUID_SAMPLE_TYPE;
  }
}
