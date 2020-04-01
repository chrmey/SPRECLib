package de.spreclib.api.lists;

import static org.junit.Assert.*;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationSpeedListProviderTest {

  private IListProvider secondCentrifugationSpeedListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    secondCentrifugationSpeedListProvider = new SecondCentrifugationSpeedListProvider();
    list = secondCentrifugationSpeedListProvider.getList();
  }

  @Test
  public void test() {
    assertFalse(list.isEmpty());
  }
}
