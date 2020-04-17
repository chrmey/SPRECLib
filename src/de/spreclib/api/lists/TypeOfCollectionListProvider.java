package de.spreclib.api.lists;

import de.spreclib.model.enums.TypeOfCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for TypeOfCollectionOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.TypeOfCollectionOption
 */
public final class TypeOfCollectionListProvider
    extends AbstractListProvider<TypeOfCollectionOption> {

  public TypeOfCollectionListProvider() {
    super();
  }

  @Override
  protected List<TypeOfCollectionOption> generateList() {
    List<TypeOfCollectionOption> typeOfCollectionOptions = new ArrayList<>();
    for (TypeOfCollection typeOfCollection : TypeOfCollection.values()) {
      TypeOfCollectionOption typeOfCollectionoption = new TypeOfCollectionOption(typeOfCollection);
      typeOfCollectionOptions.add(typeOfCollectionoption);
    }
    return typeOfCollectionOptions;
  }
}
