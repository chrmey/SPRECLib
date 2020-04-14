package de.spreclib.api.lists.options;

import de.spreclib.model.enums.TypeOfCollection;

/**
 * TypeOfCollectionOption
 *
 * <p>To obtain the name of the ListOption e.g. for usage in GUIs use getStringRepresentation()
 *
 * @author Christopher Meyer
 * @version 1.0
 */
public final class TypeOfCollectionOption extends AbstractListOption {

  private final TypeOfCollection typeOfCollection;

  public TypeOfCollectionOption(TypeOfCollection typeOfCollection) {
    this.typeOfCollection = typeOfCollection;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.typeOfCollection.name());
  }

  @Override
  public TypeOfCollection getContainedObject() {
    return this.typeOfCollection;
  }
}
