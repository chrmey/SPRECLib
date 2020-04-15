package de.spreclib.model.centrifugation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import de.spreclib.model.centrifugation.Centrifugation;
import de.spreclib.model.centrifugation.FirstCentrifugationList;
import de.spreclib.model.centrifugation.NormalCentrifugation;
import de.spreclib.model.centrifugation.SpecialCentrifugation;
import de.spreclib.model.enums.SprecPartType;
import de.spreclib.model.enums.centrifugation.CentrifugationBraking;
import de.spreclib.model.enums.centrifugation.CentrifugationType;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationDuration;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationSpeed;
import de.spreclib.model.enums.centrifugation.FirstCentrifugationTemperature;
import de.spreclib.model.sprec.CodePart;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class FirstCentrifugationListTest {

  Set<Centrifugation> testList;

  @Before
  public void setUp() {
    testList = new HashSet<>();
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.NO, new CodePart("N"), SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.UNKNOWN, new CodePart("X"), SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new SpecialCentrifugation(
            CentrifugationType.OTHER, new CodePart("Z"), SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("A"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("B"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("C"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.LESS_THREETHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("D"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("E"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.THREETHOUSAND_TO_SIXTHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("G"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.SIXTHOUSAND_TO_TENTHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("F"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("I"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.TEN_TO_FIFTEEN_MINUTES,
            FirstCentrifugationSpeed.GREATER_TENTHOUSAND_G,
            FirstCentrifugationTemperature.TWO_TO_TEN_DEGREES,
            CentrifugationBraking.WITH_BRAKING,
            new CodePart("J"),
            SprecPartType.FIRST_CENTRIFUGATION));
    testList.add(
        new NormalCentrifugation(
            FirstCentrifugationDuration.THIRTY_MINUTES,
            FirstCentrifugationSpeed.LESS_THOUSAND_G,
            FirstCentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationBraking.NO_BRAKING,
            new CodePart("M"),
            SprecPartType.FIRST_CENTRIFUGATION));
  }

  @Test
  public void testFirstCentrifugationListSize() {
    int actualSize = FirstCentrifugationList.CENTRIFUGATIONS.size();
    int expectedSize = testList.size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void testFirstCentrifugationListContents() {
    for (Centrifugation centrifugation : testList) {
      assertTrue(FirstCentrifugationList.CENTRIFUGATIONS.contains(centrifugation));
    }
  }

  @Test
  public void testGetNoFirstCentrifugation() {
    Centrifugation noCentrifugation = FirstCentrifugationList.getNoFirstCentrifugation();
    assertEquals(CentrifugationType.NO, noCentrifugation.getCentrifugationType());
  }

  @Test
  public void testFirstCentrifugationListContentTypes() {
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

    for (Centrifugation centrifugation : FirstCentrifugationList.CENTRIFUGATIONS) {
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
