package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FixationTimeOption;
import de.spreclib.model.enums.FixationTime;
import java.util.ArrayList;

public final class FixationTimeListProvider extends AbstractListProvider {

  public FixationTimeListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (FixationTime entry : FixationTime.values()) {
      IListOption option = new FixationTimeOption(entry);
      list.add(option);
    }
    return list;
  }
}
