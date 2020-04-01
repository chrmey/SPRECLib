package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.SecondCentrifugationBrakingOption;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import java.util.ArrayList;

public final class SecondCentrifugationBrakingListProvider extends AbstractListProvider {

  public SecondCentrifugationBrakingListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (CentrifugationBraking entry : CentrifugationBraking.values()) {
      IListOption option = new SecondCentrifugationBrakingOption(entry);
      list.add(option);
    }
    return list;
  }
}
