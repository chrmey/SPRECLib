package de.spreclib.api.lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.api.lists.options.PostCentrifugationDelayOption;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class PostCentrifugationDelayListProviderTest {

  private PostCentrifugationDelayListProvider postCentrifugationDelayListProvider;
  private List<PostCentrifugationDelayOption> postCentrifugationDelayList;

  @Before
  public void setUp() {
    this.postCentrifugationDelayListProvider = new PostCentrifugationDelayListProvider();
    this.postCentrifugationDelayList = postCentrifugationDelayListProvider.getList();
  }

  @Test
  public void testListNotEmpty() {
    assertFalse(postCentrifugationDelayList.isEmpty());
  }

  @Test
  public void testOptionStringRepresentation() {
    for (IListOption option : postCentrifugationDelayList) {
      assertNotNull(option.getStringRepresentation());
    }
  }

  @Test
  public void testValueOfWithValidValue() {

    PostCentrifugationDelayOption delayOption =
        this.postCentrifugationDelayListProvider.valueOf(15);

    assertNotNull(delayOption);
  }

  @Test
  public void testValueOfWithInvalidValue() {

    PostCentrifugationDelayOption delayOption =
        this.postCentrifugationDelayListProvider.valueOf(-1);

    assertNull(delayOption);
  }

  @Test
  public void testValueOfWithTimestamps() {

    long startTime = 1577836800000L;
    long fifteenMinutesLater = 1577837700000L;

    PostCentrifugationDelayOption postCentrifugationDurationOption =
        this.postCentrifugationDelayListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(postCentrifugationDurationOption);
  }
}
