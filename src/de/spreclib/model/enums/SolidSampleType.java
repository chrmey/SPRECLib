package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.spreclib.CodePart;

public enum SolidSampleType implements ISprecPart {
  FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN(new CodePart("CEN")),
  CELLS_FROM_NON_BLOOD_SPECIMEN(new CodePart("CLN")),
  CELLS_FROM_FINE_NEEDLE_ASPIRATE(new CodePart("FNA")),
  HAIR(new CodePart("HAR")),
  CELLS_FROM_LASER_CAPTURE_MICRODISSECTED_TISSUE(new CodePart("LCM")),
  PLACENTA(new CodePart("PLC")),
  SOLID_TISSUE(new CodePart("TIS")),
  DISRUPTED_TISSUES_NON_VIABLE(new CodePart("TCM")),
  OTHER(new CodePart("ZZZ")),
  ;

  private ICodePart codePart;

  SolidSampleType(ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.SOLID_SAMPLE_TYPE;
  }
}
