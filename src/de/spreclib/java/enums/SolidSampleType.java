package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public enum SolidSampleType implements ISprecPart, ICodePart {
  FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN("CEN"),
  CELLS_FROM_NON_BLOOD_SPECIMEN("CLN"),
  CELLS_FROM_FINE_NEEDLE_ASPIRATE("FNA"),
  HAIR("HAR"),
  CELLS_FROM_LASER_CAPTURE_MICRODISSECTED_TISSUE("LCM"),
  PLACENTA("PLC"),
  SOLID_TISSUE("TIS"),
  DISRUPTED_TISSUES_NON_VIABLE("TCM"),
  OTHER("ZZZ");

  private String codePart;

  SolidSampleType(String code) {
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
    return SprecPartType.SOLID_SAMPLE_TYPE;
  }
}
