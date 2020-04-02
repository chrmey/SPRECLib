package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
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
