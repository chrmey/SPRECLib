package de.spreclib.api.lists.interfaces;

import de.spreclib.model.interfaces.IListObject;

/**
 * Interface for ListOption.
 *
 * @author Christopher Meyer @Version 1.0
 */
public interface IListOption {

  /**
   * Returns the Name of the contained object in english.
   *
   * @return Name of the contained object in english.
   */
  public String getStringRepresentation();

  /**
   * Return the contained object.
   *
   * @return The contained object
   */
  public IListObject getContainedObject();
}
