package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class PostCentrifugationDelayListProviderTest {

  private ArrayList<PostCentrifugationDelayOption> list;

  @Before
  public void setUp() {
    list = PostCentrifugationDelayListProvider.getList();
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

    PostCentrifugationDelayOption delayOption = PostCentrifugationDelayListProvider.valueOf(15);

    assertNotNull(delayOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    PostCentrifugationDelayOption delayOption = PostCentrifugationDelayListProvider.valueOf(-1);

    assertNull(delayOption);
  }
}
