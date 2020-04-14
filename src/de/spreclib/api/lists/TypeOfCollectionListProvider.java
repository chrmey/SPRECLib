package de.spreclib.api.lists;

import de.spreclib.api.lists.options.TypeOfCollectionOption;
import de.spreclib.model.enums.TypeOfCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for TypeOfCollectionOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.TypeOfCollectionOption
 */
public final class TypeOfCollectionListProvider {

  private final List<TypeOfCollectionOption> typeOfCollectionOptions;

  public TypeOfCollectionListProvider() {
    this.typeOfCollectionOptions = generateList();
  }

  private List<TypeOfCollectionOption> generateList() {
    List<TypeOfCollectionOption> typeOfCollectionOptions = new ArrayList<>();
    for (TypeOfCollection typeOfCollection : TypeOfCollection.values()) {
      TypeOfCollectionOption typeOfCollectionoption = new TypeOfCollectionOption(typeOfCollection);
      typeOfCollectionOptions.add(typeOfCollectionoption);
    }
    return typeOfCollectionOptions;
  }

  public List<TypeOfCollectionOption> getList() {
    return this.typeOfCollectionOptions;
  }
}
