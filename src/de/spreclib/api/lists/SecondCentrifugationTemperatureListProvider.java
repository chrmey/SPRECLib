package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationTemperatureOption;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationTemperature;
import java.util.ArrayList;

public final class SecondCentrifugationTemperatureListProvider extends AbstractListProvider {

  public SecondCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (SecondCentrifugationTemperature entry : SecondCentrifugationTemperature.values()) {
      IListOption option = new SecondCentrifugationTemperatureOption(entry);
      list.add(option);
    }
    return list;
  }
}
