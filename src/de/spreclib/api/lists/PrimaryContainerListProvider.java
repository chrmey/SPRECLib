package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import de.spreclib.api.sprec.PrimaryContainerOption;
import de.spreclib.model.enums.PrimaryContainer;
import java.util.ArrayList;

public class PrimaryContainerListProvider implements IListProvider {

  ArrayList<IListOption> primaryContainerList = new ArrayList<IListOption>();

  public PrimaryContainerListProvider() {
    this.primaryContainerList = generateList();
  }

  private ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    for (PrimaryContainer entry : PrimaryContainer.values()) {
      IListOption option = new PrimaryContainerOption(entry);
      list.add(option);
    }
    return list;
  }

  @Override
  public ArrayList<IListOption> getList() {
    return this.primaryContainerList;
  }
}
