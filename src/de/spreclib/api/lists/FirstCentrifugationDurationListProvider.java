package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationDurationOption;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import java.util.ArrayList;

public final class FirstCentrifugationDurationListProvider extends AbstractListProvider {

  public FirstCentrifugationDurationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (FirstCentrifugationDuration entry : FirstCentrifugationDuration.values()) {
      IListOption option = new FirstCentrifugationDurationOption(entry);
      list.add(option);
    }
    return list;
  }
}
