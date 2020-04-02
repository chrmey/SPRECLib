package de.spreclib.api.lists.options;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.interfaces.IListObject;

public abstract class AbstractListOption implements IListOption {

  protected final IListObject listObject;
 
  public AbstractListOption(IListObject listObject) {
    this.listObject = listObject;
  }

  public IListObject getContainedObject() {
    return this.listObject;
  }
}
