package de.spreclib.api.lists;

import de.spreclib.api.lists.options.TypeOfCollectionOption;
import de.spreclib.model.enums.TypeOfCollection;
import java.util.ArrayList;

/**
 * ListProvider for TypeOfCollectionOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.TypeOfCollectionOption
 */
public final class TypeOfCollectionListProvider {

  private static final ArrayList<TypeOfCollectionOption> TYPE_OF_COLLECTION_OPTIONS;

  static {
    TYPE_OF_COLLECTION_OPTIONS = new ArrayList<>();
    for (TypeOfCollection typeOfCollection : TypeOfCollection.values()) {
      TypeOfCollectionOption typeOfCollectionoption = new TypeOfCollectionOption(typeOfCollection);
      TYPE_OF_COLLECTION_OPTIONS.add(typeOfCollectionoption);
    }
  }

  public static ArrayList<TypeOfCollectionOption> getList() {
    return TYPE_OF_COLLECTION_OPTIONS;
  }
}
