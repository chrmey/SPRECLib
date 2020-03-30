package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;

public enum CentrifugationDuration implements IListObject {
  TEN_TO_FIFTEEN_MINUTES(10, 15),
  THIRY_MINUTES(30, 30);

  CentrifugationDuration(int lowerBound, int upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}
