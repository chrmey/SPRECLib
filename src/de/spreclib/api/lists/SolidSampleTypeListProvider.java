package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SolidSampleTypeOption;
import de.spreclib.model.enums.SolidSampleType;
import java.util.ArrayList;

public final class SolidSampleTypeListProvider extends AbstractListProvider {

  public SolidSampleTypeListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (SolidSampleType entry : SolidSampleType.values()) {
      IListOption option = new SolidSampleTypeOption(entry);
      list.add(option);
    }
    return list;
  }
}
