package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.sprec.FluidSampleTypeOption;
import de.spreclib.model.enums.FluidSampleType;
import java.util.ArrayList;

public final class FluidSampleTypeListProvider implements IListProvider {

  ArrayList<IListOption> fluidSampleTypeList = new ArrayList<IListOption>();

  public FluidSampleTypeListProvider() {
    this.fluidSampleTypeList = generateList();
  }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (FluidSampleType entry : FluidSampleType.values()) {
      IListOption option = new FluidSampleTypeOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return this.fluidSampleTypeList;
  }
}
