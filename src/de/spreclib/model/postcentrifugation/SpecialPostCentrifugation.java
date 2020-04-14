package de.spreclib.model.postcentrifugation;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;

public final class SpecialPostCentrifugation extends PostCentrifugation {

  SpecialPostCentrifugation(PostCentrifugationType postCentrifugationType, ICodePart codePart) {
    super(postCentrifugationType, codePart);
  }

  @Override
  public boolean isNormalPostCentrifugation() {
    return false;
  }

  @Override
  public boolean isSpecialPostCentrifugation() {
    return true;
  }
}
