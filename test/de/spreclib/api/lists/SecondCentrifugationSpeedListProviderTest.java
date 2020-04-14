package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationSpeedOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationSpeedListProviderTest {

  private SecondCentrifugationSpeedListProvider secondCentrifugationSpeedListProvider;
  private List<SecondCentrifugationSpeedOption> secondCentrifugationSpeedList;

  @Before
  public void setUp() {
    this.secondCentrifugationSpeedListProvider = new SecondCentrifugationSpeedListProvider();
    this.secondCentrifugationSpeedList = secondCentrifugationSpeedListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.secondCentrifugationSpeedList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.secondCentrifugationSpeedList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    SecondCentrifugationSpeedOption speedOption =
        this.secondCentrifugationSpeedListProvider.valueOf(3000);

    assertNotNull(speedOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    SecondCentrifugationSpeedOption speedOption =
        this.secondCentrifugationSpeedListProvider.valueOf(-1);

    assertNull(speedOption);
  }
}
