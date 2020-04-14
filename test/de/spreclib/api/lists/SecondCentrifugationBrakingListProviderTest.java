package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SecondCentrifugationBrakingOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SecondCentrifugationBrakingListProviderTest {

  private SecondCentrifugationBrakingListProvider secondCentrifugationBrakingListProvider;
  private List<SecondCentrifugationBrakingOption> secondCentrifugationBrakingList;

  @Before
  public void setUp() {
    this.secondCentrifugationBrakingListProvider = new SecondCentrifugationBrakingListProvider();
    this.secondCentrifugationBrakingList = secondCentrifugationBrakingListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.secondCentrifugationBrakingList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.secondCentrifugationBrakingList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testWithValidValue() {

    SecondCentrifugationBrakingOption brakingOption =
        this.secondCentrifugationBrakingListProvider.valueOf(true);

    assertNotNull(brakingOption);
  }
}
