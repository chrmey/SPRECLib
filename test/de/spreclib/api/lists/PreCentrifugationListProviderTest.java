package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;

import de.spreclib.api.lists.interfaces.IListOption;
import java.util.ArrayList;
import org.junit.Test;

public class PreCentrifugationListProviderTest {

  @Test
  public void test() {
    PreCentrifugationListProvider listProvider = new PreCentrifugationListProvider();
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    list = listProvider.getList();

    assertFalse(list.isEmpty());
  }
}
