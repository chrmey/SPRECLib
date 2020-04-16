package de.spreclib.api.lists;

import de.spreclib.api.exceptions.InvalidParameterCombinationException;
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
   * combination is found. Returns null otherwise.
   *
   * @param longTermStorageTemperatureOption LongTermStorageTemperatureOption
   * @param longTermStorageContainerOption LongTermStorageContainerOption
   * @return LongTermStorageOption
   * @throws InvalidParameterCombinationException if parameter cannot be found in ListOptions
   * @throws IllegalArgumentException if parameter is null
   */
  public LongTermStorageOption valueOf(
      LongTermStorageTemperatureOption longTermStorageTemperatureOption,
      LongTermStorageContainerOption longTermStorageContainerOption) {

    if (longTermStorageTemperatureOption == null) {
      throw new IllegalArgumentException("LongTermStorageTemperatureOption cannot not be null.");
    }

    if (longTermStorageContainerOption == null) {
      throw new IllegalArgumentException("LongTermStorageContainerOption cannot not be null.");
    }

    for (LongTermStorageOption longTermStorageOption : this.listOptions) {

      if (longTermStorageOption.hasLongTermStorage(
          longTermStorageTemperatureOption, longTermStorageContainerOption)) {

        return longTermStorageOption;
      }
    }

    throw new InvalidParameterCombinationException(
        "Parameter combination for LongTermStorage is no valid combination.");
  }
}
