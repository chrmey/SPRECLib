package de.spreclib.enums;

import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

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

  PrimaryContainer(String string) {
    // TODO Auto-generated constructor stubF
  }

  @Override
  public String getCodePart() { // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ISprecPart getSprecPart() { // TODO Auto-generated method stub
    return null;
  }
}
