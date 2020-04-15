package de.spreclib.api.lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.FirstCentrifugationBrakingOption;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationBrakingListProviderTest {

  private FirstCentrifugationBrakingListProvider firstCentrifugationBrakingListProvider;
  private List<FirstCentrifugationBrakingOption> firstCentrifugationBraking;

  @Before
  public void setUp() {
    firstCentrifugationBrakingListProvider = new FirstCentrifugationBrakingListProvider();
    firstCentrifugationBraking = firstCentrifugationBrakingListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationBraking.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : firstCentrifugationBraking) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testWithValidValue() {

    FirstCentrifugationBrakingOption brakingOption = firstCentrifugationBrakingListProvider.valueOf(true);

    assertNotNull(brakingOption);
  }

  @Test
  public void testValueOfShouldReturnBrakingOptionWithBraking() {

    FirstCentrifugationBrakingOption brakingOption =
        firstCentrifugationBrakingListProvider.valueOf(true);

    assertEquals(CentrifugationBraking.WITH_BRAKING, brakingOption.getContainedObject());
  }
}
