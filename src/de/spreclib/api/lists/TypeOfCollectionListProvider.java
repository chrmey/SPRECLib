package de.spreclib.api.lists;


import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.sprec.TypeOfCollectionOption;
import de.spreclib.model.enums.TypeOfCollection;
import java.util.ArrayList;

public final class TypeOfCollectionListProvider extends AbstractListProvider {

  public TypeOfCollectionListProvider() {
    super();
  }

  @Override
  protected ArrayList<IListOption> generateList() {
    ArrayList<IListOption> list = new ArrayList<>();
    for (TypeOfCollection entry : TypeOfCollection.values()) {
      IListOption option = new TypeOfCollectionOption(entry);
      list.add(option);
    }
    return list;
  }
}
