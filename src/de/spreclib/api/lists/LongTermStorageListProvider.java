package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.LongTermStorageOption;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import java.util.ArrayList;

public final class LongTermStorageListProvider extends AbstractListProvider {

  public LongTermStorageListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (LongTermStorage entry : LongTermStorageList.LONG_TERM_STORAGES) {
      IListOption option = new LongTermStorageOption(entry);
      list.add(option);
    }
    return list;
  }
}
