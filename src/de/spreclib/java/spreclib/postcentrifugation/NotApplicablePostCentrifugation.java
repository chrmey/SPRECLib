package de.spreclib.java.spreclib.postcentrifugation;

import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class NotApplicablePostCentrifugation extends PostCentrifugation {

  public NotApplicablePostCentrifugation(ICodePart codePart) {
    super(codePart);
  }

  @Override
  public PostCentrifugationType getPostCentrifugationType() {
    return PostCentrifugationType.NOT_APPLICABLE;
  }
}
