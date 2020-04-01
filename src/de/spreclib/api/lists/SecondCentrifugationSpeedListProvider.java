package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.SecondCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationSpeed;
import java.util.ArrayList;

public final class SecondCentrifugationSpeedListProvider extends AbstractListProvider {

  public SecondCentrifugationSpeedListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (SecondCentrifugationSpeed entry : SecondCentrifugationSpeed.values()) {
      IListOption option = new SecondCentrifugationSpeedOption(entry);
      list.add(option);
    }
    return list;
  }
}
