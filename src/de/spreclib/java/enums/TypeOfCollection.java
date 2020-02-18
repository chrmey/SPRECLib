package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public enum TypeOfCollection implements ISprecPart, ICodePart {
  AUTOPSY_LESS_THAN_6_HOURS_POSTMORTEM("A06"),
  AUTOPSY_6_TO_12_HOURS_POSTMORTEM("A12"),
  AUTOPSY_12_TO_24_HOURS_POSTMORTEM("A24"),
  AUTOPSY_24_TO_48_HOURS_POSTMORTEM("A48"),
  AUTOPSY_48_TO_72_HOURS_POSTMORTEM("72"),
  BIOPSY_IN_CULTURE_MEDIA("BCM"),
  BIOPSY("BPS"),
  BIOPSY_IN_NORMAL_SALINE_OR_PHOSPHATE_BUFFERED_SALINE("BSL"),
  BIOPSY_IN_TISSUE_LOW_TEMPERATURE_TRANSPORT_MEDIA("BTM"),
  FINE_NEEDLE_ASPIRATE("ASN"),
  PUNCTION("PUN"),
  SURGICAL_EXCISION_IN_CULTURE_MEDIA("SCM"),
  SURGICAL_EXCISION("SRG"),
  SURGICAL_EXCISION_IN_NORMAL_SALINE_OR_PHOSPHATE_BUFFERED_SALINE("SSL"),
  SURGICAL_EXCISION_IN_TISSUE_LOW_TEMPERATURE_TRANSPORT_MEDIA("STM"),
  SURGICAL_EXCISION_INT_VACUUM_CONTAINER("VAC"),
  SWAB("SWB"),
  OTHER("ZZZ");

  private String codePart;

  TypeOfCollection(String code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodePart() {
    return this;
  }

  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.TYPE_OF_COLLECTION;
  }
}
