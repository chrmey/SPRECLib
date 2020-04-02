package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.LongTermStorageContainerOption;
import de.spreclib.model.enums.longtermstorage.LongTermStorageContainer;
import java.util.ArrayList;

public final class LongTermStorageContainerListProvider extends AbstractListProvider {

  public LongTermStorageContainerListProvider() {
    super();
  }

  @Override
  public ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (LongTermStorageContainer entry : LongTermStorageContainer.values()) {
      IListOption option = new LongTermStorageContainerOption(entry);
      list.add(option);
    }
    return list;
  }
}
