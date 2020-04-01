package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PreCentrifugationDelayListProviderTest {

  private IListProvider preCentrifugationDelayListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    preCentrifugationDelayListProvider = new PreCentrifugationDelayListProvider();
    list = preCentrifugationDelayListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(list.isEmpty());
  }
}
