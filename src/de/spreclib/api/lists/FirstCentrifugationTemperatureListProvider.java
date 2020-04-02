package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationTemperatureOption;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import java.util.ArrayList;

public final class FirstCentrifugationTemperatureListProvider extends AbstractListProvider {

  public FirstCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (FirstCentrifugationTemperature entry : FirstCentrifugationTemperature.values()) {
      IListOption option = new FirstCentrifugationTemperatureOption(entry);
      list.add(option);
    }
    return list;
  }
}
