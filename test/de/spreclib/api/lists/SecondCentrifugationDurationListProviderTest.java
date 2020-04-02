package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationDurationListProviderTest {

  private IListProvider secondCentrifugationDurationListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    secondCentrifugationDurationListProvider = new SecondCentrifugationDurationListProvider();
    list = secondCentrifugationDurationListProvider.getList();
  }

  @Test
  public void test() {
    assertFalse(list.isEmpty());
  }
}