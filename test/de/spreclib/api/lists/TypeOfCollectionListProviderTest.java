package de.spreclib.api.lists;

import static org.junit.Assert.*;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TypeOfCollectionListProviderTest {

  private IListProvider typeOfCollectionListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    typeOfCollectionListProvider = new TypeOfCollectionListProvider();
    list = typeOfCollectionListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(list.isEmpty());
  }
}
