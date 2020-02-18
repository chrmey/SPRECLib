package de.spreclib.java.spreclib.precentrifugation;

import java.util.HashSet;
import java.util.Set;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationDelay;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationTemperature;
import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.interfaces.IPreCentrifugation;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.CodePart;

public class PreCentrifugation implements IPreCentrifugation, ISprecPart {

  private static final Set<IPreCentrifugation> preCentrifugations;

  private PreCentrifugationType preCentrifugationType;
  private PreCentrifugationDelay preCentrifugationDelay;
  private PreCentrifugationTemperature preCentrifugationTemperature;

  private ICodePart codePart;

  static {
    preCentrifugations = new HashSet<>();
    preCentrifugations.add(new UnknownPreCentrifugation(new CodePart("X")));
    preCentrifugations.add(new OtherPreCentrifugation(new CodePart("Z")));
    preCentrifugations.add(
        new PreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("A")));
    preCentrifugations.add(
        new PreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.LESS_TWO_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("B")));
    preCentrifugations.add(
        new PreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("C")));
    preCentrifugations.add(
        new PreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.TWO_TO_FOUR_HOURS,
            PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("D")));
    preCentrifugations.add(
        new PreCentrifugation(
            PreCentrifugationType.DEFAULT,
            PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
            PreCentrifugationTemperature.ROOM_TEMPERATURE,
            new CodePart("E")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.FOUR_TO_EIGHT_HOURS,
                PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("F")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
                PreCentrifugationTemperature.ROOM_TEMPERATURE,
                new CodePart("G")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.EIGHT_TO_TWELVE_HOURS,
                PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("H")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
                PreCentrifugationTemperature.ROOM_TEMPERATURE,
                new CodePart("I")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.TWELVE_TO_TWENTYFOUR_HOURS,
                PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("J")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
                PreCentrifugationTemperature.ROOM_TEMPERATURE,
                new CodePart("K")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.TWENTYFOUR_TO_EIGHTYFOUR_HOURS,
                PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("L")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
                PreCentrifugationTemperature.ROOM_TEMPERATURE,
                new CodePart("M")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.GREATER_EIGHTYFOUR_HOURS,
                PreCentrifugationTemperature.TWO_TO_TEN_DEGREES,
                new CodePart("N")));
    preCentrifugations.add(
            new PreCentrifugation(
                PreCentrifugationType.DEFAULT,
                PreCentrifugationDelay.LESS_TWO_HOURS,
                PreCentrifugationTemperature.THIRTYFIVE_TO_THIRTYEIGHT_DEGREES,
                new CodePart("O")));
  }

  public PreCentrifugation(ICodePart codePart) {
    this.codePart = codePart;
  }

  public PreCentrifugation(
      PreCentrifugationType preCentrifugationType,
      PreCentrifugationDelay preCentrifugationDelay,
      PreCentrifugationTemperature preCentrifugationTemperature,
      ICodePart codePart) {
    this.preCentrifugationType = preCentrifugationType;
    this.preCentrifugationDelay = preCentrifugationDelay;
    this.preCentrifugationTemperature = preCentrifugationTemperature;
    this.codePart = codePart;
  }

  @Override
  public ISprecPart getSprecPart() {
    return this;
  }

  @Override
  public ICodePart getCodeFromSprecPart() {
    return this.codePart;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.PRE_CENTRIFUGATION;
  }

  @Override
  public PreCentrifugationType getPreCentrifugationType() {
    return this.preCentrifugationType;
  }

  @Override
  public PreCentrifugationDelay getPreCentrifugationDelay() {
    return this.preCentrifugationDelay;
  }

  @Override
  public PreCentrifugationTemperature getPreCentrifugationTemperature() {
    return this.preCentrifugationTemperature;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    result =
        prime * result + ((preCentrifugationDelay == null) ? 0 : preCentrifugationDelay.hashCode());
    result =
        prime * result
            + ((preCentrifugationTemperature == null)
                ? 0
                : preCentrifugationTemperature.hashCode());
    result =
        prime * result + ((preCentrifugationType == null) ? 0 : preCentrifugationType.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    PreCentrifugation other = (PreCentrifugation) obj;
    if (codePart == null) {
      if (other.codePart != null) return false;
    } else if (!codePart.equals(other.codePart)) return false;
    if (preCentrifugationDelay != other.preCentrifugationDelay) return false;
    if (preCentrifugationTemperature != other.preCentrifugationTemperature) return false;
    if (preCentrifugationType != other.preCentrifugationType) return false;
    return true;
  }
}
