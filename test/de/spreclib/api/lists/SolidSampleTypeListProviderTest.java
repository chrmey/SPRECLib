package de.spreclib.api.lists;

import static org.junit.Assert.*;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class SolidSampleTypeListProviderTest {

  private IListProvider solidSampleTypeListProvider;
  private ArrayList<IListOption> list;

  @Before
  public void setUp() {
    solidSampleTypeListProvider = new SolidSampleTypeListProvider();
    list = solidSampleTypeListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(list.isEmpty());
  }
}
