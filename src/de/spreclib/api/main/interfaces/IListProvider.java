package de.spreclib.api.main.interfaces;

import java.util.List;

/**
 * Interface for ListProviders.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @param <T> Generic ListOption
 */
public interface IListProvider<T extends IListOption> {

  /**
   * Returns a List of ListOptions of the desired type.
   *
   * @return List of ListOptions
   */
  public List<T> getList();
}
