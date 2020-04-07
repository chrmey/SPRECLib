package de.spreclib.model.enums;

import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.interfaces.ISprecPart;
import de.spreclib.model.sprec.CodePart;

public enum WarmIschemiaTime implements ISprecPart, IListObject {
  LESS_TWO_MINUTES(0, 2, new CodePart("A")),
  TWO_TO_TEN_MINUTES(2, 10, new CodePart("B")),
  TEN_TO_TWENTY_MINUTES(10, 20, new CodePart("C")),
  TWENTY_TO_THIRTY_MINUTES(20, 30, new CodePart("D")),
  THIRTY_TO_SIXTY_MINUTES(30, 60, new CodePart("E")),
  GREATER_SIXTY_MINUTES(60, null, new CodePart("F")),
  UNKNOWN(new CodePart("X")),
  NOT_APPLICABLE(new CodePart("N")),
  OTHER(new CodePart("Z")),
  ;

  private static final SprecPartType SPREC_PART_TYPE = SprecPartType.WARM_ISCHEMIA_TIME;
  private ICodePart codePart;

  private WarmIschemiaTime(ICodePart code) {
    this.codePart = code;
  }

  private WarmIschemiaTime(Integer lowerBound, Integer upperBound, ICodePart code) {
    this.codePart = code;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return WarmIschemiaTime.SPREC_PART_TYPE;
  }
}
