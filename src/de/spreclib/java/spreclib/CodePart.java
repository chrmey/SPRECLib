package de.spreclib.java.spreclib;

import de.spreclib.java.interfaces.ICodePart;

public class CodePart implements ICodePart {

  private String code;

  public CodePart(String codePart) {
    this.code = codePart;
  }

  @Override
  public String getStringRepresentation() {
    return this.code;
  }
}
