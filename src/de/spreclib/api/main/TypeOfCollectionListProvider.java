package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.model.typeofcollection.TypeOfCollection;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for TypeOfCollectionOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.TypeOfCollectionOption
 */
public final class TypeOfCollectionListProvider extends AbstractListProvider<TypeOfCollectionOption>
    implements IFactorListProvider<TypeOfCollectionOption> {

  public TypeOfCollectionListProvider() {
    super();
  }

  @Override
  List<TypeOfCollectionOption> generateList() {
    List<TypeOfCollectionOption> typeOfCollectionOptions = new ArrayList<>();
    for (TypeOfCollection typeOfCollection : TypeOfCollection.values()) {
      TypeOfCollectionOption typeOfCollectionoption = new TypeOfCollectionOption(typeOfCollection);
      typeOfCollectionOptions.add(typeOfCollectionoption);
    }
    return typeOfCollectionOptions;
  }

  @Override
public TypeOfCollectionOption getOptionFromCodeString(String codeString) {
    for (TypeOfCollectionOption typeOfCollectionOption : this.listOptions) {
      if (typeOfCollectionOption.hasCodeString(codeString)) {
        return typeOfCollectionOption;
      }
    }
    return null;
  }
}
