package de.spreclib.api.sprec;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.postcentrifugation.PostCentrifugation;

public final class PostCentrifugationOption implements IListOption {

  private PostCentrifugation postCentrifugation;

  public PostCentrifugationOption(PostCentrifugation postCentrifugation) {
    this.postCentrifugation = postCentrifugation;
  }

  @Override
  public String getStringRepresentation() {
    // TODO Implement
    return null;
  }
}
