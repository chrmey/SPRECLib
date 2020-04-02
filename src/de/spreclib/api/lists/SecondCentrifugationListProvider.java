package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationOption;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;
import java.util.ArrayList;

public final class SecondCentrifugationListProvider extends AbstractListProvider {

  public SecondCentrifugationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (Centrifugation entry : SecondCentrifugationList.CENTRIFUGATIONS) {
      IListOption option = new SecondCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }

}
