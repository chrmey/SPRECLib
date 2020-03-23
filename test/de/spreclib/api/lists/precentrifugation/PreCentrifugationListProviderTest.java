package de.spreclib.api.lists.precentrifugation;

import java.util.ArrayList;
import org.junit.Test;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.precentrifugation.PreCentrifugationListProvider;

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
