package de.spreclib.java.spreclib;

import java.util.HashMap;
import java.util.Map;

import de.spreclib.java.enums.SprecPartType;
import de.spreclib.java.interfaces.ISprec;
import de.spreclib.java.interfaces.ISprecPart;
import de.spreclib.java.spreclib.longtermstorage.LongTermStorage;

public abstract class Sprec implements ISprec {

  protected LongTermStorage longTermStorage;

  protected Map<SprecPartType, ISprecPart> sprecParts;

  public Sprec() {
    this.sprecParts = new HashMap<>();
  }

  @Override
  public String getSprecCode() {
    StringBuilder stringBuilder = new StringBuilder();
    for (SprecPartType key : this.sprecParts.keySet()) {
      if (sprecParts.get(key) == null) {
        stringBuilder.append("-");
      } else {
        stringBuilder.append(sprecParts.get(key));
      }
    }
    return stringBuilder.toString();
  }
}
