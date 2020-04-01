package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationTemperatureListProviderTest {

  private IListProvider firstCentrifugationTemperatureListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    firstCentrifugationTemperatureListProvider = new FirstCentrifugationTemperatureListProvider();
    list = firstCentrifugationTemperatureListProvider.getList();
  }

  @Test
  public void test() {
    assertFalse(list.isEmpty());
  }
}
