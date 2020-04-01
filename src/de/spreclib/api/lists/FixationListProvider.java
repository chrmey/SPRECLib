package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.FixationOption;
import de.spreclib.model.enums.Fixation;
import java.util.ArrayList;

public final class FixationListProvider extends AbstractListProvider {

  public FixationListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (Fixation entry : Fixation.values()) {
      IListOption option = new FixationOption(entry);
      list.add(option);
    }
    return list;
  }
}
