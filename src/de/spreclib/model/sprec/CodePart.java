package de.spreclib.model.sprec;

import de.spreclib.model.interfaces.ICodePart;

public final class CodePart implements ICodePart {

  private final String code;

  public CodePart(String codePart) {

    validate(codePart);

    this.code = codePart;
  }

  @Override
  public String getStringRepresentation() {
    return this.code;
  }

  private void validate(String codePart) {

    if (codePart.length() != 1 && codePart.length() != 3) {
      throw new IllegalArgumentException("CodePart can only be 1 or 3 characters long");
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((code == null) ? 0 : code.hashCode());
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
    CodePart other = (CodePart) obj;
    if (code == null) {
      if (other.code != null) {
        return false;
      }
    } else if (!code.equals(other.code)) {
      return false;
    }
    return true;
  }
}
