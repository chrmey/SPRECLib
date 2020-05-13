package de.spreclib.model.primarycontainer;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecFactor;
import de.spreclib.model.sprec.CodePart;

public enum PrimaryContainer implements ISprecFactor, IListProvideable {
  ACID_CITRATE_DEXTROSE(new CodePart("ACD")),
  ADDITIVES(new CodePart("ADD")),
  SERUM_TUBE_WITHOUT_CLOT_ACTIVATOR(new CodePart("CAT")),
  CITRATE_PHOSPHATE_DEXTROSE(new CodePart("CPD")),
  CELL_PREPARATION_TUBE(new CodePart("CPT")),
  EDTA_AND_GEL(new CodePart("EDG")),
  LITHIUM_HEPARIN(new CodePart("HEP")),
  HIRUDIN(new CodePart("HIR")),
  LITHIUM_HEPARIN_AND_GEL(new CodePart("LHG")),
  ORAGENE_COLLECTION_CONTAINER(new CodePart("ORG")),
  PAXGENE_BLOOD_RNA_PLUS(new CodePart("PAX")),
  POTASSIUM_EDTA(new CodePart("PED")),
  POLYETHYLENE_TUBE_STERILE(new CodePart("PET")),
  S8820_PROTEASE_INHIBITOR_TABLETS(new CodePart("PI1")),
  PROTEASE_INHIBITORS(new CodePart("PIX")),
  POLYPROPYLENE_TUBE_STRERILE(new CodePart("PPS")),
  PAXGENE_BLOOD_DNA(new CodePart("PXD")),
  PAXGENE_BONE_MARROW_RNA(new CodePart("PXR")),
  SODIUM_CITRATE(new CodePart("SCI")),
  SODIUM_EDTA(new CodePart("SED")),
  SODIUM_HEPARIN(new CodePart("SHP")),
  SODIUM_FLUORIDE_OR_POSTASSIUM_OXALATE(new CodePart("SPO")),
  SERUM_SEPERATOR_TUBE_WITH_CLOT_ACTIVATOR(new CodePart("SST")),
  TEMPUS_TUBE(new CodePart("TEM")),
  TRACE_ELEMENTS_TUBE(new CodePart("TRC")),
  UNKNOWN(new CodePart("XXX")),
  OTHER(new CodePart("ZZZ")),
  ;

  private ICodePart codePart;

  private PrimaryContainer(ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecFactor() {
    return this.codePart;
  }

  public static boolean contains(PrimaryContainer primaryContainer) {

    if (primaryContainer == null) {
      return false;
    }

    for (PrimaryContainer listEntry : PrimaryContainer.values()) {
      if (primaryContainer.equals(listEntry)) {
        return true;
      }
    }
    return false;
  }
}
