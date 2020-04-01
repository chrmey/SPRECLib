package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.FirstCentrifugationSpeedOption;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import java.util.ArrayList;

public final class FirstCentrifugationSpeedListProvider extends AbstractListProvider {

  public FirstCentrifugationSpeedListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (FirstCentrifugationSpeed entry : FirstCentrifugationSpeed.values()) {
      IListOption option = new FirstCentrifugationSpeedOption(entry);
      list.add(option);
    }
    return list;
  }
}
