package de.spreclib.api.main;

import de.spreclib.model.longtermstorage.enums.LongTermStorageContainer;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for LongTermStorageContainerOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.LongTermStorageContainerOption
 */
public final class LongTermStorageContainerListProvider
    extends AbstractListProvider<LongTermStorageContainerOption> {

  public LongTermStorageContainerListProvider() {
    super();
  }

  @Override
  List<LongTermStorageContainerOption> generateList() {
    List<LongTermStorageContainerOption> longTermStorageContainerOptions = new ArrayList<>();
    for (LongTermStorageContainer longTermStorageContainer : LongTermStorageContainer.values()) {
      LongTermStorageContainerOption longTermStorageContainerOption =
          new LongTermStorageContainerOption(longTermStorageContainer);
      longTermStorageContainerOptions.add(longTermStorageContainerOption);
    }
    return longTermStorageContainerOptions;
  }
}
