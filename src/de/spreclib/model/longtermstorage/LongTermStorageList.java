package de.spreclib.model.longtermstorage;

import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;
import de.spreclib.model.longtermstorage.enums.LongTermStorageTemperature;
import de.spreclib.model.longtermstorage.enums.LongTermStorageType;
import de.spreclib.model.sprec.CodePart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LongTermStorageList {

  public static final List<LongTermStorage> LONG_TERM_STORAGES;

  static {
    List<LongTermStorage> modifiableLongTermStorages = new ArrayList<>();
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("A")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("B")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_ZEROFIVE_TO_TWO_ML,
            LongTermStorageTemperature.LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("V")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("C")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("D")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature.PROGRAMMABLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("E")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PLASTIC_CRYOSTRAW,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("F")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("G")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("H")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature.PROGRAMMABLE_FREEZING_TO_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("G")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_GREATER_FIVE_ML,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("J")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_GREATER_FIVE_ML,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("K")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.MICROPLATE,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("L")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.MICROPLATE,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("M")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.CRYOTUBE_ONE_TO_TWO_ML,
            LongTermStorageTemperature
                .LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("N")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.STRAW,
            LongTermStorageTemperature
                .LIQUID_NITROGEN_AFTER_MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("O")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PARAFFIN_BLOCK,
            LongTermStorageTemperature.ROOM_TEMPERATURE,
            new CodePart("P")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PARAFFIN_BLOCK,
            LongTermStorageTemperature.TWO_TO_TEN_DEGREES,
            new CodePart("P")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.BAG,
            LongTermStorageTemperature.LIQUID_NITROGEN,
            new CodePart("Q")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.DRY_TECHNOLOGY_MEDIUM,
            LongTermStorageTemperature.ROOM_TEMPERATURE,
            new CodePart("R")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("S")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("T")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.PP_TUBE_FOURTY_TO_FIFEHUNDRED_MICROL,
            LongTermStorageTemperature.LESS_MINUS_HUNDREDTHIRTYFIVE_DEGREES,
            new CodePart("W")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.ORIGINAL_PRIMARY_CONTAINER,
            LongTermStorageTemperature.MINUS_EIGHTYFIVE_TO_MINUS_SIXTY_DEGREES,
            new CodePart("Y")));
    modifiableLongTermStorages.add(
        new ParameterizedLongTermStorage(
            LongTermStorageType.DEFAULT,
            LongTermStorageContainer.ORIGINAL_PRIMARY_CONTAINER,
            LongTermStorageTemperature.MINUS_THIRTYFIVE_TO_MINUS_EIGHTEEN_DEGREES,
            new CodePart("Y")));
    modifiableLongTermStorages.add(
        new LongTermStorage(LongTermStorageType.UNKNOWN, new CodePart("X")));
    modifiableLongTermStorages.add(
        new LongTermStorage(LongTermStorageType.OTHER, new CodePart("Z")));

    LONG_TERM_STORAGES = Collections.unmodifiableList(modifiableLongTermStorages);
  }

  public static LongTermStorage getUnknownLongTermStorage() {
    for (LongTermStorage longTermStorage : LONG_TERM_STORAGES) {
      if (longTermStorage.getLongTermStorageType() == LongTermStorageType.UNKNOWN) {
        return longTermStorage;
      }
    }
    return null;
  }

  public static LongTermStorage getOtherLongTermStorage() {
    for (LongTermStorage longTermStorage : LONG_TERM_STORAGES) {
      if (longTermStorage.getLongTermStorageType() == LongTermStorageType.OTHER) {
        return longTermStorage;
      }
    }
    return null;
  }
}
