package de.spreclib.java.spreclib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.spreclib.java.enums.CentrifugationBraking;
import de.spreclib.java.enums.CentrifugationDuration;
import de.spreclib.java.enums.CentrifugationSpeed;
import de.spreclib.java.enums.CentrifugationTemperature;
import de.spreclib.java.enums.SprecPartType;

import de.spreclib.java.interfaces.ISprecPart;

public class FirstCentrifugation extends Centrifugation {

	private static final Map<String, List<Object>> staticMap = new HashMap<>();
	
	static {
		ArrayList<Object> value = new ArrayList<>();
		staticMap.put("A", value);
	}
	
	
  public FirstCentrifugation() {}

  public Object getIrgendwas(String key) {
	  return staticMap.get(key);
  }
  
  @Override
  public ISprecPart getSprecPart() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SprecPartType getSprecPartType() {
    return SprecPartType.FIRST_CENTRIFUGATION;
  }
}
