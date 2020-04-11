package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationSpeedListProviderTest {

  private ArrayList<FirstCentrifugationSpeedOption> list;

  @Before
  public void setUp() {
    list = FirstCentrifugationSpeedListProvider.getList();
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

  @Test
  public void testValueOfWithValidValue() {

    FirstCentrifugationSpeedOption speedOption = FirstCentrifugationSpeedListProvider.valueOf(3000);

    assertNotNull(speedOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    FirstCentrifugationSpeedOption speedOption = FirstCentrifugationSpeedListProvider.valueOf(-1);

    assertNull(speedOption);
  }
}
