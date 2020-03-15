package de.spreclib.java.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationDuration;
import de.spreclib.model.enums.centrifugation.CentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.CentrifugationTemperature;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.spreclib.CodePart;
import de.spreclib.model.spreclib.centrifugation.Centrifugation;
import de.spreclib.model.spreclib.centrifugation.NormalCentrifugation;
import de.spreclib.model.spreclib.centrifugation.SecondCentrifugationList;
import de.spreclib.model.spreclib.centrifugation.SpecialCentrifugation;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;


public class SecondCentrifugationListTest {

  Set<Centrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.NO, new CodePart("N"), SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.UNKNOWN, new CodePart("X"), SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.OTHER, new CodePart("Z"), SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("B"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.LESS_THREETHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I"),
            SprecPartType.SECOND_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            CentrifugationSpeed.GREATER_TENTHOUSAND_G,
            CentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J"),
            SprecPartType.SECOND_CENTRIFUGATION));
  }

  @Test
  public void testSecondCentrifugationListSize() {
    int actualSize = SecondCentrifugationList.CENTRIFUGATIONS.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testSecondCentrifugationListContents() {
    for (Centrifugation centrifugation : testList) {
      assertTrue(SecondCentrifugationList.CENTRIFUGATIONS.contains(centrifugation));
    }
  }

  @Test
  public void testSecondCentrifugationListContentTypes() {
    int expectedNormalCentrifugations = 0;
    int expectedSpecialCentrifugations = 0;
    int actualNormalCentrifugations = 0;
    int actualSpecialCentrifugations = 0;

    for (Centrifugation centrifugation : testList) {
      if (centrifugation instanceof SpecialCentrifugation) {
        expectedSpecialCentrifugations++;
      }
      if (centrifugation instanceof NormalCentrifugation) {
        expectedNormalCentrifugations++;
      }
    }

    for (Centrifugation centrifugation : SecondCentrifugationList.CENTRIFUGATIONS) {
      if (centrifugation instanceof SpecialCentrifugation) {
        actualSpecialCentrifugations++;
      }
      if (centrifugation instanceof NormalCentrifugation) {
        actualNormalCentrifugations++;
      }
    }
    assertEquals(expectedNormalCentrifugations, actualNormalCentrifugations);
    assertEquals(expectedSpecialCentrifugations, actualSpecialCentrifugations);
  }
}
