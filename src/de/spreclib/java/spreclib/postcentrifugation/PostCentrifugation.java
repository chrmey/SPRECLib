package de.spreclib.java.spreclib.postcentrifugation;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.ISprecPart;

public abstract class PostCentrifugation implements ISprecPart {

  private final SprecPartType sprecPartType = SprecPartType.POST_CENTRIFUGATION;
  private PostCentrifugationType postCentrifugationType;
  private ICodePart codePart;

  public PostCentrifugation(PostCentrifugationType postCentrifugationType, ICodePart codePart) {
    this.postCentrifugationType = postCentrifugationType;
    this.codePart = codePart;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return this.sprecPartType;
  }

  public PostCentrifugationType getPostCentrifugationType() {
    return this.postCentrifugationType;
  }
}
