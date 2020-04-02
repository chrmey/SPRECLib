package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FluidSampleTypeOption;
import de.spreclib.model.enums.FluidSampleType;
import java.util.ArrayList;

public final class FluidSampleTypeListProvider extends AbstractListProvider {

  public FluidSampleTypeListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (FluidSampleType entry : FluidSampleType.values()) {
      IListOption option = new FluidSampleTypeOption(entry);
      list.add(option);
    }
    return list;
  }
}
