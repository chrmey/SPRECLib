package de.spreclib.api.lists;

import static org.junit.Assert.*;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationBrakingListProviderTest {

  private IListProvider firstCentrifugationBrakingListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    firstCentrifugationBrakingListProvider = new FirstCentrifugationBrakingListProvider();
    list = firstCentrifugationBrakingListProvider.getList();
  }

  @Test
  public void test() {
    assertFalse(list.isEmpty());
  }
}
