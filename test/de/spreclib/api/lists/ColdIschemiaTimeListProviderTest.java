package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.ColdIschemiaTimeOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class ColdIschemiaTimeListProviderTest {

  private ArrayList<ColdIschemiaTimeOption> list;

  @Before
  public void setUp() {
    list = ColdIschemiaTimeListProvider.getList();
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
