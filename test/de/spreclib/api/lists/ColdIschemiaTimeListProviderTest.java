package de.spreclib.api.lists;

import static org.junit.Assert.*;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class ColdIschemiaTimeListProviderTest {

  private IListProvider coldIschemiaTimeListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    coldIschemiaTimeListProvider = new ColdIschemiaTimeListProvider();
    list = coldIschemiaTimeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(list.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : list) {
      assertNotNull(option.getStringRepresentation());
    }
  }
}
