package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.sprec.LongTermStorageOption;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorage;
import de.spreclib.model.spreclib.longtermstorage.LongTermStorageList;
import java.util.ArrayList;

public final class LongTermStorageListProvider implements IListProvider {

  private ArrayList<IListOption> longTermStorageList = new ArrayList<>();

  public LongTermStorageListProvider() {
    this.longTermStorageList = generateList();
  }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (LongTermStorage entry : LongTermStorageList.LONG_TERM_STORAGES) {
      IListOption option = new LongTermStorageOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return longTermStorageList;
  }
}
