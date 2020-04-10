package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;

public abstract class AbstractListProvider implements IListProvider {

  protected ArrayList<IListOption> optionList = new ArrayList<>();

  public AbstractListProvider() {
    this.optionList = generateList();
  }

  protected abstract ArrayList<IListOption> generateList();

  @Override
  public ArrayList<IListOption> getList() {
    return this.optionList;
  }
}
