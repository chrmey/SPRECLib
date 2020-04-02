package de.spreclib.api.lists;

import static org.junit.Assert.*;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationBrakingListProviderTest {

  private IListProvider secondCentrifugationBrakingListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    secondCentrifugationBrakingListProvider = new SecondCentrifugationBrakingListProvider();
    list = secondCentrifugationBrakingListProvider.getList();
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
