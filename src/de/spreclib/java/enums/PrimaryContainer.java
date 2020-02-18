package de.spreclib.java.enums;

import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public enum PrimaryContainer implements ISprecPart, ICodePart {
  ACID_CITRATE_DEXTROSE("ACD"),
  ADDITIVES("ADD"),
  SERUM_TUBE_WITHOUT_CLOT_ACTIVATOR("CAT"),
  CITRATE_PHOSPHATE_DEXTROSE("CPD"),
  CELL_PREPARATION_TUBE("CPT"),
  EDTA_AND_GEL("EDG"),
  LITHIUM_HEPARIN("HEP"),
  HIRUDIN("HIR"),
  LITHIUM_HEPARIN_AND_GEL("LHG"),
  ORAGENE_COLLECTION_CONTAINER("ORG"),
  PAXGENE_BLOOD_RNA_PLUS("PAX"),
  POTASSIUM_EDTA("PED"),
  POLYETHYLENE_TUBE_STERILE("PET"),
  S8820_PROTEASE_INHIBITOR_TABLETS("PI1"),
  PROTEASE_INHIBITORS("PIX"),
  POLYPROPYLENE_TUBE_STRERILE("PPS"),
  PAXGENE_BLOOD_DNA("PXD"),
  PAXGENE_BONE_MARROW_RNA("PXR"),
  SODIUM_CITRATE("SCI"),
  SODIUM_EDTA("SED"),
  SODIUM_HEPARIN("SHP"),
  SODIUM_FLUORIDE_OR_POSTASSIUM_OXALATE("SPO"),
  SERUM_SEPERATOR_TUBE_WITH_CLOT_ACTIVATOR("SST"),
  TEMPUS_TUBE("TEM"),
  TRACE_ELEMENTS_TUBE("TRC"),
  UNKNOWN("XXX"),
  OTHER("ZZZ");

  private String codePart;

  PrimaryContainer(String code) {
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
    return SprecPartType.PRIMARY_CONTAINER;
  }
}
