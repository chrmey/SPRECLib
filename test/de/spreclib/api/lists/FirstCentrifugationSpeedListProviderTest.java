package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationSpeedOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationSpeedListProviderTest {

  private FirstCentrifugationSpeedListProvider firstCentrifugationSpeedListProvider;
  private List<FirstCentrifugationSpeedOption> firstCentrifugationSpeedList;

  @Before
  public void setUp() {
    this.firstCentrifugationSpeedListProvider = new FirstCentrifugationSpeedListProvider();
    this.firstCentrifugationSpeedList = firstCentrifugationSpeedListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationSpeedList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : firstCentrifugationSpeedList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    FirstCentrifugationSpeedOption speedOption = this.firstCentrifugationSpeedListProvider.valueOf(3000);

    assertNotNull(speedOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    FirstCentrifugationSpeedOption speedOption = this.firstCentrifugationSpeedListProvider.valueOf(-1);

    assertNull(speedOption);
  }
}
