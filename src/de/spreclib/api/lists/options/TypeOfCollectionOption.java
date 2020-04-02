package de.spreclib.api.lists.options;

import de.spreclib.model.enums.TypeOfCollection;

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
