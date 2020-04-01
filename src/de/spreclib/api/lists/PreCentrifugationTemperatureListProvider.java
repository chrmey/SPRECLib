package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.PreCentrifugationTemperatureOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationTemperature;
import java.util.ArrayList;

public final class PreCentrifugationTemperatureListProvider extends AbstractListProvider {

  public PreCentrifugationTemperatureListProvider() {
    super();
  }

  @Override
  public ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PreCentrifugationTemperature entry : PreCentrifugationTemperature.values()) {
      IListOption option = new PreCentrifugationTemperatureOption(entry);
      list.add(option);
    }
    return list;
  }
}
