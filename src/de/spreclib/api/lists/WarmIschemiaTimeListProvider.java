package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.WarmIschemiaTimeOption;
import de.spreclib.model.enums.WarmIschemiaTime;
import java.util.ArrayList;

public final class WarmIschemiaTimeListProvider extends AbstractListProvider {

  public WarmIschemiaTimeListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (WarmIschemiaTime entry : WarmIschemiaTime.values()) {
      IListOption option = new WarmIschemiaTimeOption(entry);
      list.add(option);
    }
    return list;
  }
}
