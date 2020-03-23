package de.spreclib.api.lists.precentrifugation;

import java.util.ArrayList;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;

public final class PreCentrifugationListProvider implements IListProvider {

  private ArrayList<IListOption> preCentrifugationList = new ArrayList<>();

  public PreCentrifugationListProvider() {
    this.preCentrifugationList = generateList();
  }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (PreCentrifugation entry : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      IListOption option = new PreCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return preCentrifugationList;
  }
}
