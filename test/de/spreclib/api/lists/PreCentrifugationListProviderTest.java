package de.spreclib.api.lists;

import java.util.ArrayList;
import org.junit.Test;

import de.spreclib.api.lists.PreCentrifugationListProvider;
import de.spreclib.api.lists.interfaces.IListOption;

public class PreCentrifugationListProviderTest {

  @Test
  public void test() {
    PreCentrifugationListProvider listProvider = new PreCentrifugationListProvider();
    ArrayList<IListOption> list = new ArrayList<IListOption>();
    list = listProvider.getList();

    for (IListOption entry : list) {
      System.out.println(entry.getStringRepresentation());
    }
  }
}
