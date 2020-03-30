package de.spreclib.model.enums.postcentrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum PostCentrifugationTemperature implements IListObject {
  ROOM_TEMPERATURE(18, 28),
  TWO_TO_TEN_DEGREES(2, 10);

  PostCentrifugationTemperature(float lowerBound, float upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}
