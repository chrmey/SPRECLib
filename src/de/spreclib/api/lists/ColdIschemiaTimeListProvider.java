package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.ColdIschemiaTimeOption;
import de.spreclib.model.enums.ColdIschemiaTime;
import java.util.ArrayList;

public final class ColdIschemiaTimeListProvider extends AbstractListProvider {

  public ColdIschemiaTimeListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (ColdIschemiaTime entry : ColdIschemiaTime.values()) {
      IListOption option = new ColdIschemiaTimeOption(entry);
      list.add(option);
    }
    return list;
  }
}
