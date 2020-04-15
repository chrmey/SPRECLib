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
    this.firstCentrifugationBrakingListProvider = new FirstCentrifugationBrakingListProvider();
    this.firstCentrifugationBraking = firstCentrifugationBrakingListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(firstCentrifugationBraking.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.firstCentrifugationBraking) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testWithValidValue() {

    FirstCentrifugationBrakingOption brakingOption =
        this.firstCentrifugationBrakingListProvider.valueOf(true);

    assertNotNull(brakingOption);
  }

  @Test
  public void testValueOfShouldReturnWithBraking() {

    FirstCentrifugationBrakingOption brakingOption =
        this.firstCentrifugationBrakingListProvider.valueOf(true);

    assertEquals(CentrifugationBraking.WITH_BRAKING, brakingOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnNoBraking() {

    FirstCentrifugationBrakingOption brakingOption =
        this.firstCentrifugationBrakingListProvider.valueOf(false);

    assertEquals(CentrifugationBraking.NO_BRAKING, brakingOption.getContainedObject());
  }
}
