package de.spreclib.model.enums.centrifugation;

import de.spreclib.model.interfaces.IListObject;
import de.spreclib.model.spreclib.centrifugation.ICentrifugationDuration;

public enum SecondCentrifugationDuration implements ICentrifugationDuration, IListObject {
  TEN_TO_FIFTEEN_MINUTES(10, 15);

  SecondCentrifugationDuration(int lowerBound, int upperBound) {
    // TODO Auto-generated constructor stub
    // TODO Bounds überarbeiten
  }
}
