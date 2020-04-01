package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.FirstCentrifugationOption;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.FirstCentrifugationList;
import java.util.ArrayList;

public final class FirstCentrifugationListProvider extends AbstractListProvider {

  public FirstCentrifugationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (Centrifugation entry : FirstCentrifugationList.CENTRIFUGATIONS) {
      IListOption option = new FirstCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }
}
