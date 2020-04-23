package de.spreclib.api.lists;

import de.spreclib.api.exceptions.UndefinedValueCombinationException;
import de.spreclib.model.longtermstorage.LongTermStorage;
import de.spreclib.model.longtermstorage.LongTermStorageList;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for LongTermStorageOptions.
 *
 * <p>Use the valueOf() method to receive a ListOption if a ListOption for the value can be found.
 *
 * @author Christopher Meyer
 */
public final class LongTermStorageListProvider extends AbstractListProvider<LongTermStorageOption> {

  public LongTermStorageListProvider() {
    super();
  }

  @Override
  protected List<LongTermStorageOption> generateList() {
    List<LongTermStorageOption> longTermStorageOptions = new ArrayList<>();
    for (LongTermStorage longTermStorage : LongTermStorageList.LONG_TERM_STORAGES) {
      LongTermStorageOption longTermStorageOption = new LongTermStorageOption(longTermStorage);
      longTermStorageOptions.add(longTermStorageOption);
    }
    return longTermStorageOptions;
  }

  /**
   * Takes all parameters for LongTermStorage and returns an option if a LongTermStorage with that
   * combination is found.
   *
   * @param longTermStorageTemperatureOption LongTermStorageTemperatureOption
   * @param longTermStorageContainerOption LongTermStorageContainerOption
   * @return LongTermStorageOption
   * @throws UndefinedValueCombinationException if value combination cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public LongTermStorageOption valueOf(
      LongTermStorageTemperatureOption longTermStorageTemperatureOption,
      LongTermStorageContainerOption longTermStorageContainerOption)
      throws UndefinedValueCombinationException {

    if (longTermStorageTemperatureOption == null) {
      throw new IllegalArgumentException("LongTermStorageTemperatureOption cannot not be null.");
    }

    if (longTermStorageContainerOption == null) {
      throw new IllegalArgumentException("LongTermStorageContainerOption cannot not be null.");
    }

    for (LongTermStorageOption longTermStorageOption : this.listOptions) {

      if (longTermStorageOption.hasLongTermStorage(
          longTermStorageContainerOption, longTermStorageTemperatureOption)) {

        return longTermStorageOption;
      }
    }

    throw new UndefinedValueCombinationException(
        "Value combination for LongTermStorage is undefined in SPREC.");
  }
}
