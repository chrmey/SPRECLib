package de.spreclib.model.postcentrifugation;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListProvideable;
import de.spreclib.model.interfaces.ISprecFactor;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationType;

public class PostCentrifugation implements ISprecFactor, IListProvideable {

  private final PostCentrifugationType postCentrifugationType;
  private final ICodePart codePart;

  PostCentrifugation(PostCentrifugationType postCentrifugationType, ICodePart codePart) {
    this.postCentrifugationType = postCentrifugationType;
    this.codePart = codePart;
  }

  public boolean isDefaultPostCentrifugation() {
    return false;
  }

  @Override
  public ICodePart getCodeFromSprecFactor() {
    return this.codePart;
  }

  public PostCentrifugationType getPostCentrifugationType() {
    return this.postCentrifugationType;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    result =
        prime * result + ((postCentrifugationType == null) ? 0 : postCentrifugationType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    PostCentrifugation other = (PostCentrifugation) obj;
    if (codePart == null) {
      if (other.codePart != null) {
        return false;
      }
    } else if (!codePart.equals(other.codePart)) {
      return false;
    }
    if (postCentrifugationType != other.postCentrifugationType) {
      return false;
    }
    return true;
  }
}
