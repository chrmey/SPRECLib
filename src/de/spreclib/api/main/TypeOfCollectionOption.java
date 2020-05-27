package de.spreclib.api.main;

import de.spreclib.model.typeofcollection.TypeOfCollection;

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

  TypeOfCollectionOption(TypeOfCollection typeOfCollection) {
    this.typeOfCollection = typeOfCollection;
  }

  @Override
  public String getStringRepresentation() {
    return NAMES_DEFAULT.getString(this.typeOfCollection.name());
  }

  @Override
  TypeOfCollection getContainedObject() {
    return this.typeOfCollection;
  }

  boolean hasCodeString(String codeString) {
    if (this.typeOfCollection
        .getCodeFromSprecFactor()
        .getStringRepresentation()
        .equals(codeString)) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((typeOfCollection == null) ? 0 : typeOfCollection.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    TypeOfCollectionOption other = (TypeOfCollectionOption) obj;
    if (typeOfCollection != other.typeOfCollection) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "TypeOfCollectionOption [typeOfCollection=" + typeOfCollection + "]";
  }
}
