package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.PostCentrifugationTemperatureOption;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import java.util.ArrayList;

public final class PostCentrifugationTemperatureListProvider extends AbstractListProvider {

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PostCentrifugationTemperature entry : PostCentrifugationTemperature.values()) {
      IListOption option = new PostCentrifugationTemperatureOption(entry);
      list.add(option);
    }
    return list;
  }
}
