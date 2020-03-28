package de.spreclib.api.lists;

import java.util.ArrayList;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.sprec.FirstCentrifugationOption;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.FirstCentrifugationList;

public final class FirstCentrifugationListProvider implements IListProvider {

   private ArrayList<IListOption> firstCentrifugationList = new ArrayList<>();
   
   public FirstCentrifugationListProvider() {
       this.firstCentrifugationList = generateList();
   }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (Centrifugation entry : FirstCentrifugationList.CENTRIFUGATIONS) {
      IListOption option = new FirstCentrifugationOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return firstCentrifugationList;
  }
}
