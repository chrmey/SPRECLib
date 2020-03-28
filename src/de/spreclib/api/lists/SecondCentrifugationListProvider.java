package de.spreclib.api.lists;

import java.util.ArrayList;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.sprec.SecondCentrifugationOption;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;

public final class SecondCentrifugationListProvider implements IListProvider {

  private ArrayList<IListOption> secondCentrifugationList = new ArrayList<>();

  public SecondCentrifugationListProvider() {
    this.secondCentrifugationList = generateList();
  }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (Centrifugation entry : SecondCentrifugationList.CENTRIFUGATIONS) {
      IListOption option = new SecondCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return secondCentrifugationList;
  }
}
