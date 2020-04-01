package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.PreCentrifugationOption;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;
import java.util.ArrayList;

public final class PreCentrifugationListProvider extends AbstractListProvider {

  public PreCentrifugationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PreCentrifugation entry : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      IListOption option = new PreCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }
}
