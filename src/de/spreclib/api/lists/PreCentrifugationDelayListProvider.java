package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import java.util.ArrayList;

public final class PreCentrifugationDelayListProvider extends AbstractListProvider {

  public PreCentrifugationDelayListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PreCentrifugationDelay entry : PreCentrifugationDelay.values()) {
      IListOption option = new PreCentrifugationDelayOption(entry);
      list.add(option);
    }
    return list;
  }
}
