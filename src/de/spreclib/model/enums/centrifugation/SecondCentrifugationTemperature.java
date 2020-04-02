package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationTemperature;

public enum SecondCentrifugationTemperature implements ICentrifugationTemperature, IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  SecondCentrifugationTemperature(float lowerBound, float upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}