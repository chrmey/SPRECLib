package de.spreclib.java.spreclib.postcentrifugation;

import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class SpecialPostCentrifugation extends PostCentrifugation {

  public SpecialPostCentrifugation(
      PostCentrifugationType postCentrifugationType, ICodePart codePart) {
    super(postCentrifugationType, codePart);
  }
}
