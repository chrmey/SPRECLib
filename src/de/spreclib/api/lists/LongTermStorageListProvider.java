package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
import de.spreclib.api.lists.options.LongTermStorageContainerOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.api.lists.options.LongTermStorageTemperatureOption;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import java.util.ArrayList;

public final class LongTermStorageListProvider {

  private static final ArrayList<LongTermStorageOption> LONG_TERM_STORAGE_OPTIONS;

  static {
    LONG_TERM_STORAGE_OPTIONS = new ArrayList<>();
    for (LongTermStorage longTermStorage : LongTermStorageList.LONG_TERM_STORAGES) {
      LongTermStorageOption longTermStorageOption = new LongTermStorageOption(longTermStorage);
      LONG_TERM_STORAGE_OPTIONS.add(longTermStorageOption);
    }
  }

  public static ArrayList<LongTermStorageOption> getList() {
    return LONG_TERM_STORAGE_OPTIONS;
  }

  public static LongTermStorageOption valueOf(
      LongTermStorageTemperatureOption longTermStorageTemperatureOption,
      LongTermStorageContainerOption longTermStorageContainerOption) {

    if (longTermStorageTemperatureOption == null) {
      throw new IllegalArgumentException("LongTermStorageTemperatureOption cannot not be null.");
    }

    if (longTermStorageContainerOption == null) {
      throw new IllegalArgumentException("LongTermStorageContainerOption cannot not be null.");
    }

    for (LongTermStorageOption longTermStorageOption : LONG_TERM_STORAGE_OPTIONS) {

      if (longTermStorageOption.hasLongTermStorage(
          longTermStorageTemperatureOption, longTermStorageContainerOption)) {

        return longTermStorageOption;
      }
    }

    throw new InvalidParameterCombinationException(
        "Parameter combination for LongTermStorage is no valid combination.");
  }
}
