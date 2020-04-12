package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;

public enum SolidSampleType implements ISprecPart, IListObject {
  FRESH_CELLS_FROM_NON_BLOOD_SPECIMEN(new CodePart("CEN")),
  CELLS_FROM_NON_BLOOD_SPECIMEN_VIABLE(new CodePart("CLN")),
  CELLS_FROM_FINE_NEEDLE_ASPIRATE(new CodePart("FNA")),
  HAIR(new CodePart("HAR")),
  CELLS_FROM_LASER_CAPTURE_MICRODISSECTED_TISSUE(new CodePart("LCM")),
  CELLS_FROM_NON_BLOOD_SPECIMEN_NON_VIABLE(new CodePart("PEN")),
  PLACENTA(new CodePart("PLC")),
  SOLID_TISSUE(new CodePart("TIS")),
  DISRUPTED_TISSUES_NON_VIABLE(new CodePart("TCM")),
  OTHER(new CodePart("ZZZ")),
  ;

  private static final SprecPartType SPREC_PART_TYPE = SprecPartType.SOLID_SAMPLE_TYPE;
  private ICodePart codePart;

  private SolidSampleType(ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SolidSampleType.SPREC_PART_TYPE;
  }

  public static boolean contains(SolidSampleType solidSampleType) {

    if (solidSampleType == null) {
      return false;
    }

    for (SolidSampleType listEntry : SolidSampleType.values()) {
      if (solidSampleType.equals(listEntry)) {
        return true;
      }
    }
    return false;
  }
}
