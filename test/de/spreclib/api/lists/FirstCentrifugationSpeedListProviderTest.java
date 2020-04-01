package de.spreclib.api.lists;

import static org.junit.Assert.*;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationSpeedListProviderTest {

  private IListProvider firstCentrifugationSpeedListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    firstCentrifugationSpeedListProvider = new FirstCentrifugationSpeedListProvider();
    list = firstCentrifugationSpeedListProvider.getList();
  }

  @Test
  public void test() {
    assertFalse(list.isEmpty());
  }
}
