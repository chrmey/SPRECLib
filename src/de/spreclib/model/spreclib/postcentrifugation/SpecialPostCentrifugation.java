package de.spreclib.model.spreclib.postcentrifugation;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialPostCentrifugation extends PostCentrifugation {

  public SpecialPostCentrifugation(
      PostCentrifugationType postCentrifugationType, ICodePart codePart) {
    super(postCentrifugationType, codePart);
  }
}
