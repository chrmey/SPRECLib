package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.api.main.interfaces.IListProvider;
import java.util.List;
/**
 * AbstractListProvider is extended by the ListProviders.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @param <T> Generic ListOption
 */
public abstract class AbstractListProvider<T extends IListOption> implements IListProvider<T> {

  final List<T> listOptions;

  public AbstractListProvider() {
    this.listOptions = generateList();
  }

  @Override
  public List<T> getList() {
    return this.listOptions;
  }

  abstract List<T> generateList();
}
