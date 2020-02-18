package de.spreclib.java.spreclib;

import de.spreclib.java.interfaces.ICodePart;

public class CodePart implements ICodePart {

  private String code;

  public CodePart(String codePart) {
    this.code = codePart;
  }

  @Override
  public ICodePart getCodePart() {
    return this;
  }

  public String getStringRepresentation() {
    return this.code;
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
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    CodePart other = (CodePart) obj;
    if (code == null) {
      if (other.code != null) return false;
    } else if (!code.equals(other.code)) return false;
    return true;
  }
}
