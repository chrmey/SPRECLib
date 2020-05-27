package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.primarycontainer.PrimaryContainer;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PrimaryContainerListProviderTest {

  private PrimaryContainerListProvider primaryContainerListProvider;
  private List<PrimaryContainerOption> primaryContainerList;

  @Before
  public void setUp() {
    this.primaryContainerListProvider = new PrimaryContainerListProvider();
    this.primaryContainerList = primaryContainerListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.primaryContainerList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.primaryContainerList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testFullListSize() {
    int expected = PrimaryContainer.values().length;
    int actual = primaryContainerList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testGetOptionFromCodeString() {

    assertNotNull(this.primaryContainerListProvider.getOptionFromCodeString("ACD"));
  }

  @Test
  public void testGetOptionFromCodeStringReturnNull() {

    assertNull(this.primaryContainerListProvider.getOptionFromCodeString("AA"));
  }
}
