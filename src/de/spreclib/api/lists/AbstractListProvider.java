package de.spreclib.api.lists;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.List;
/**
 * AbstractListProvider is extended by the ListProviders.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @param <T> Generic ListOption
 */
public abstract class AbstractListProvider<T extends IListOption> implements IListProvider<T> {

  protected final List<T> listOptions;

  public AbstractListProvider() {
    this.listOptions = generateList();
  }

  @Override
  public List<T> getList() {
    return this.listOptions;
  }

  protected abstract List<T> generateList();
}
