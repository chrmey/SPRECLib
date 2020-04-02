package de.spreclib.api.lists;

import static org.junit.Assert.*;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class LongTermStorageListProviderTest {

  private IListProvider longTermStorageListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    longTermStorageListProvider = new LongTermStorageListProvider();
    list = longTermStorageListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(list.isEmpty());
  }
}