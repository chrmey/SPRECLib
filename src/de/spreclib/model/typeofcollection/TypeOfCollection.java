package de.spreclib.model.typeofcollection;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;

public enum TypeOfCollection implements ISprecPart, IListProvideable {
  AUTOPSY_LESS_6_HOURS_POSTMORTEM(new CodePart("A06")),
  AUTOPSY_6_TO_12_HOURS_POSTMORTEM(new CodePart("A12")),
  AUTOPSY_12_TO_24_HOURS_POSTMORTEM(new CodePart("A24")),
  AUTOPSY_24_TO_48_HOURS_POSTMORTEM(new CodePart("A48")),
  AUTOPSY_48_TO_72_HOURS_POSTMORTEM(new CodePart("A72")),
  BIOPSY_IN_CULTURE_MEDIA(new CodePart("BCM")),
  BIOPSY(new CodePart("BPS")),
  BIOPSY_IN_NORMAL_SALINE_OR_PHOSPHATE_BUFFERED_SALINE(new CodePart("BSL")),
  BIOPSY_IN_TISSUE_LOW_TEMPERATURE_TRANSPORT_MEDIA(new CodePart("BTM")),
  FINE_NEEDLE_ASPIRATE(new CodePart("ASN")),
  PUNCTION(new CodePart("PUN")),
  SURGICAL_EXCISION_IN_CULTURE_MEDIA(new CodePart("SCM")),
  SURGICAL_EXCISION(new CodePart("SRG")),
  SURGICAL_EXCISION_IN_NORMAL_SALINE_OR_PHOSPHATE_BUFFERED_SALINE(new CodePart("SSL")),
  SURGICAL_EXCISION_IN_TISSUE_LOW_TEMPERATURE_TRANSPORT_MEDIA(new CodePart("STM")),
  SURGICAL_EXCISION_INT_VACUUM_CONTAINER(new CodePart("VAC")),
  SWAB(new CodePart("SWB")),
  OTHER(new CodePart("ZZZ")),
  ;
	
  private ICodePart codePart;

  private TypeOfCollection(ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  public static boolean contains(TypeOfCollection typeOfCollection) {

    if (typeOfCollection == null) {
      return false;
    }

    for (TypeOfCollection listEntry : TypeOfCollection.values()) {
      if (typeOfCollection.equals(listEntry)) {
        return true;
      }
    }
    return false;
  }
}
