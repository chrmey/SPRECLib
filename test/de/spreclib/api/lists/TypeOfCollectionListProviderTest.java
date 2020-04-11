package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.TypeOfCollectionOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class TypeOfCollectionListProviderTest {

  private ArrayList<TypeOfCollectionOption> list;

  @Before
  public void setUp() {
    list = TypeOfCollectionListProvider.getList();
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
