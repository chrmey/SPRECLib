package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PreCentrifugationDelayListProviderTest {

  private ArrayList<PreCentrifugationDelayOption> list;

  @Before
  public void setUp() {
    list = PreCentrifugationDelayListProvider.getList();
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

    PreCentrifugationDelayOption delayOption = PreCentrifugationDelayListProvider.valueOf(15);

    assertNotNull(delayOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    PreCentrifugationDelayOption delayOption = PreCentrifugationDelayListProvider.valueOf(-1);

    assertNull(delayOption);
  }
}
