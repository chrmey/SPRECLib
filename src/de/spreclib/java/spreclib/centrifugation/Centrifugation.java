package de.spreclib.java.spreclib.centrifugation;

import java.util.HashSet;
import java.util.Set;

import de.spreclib.java.enums.centrifugation.CentrifugationBraking;
import de.spreclib.java.enums.centrifugation.CentrifugationDuration;
import de.spreclib.java.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.java.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.java.enums.centrifugation.CentrifugationType;
import de.spreclib.java.interfaces.ICentrifugation;
import de.spreclib.java.interfaces.ICodePart;
import de.spreclib.java.spreclib.CodePart;

public class Centrifugation implements ICentrifugation {

  protected static final Set<ICentrifugation> centrifugations;

  private CentrifugationType centrifugationType;
  private CentrifugationDuration centrifugationDuration;
  private CentrifugationSpeed centrifugationSpeed;
  private CentrifugationTemperature centrifugationTemperature;
  private CentrifugationBraking centrifugationBraking;
  protected ICodePart codePart;

  static {
    centrifugations = new HashSet<>();
    centrifugations.add(new NoCentrifugation(new CodePart("N")));
    centrifugations.add(new UnknownCentrifugation(new CodePart("X")));
    centrifugations.add(new OtherCentrifugation(new CodePart("Z")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("B")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I")));
    centrifugations.add(
        new Centrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J")));
  }

  protected Centrifugation(ICodePart codePart) {
    this.codePart = codePart;
  }

  public Centrifugation(
      CentrifugationType centrifugationType,
      CentrifugationDuration centrifugationDuration,
      CentrifugationSpeed centrifugationSpeed,
      CentrifugationTemperature centrifugationTemperature,
      CentrifugationBraking centrifugationBraking,
      ICodePart codePart) {
    this.centrifugationType = centrifugationType;
    this.centrifugationDuration = centrifugationDuration;
    this.centrifugationSpeed = centrifugationSpeed;
    this.centrifugationTemperature = centrifugationTemperature;
    this.centrifugationBraking = centrifugationBraking;
    this.codePart = codePart;
  }

  @Override
  public CentrifugationType getCentrifugationType() {
    return this.centrifugationType;
  }

  @Override
  public CentrifugationSpeed getCentrifugationSpeed() {
    return this.centrifugationSpeed;
  }

  @Override
  public CentrifugationTemperature getCentrifugationTemperature() {
    return this.centrifugationTemperature;
  }

  @Override
  public CentrifugationDuration getCentrifugationDuration() {
    return this.centrifugationDuration;
  }

  @Override
  public CentrifugationBraking getCentrifugationBraking() {
    return this.centrifugationBraking;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result =
        prime * result + ((centrifugationBraking == null) ? 0 : centrifugationBraking.hashCode());
    result =
        prime * result + ((centrifugationDuration == null) ? 0 : centrifugationDuration.hashCode());
    result = prime * result + ((centrifugationSpeed == null) ? 0 : centrifugationSpeed.hashCode());
    result =
        prime * result
            + ((centrifugationTemperature == null) ? 0 : centrifugationTemperature.hashCode());
    result = prime * result + ((centrifugationType == null) ? 0 : centrifugationType.hashCode());
    result = prime * result + ((codePart == null) ? 0 : codePart.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Centrifugation other = (Centrifugation) obj;
    if (centrifugationBraking != other.centrifugationBraking) return false;
    if (centrifugationDuration != other.centrifugationDuration) return false;
    if (centrifugationSpeed != other.centrifugationSpeed) return false;
    if (centrifugationTemperature != other.centrifugationTemperature) return false;
    if (centrifugationType != other.centrifugationType) return false;
    if (codePart == null) {
      if (other.codePart != null) return false;
    } else if (!codePart.equals(other.codePart)) return false;
    return true;
  }
}
