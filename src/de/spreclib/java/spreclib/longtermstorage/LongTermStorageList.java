package de.spreclib.java.spreclib.longtermstorage;

import java.util.HashSet;
import java.util.Set;

import de.spreclib.java.enums.longtermstorage.LongTermStorageContainer;
import de.spreclib.java.enums.longtermstorage.LongTermStorageTemperature;
import de.spreclib.java.enums.longtermstorage.LongTermStorageType;
import de.spreclib.java.spreclib.CodePart;

public class LongTermStorageList {

  private static final Set<LongTermStorage> longTermStorages;

  static {
    longTermStorages = new HashSet<>();
    longTermStorages.add(
        new SpecialLongTermStorage(LongTermStorageType.UNKNOWN, new CodePart("X")));
    longTermStorages.add(new SpecialLongTermStorage(LongTermStorageType.OTHER, new CodePart("Z")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("A")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("B")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("V")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("C")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("D")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.PROGRAMMBLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("E")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PLASTIC_CRYOSTRAW,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("F")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("G")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("H")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.PROGRAMMBLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("G")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_GREATER_FIVE_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("J")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_GREATER_FIVE_ML,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("K")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.MICROPLATE,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("L")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.MICROPLATE,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("M")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature
                .LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("N")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature
                .LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("O")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PARAFFIN_BLOCK,
            LongTermStorageTemperature.ROOM_TEMPERATURE,
            new CodePart("P")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PARAFFIN_BLOCK,
            LongTermStorageTemperature.TWO_TO_TEN_DEGRESS,
            new CodePart("P")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.BAG,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("Q")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.DRY_TECHNOLOGY_MEDIUM,
            LongTermStorageTemperature.ROOM_TEMPERATURE,
            new CodePart("R")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("S")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("T")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("W")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.ORIGINAL_PRIMARY_CONTAINER,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("Y")));
    longTermStorages.add(
        new NormalLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.ORIGINAL_PRIMARY_CONTAINER,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("Y")));
  }
}
