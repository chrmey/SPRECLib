package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.fixation.Fixation;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FixationListProviderTest {

  private FixationListProvider fixationListProvider;
  private List<FixationOption> fixationList;

  @Before
  public void setUp() {
    this.fixationListProvider = new FixationListProvider();
    this.fixationList = fixationListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.fixationList.isEmpty());
  }

  @Test
  public void testFullListSize() {
    int expected = Fixation.values().length;
    int actual = fixationList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.fixationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }
}
