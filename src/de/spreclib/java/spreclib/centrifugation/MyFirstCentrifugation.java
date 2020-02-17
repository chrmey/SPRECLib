package de.spreclib.java.spreclib;

import de.spreclib.java.enums.CentrifugationBraking;
import de.spreclib.java.enums.CentrifugationTemperature;
import de.spreclib.java.interfaces.CentrifugationTime;

public class MyFirstCentrifugation extends MyCentrifugation {

  static {
    centrifugations.add(
        new MyCentrifugation(
            CentrifugationType.DEFAULT,
            CentrifugationTemperature.ROOM_TEMPERATURE,
            CentrifugationTime._10_TO_15,
            CentrifugationBraking.NO_BRAKING,
            null));
    centrifugations.add(new MyCentrifugation());
    centrifugations.add(new MyCentrifugation());
    centrifugations.add(new MyCentrifugation());
    centrifugations.add(new MyCentrifugation());
  }
}
