package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationDurationListProviderTest {

  private IListProvider firstCentrifugationDurationListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    firstCentrifugationDurationListProvider = new FirstCentrifugationDurationListProvider();
    list = firstCentrifugationDurationListProvider.getList();
  }

  @Test
  public void test() {
    assertFalse(list.isEmpty());
  }
}
