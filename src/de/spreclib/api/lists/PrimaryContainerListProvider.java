package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.PrimaryContainerOption;
import de.spreclib.model.enums.PrimaryContainer;
import java.util.ArrayList;

public final class PrimaryContainerListProvider extends AbstractListProvider {

  public PrimaryContainerListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (PrimaryContainer entry : PrimaryContainer.values()) {
      IListOption option = new PrimaryContainerOption(entry);
      list.add(option);
    }
    return list;
  }
}
