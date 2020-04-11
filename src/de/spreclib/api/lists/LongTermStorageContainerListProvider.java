package de.spreclib.api.lists;

import de.spreclib.api.lists.options.LongTermStorageContainerOption;
import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import java.util.ArrayList;

public final class LongTermStorageContainerListProvider {

  private static final ArrayList<LongTermStorageContainerOption>
      LONG_TERM_STORAGE_CONTAINER_OPTIONS;

  static {
    LONG_TERM_STORAGE_CONTAINER_OPTIONS = new ArrayList<>();
    for (LongTermStorageContainer longTermStorageContainer : LongTermStorageContainer.values()) {
      LongTermStorageContainerOption longTermStorageContainerOption =
          new LongTermStorageContainerOption(longTermStorageContainer);
      LONG_TERM_STORAGE_CONTAINER_OPTIONS.add(longTermStorageContainerOption);
    }
  }

  public static ArrayList<LongTermStorageContainerOption> getList() {
      return LONG_TERM_STORAGE_CONTAINER_OPTIONS;
  }
  
}
