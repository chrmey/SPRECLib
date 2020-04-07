package de.spreclib.api.parameters;

import static org.junit.Assert.assertNotNull;

import de.spreclib.api.lists.options.PreCentrifugationDelayOption;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationDelay;
import org.junit.Test;

public class PreCentrifugationDelayParameterTest {

  @Test
  public void testWithOption() {

    PreCentrifugationDelay preCentrifugationDelay = PreCentrifugationDelay.LESS_TWO_HOURS;
    PreCentrifugationDelayOption preCentrifugationDelayOption =
        new PreCentrifugationDelayOption(preCentrifugationDelay);

    PreCentrifugationDelayParameter preCentrifugationDelayParameter =
        new PreCentrifugationDelayParameter(preCentrifugationDelayOption);

    assertNotNull(preCentrifugationDelayParameter.getPreCentrifugationDelay());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithOptionIsNull() {

    PreCentrifugationDelayOption preCentrifugationDelayOption = null;

    new PreCentrifugationDelayParameter(preCentrifugationDelayOption);
  }

  @Test
  public void testWithDelayValue() {

    PreCentrifugationDelayParameter preCentrifugationDelayParameter =
        new PreCentrifugationDelayParameter(1577836800, 1577837700);

    assertNotNull(preCentrifugationDelayParameter.getPreCentrifugationDelay());
  }
}
