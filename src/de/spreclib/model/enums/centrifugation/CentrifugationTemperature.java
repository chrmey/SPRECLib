package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum CentrifugationTemperature implements IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  CentrifugationTemperature(float lowerBound, float upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}
