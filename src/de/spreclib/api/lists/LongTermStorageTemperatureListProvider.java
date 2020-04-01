package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.LongTermStorageTemperatureOption;
import de.spreclib.model.enums.longtermstorage.LongTermStorageTemperature;
import java.util.ArrayList;

public final class LongTermStorageTemperatureListProvider extends AbstractListProvider {

  public LongTermStorageTemperatureListProvider() {
    super();
  }

  @Override
  public ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (LongTermStorageTemperature entry : LongTermStorageTemperature.values()) {
      IListOption option = new LongTermStorageTemperatureOption(entry);
      list.add(option);
    }
    return list;
  }
}
