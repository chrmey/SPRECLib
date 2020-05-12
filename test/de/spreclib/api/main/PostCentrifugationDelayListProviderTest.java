package de.spreclib.api.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import de.spreclib.api.exceptions.UndefinedValueException;
import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.postcentrifugation.enums.PostCentrifugationDelay;
import java.time.Instant;
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
  public void testFullListSize() {
    int expected = PostCentrifugationDelay.values().length;
    int actual = postCentrifugationDelayList.size();

    assertEquals(expected, actual);
  }

  @Test
  public void testValueOfWithValidValue() throws UndefinedValueException {

    PostCentrifugationDelayOption delayOption =
        this.postCentrifugationDelayListProvider.valueOf(15);

    assertNotNull(delayOption);
  }

  @Test(expected = UndefinedValueException.class)
  public void testValueOfWithInvalidValue() throws UndefinedValueException {

    this.postCentrifugationDelayListProvider.valueOf(-1);
  }

  @Test
  public void testValueOfWithTimestamps() throws UndefinedValueException {

    Instant startTime = Instant.ofEpochMilli(1577836800000L);
    Instant fifteenMinutesLater = Instant.ofEpochMilli(1577837700000L);

    PostCentrifugationDelayOption postCentrifugationDurationOption =
        this.postCentrifugationDelayListProvider.valueOf(startTime, fifteenMinutesLater);

    assertNotNull(postCentrifugationDurationOption);
  }

  @Test
  public void testValueOfShouldReturnOneToTwoHours() throws UndefinedValueException {

    PostCentrifugationDelayOption postCentrifugationDelayOption =
        this.postCentrifugationDelayListProvider.valueOf(119);

    assertEquals(
        PostCentrifugationDelay.ONE_TO_TWO_HOURS,
        postCentrifugationDelayOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnTwoToEightHours() throws UndefinedValueException {

    PostCentrifugationDelayOption postCentrifugationDelayOption =
        this.postCentrifugationDelayListProvider.valueOf(120);

    assertEquals(
        PostCentrifugationDelay.TWO_TO_EIGHT_HOURS,
        postCentrifugationDelayOption.getContainedObject());
  }

  @Test
  public void testValueOfShouldReturnGreater24Hours() throws UndefinedValueException {

    PostCentrifugationDelayOption postCentrifugationDelayOption =
        this.postCentrifugationDelayListProvider.valueOf(1140);

    assertEquals(
        PostCentrifugationDelay.GREATER_TWENTYFOUR_HOURS,
        postCentrifugationDelayOption.getContainedObject());
  }
}
