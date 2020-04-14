package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.SolidSampleTypeOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class SolidSampleTypeListProviderTest {

  private SolidSampleTypeListProvider solidSampleTypeListProvider;
  private List<SolidSampleTypeOption> solidSampleTypeList;

  @Before
  public void setUp() {
    this.solidSampleTypeListProvider = new SolidSampleTypeListProvider();
    this.solidSampleTypeList = solidSampleTypeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(this.solidSampleTypeList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : this.solidSampleTypeList) {
      assertNotNull(option.getStringRepresentation());
    }
  }
}
