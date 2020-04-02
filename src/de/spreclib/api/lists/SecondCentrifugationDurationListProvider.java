package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationDurationOption;
import de.spreclib.model.enums.centrifugation.SecondCentrifugationDuration;
import java.util.ArrayList;

public final class SecondCentrifugationDurationListProvider extends AbstractListProvider {

  public SecondCentrifugationDurationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (SecondCentrifugationDuration entry : SecondCentrifugationDuration.values()) {
      IListOption option = new SecondCentrifugationDurationOption(entry);
      list.add(option);
    }
    return list;
  }
}
