package de.spreclib.api.lists;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

import de.spreclib.api.lists.FluidSampleTypeListProvider;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.interfaces.IListProvider;

public class FluidSampleTypeListProviderTest {

  @Test
  public void test() {
    IListProvider fluidSampleTypeListProvider = new FluidSampleTypeListProvider();
    ArrayList<IListOption> list = fluidSampleTypeListProvider.getList();
    for (IListOption option : list) {
      System.out.println(option.getStringRepresentation());
    }
  }
}
