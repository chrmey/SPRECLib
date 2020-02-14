package de.spreclib.enums;

import de.spreclib.interfaces.ICodePart;
import de.spreclib.interfaces.ISprecPart;

public enum FirstCentrifugation implements ICodePart, ISprecPart {
  RT_TEN_TO_FIFTEEN_MINUTES_LESS_THREETHOUSAND_G_NO_BREAKING("A"),
  RT_TEN_TO_FIFTEEN_MINUTES_LESS_THREETHOUSAND_G_WITH_BREAKING("B"),
  TWO_TO_TEN_DEGREES_TEN_TO_FIFTEEN_MINUTES_LESS_THREETHOUSAND_G_NO_BREAKING("C"),
  TWO_TO_TEN_DEGREES_TEN_TO_FIFTEEN_MINUTES_LESS_THREETHOUSAND_G_WITH_BREAKING("D"),
  RT_TEN_TO_FIFTEEN_MINUTES_THREETHOUSAND_TO_SIXTHOUSAND_G_WITH_BREAKING("E"),
  TWO_TO_TEN_DEGREES_TEN_TO_FIFTEEN_MINUTES_THREETHOUSAND_TO_SIXTHOUSAND_G_WITH_BREAKING("F"),
  ;

  private FirstCentrifugation(String code) {}

  public String getCodePart() {
    // TODO implement here
    return null;
  }

  public ISprecPart getSprecPart() {
    // TODO implement here
    return null;
  }
}
