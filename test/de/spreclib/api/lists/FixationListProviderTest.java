package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
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
  public void testOptionStringRepresentation() {
    for (IListOption option : this.fixationList) {
      assertNotNull(option.getStringRepresentation());
    }
  }
}
