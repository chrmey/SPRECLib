package de.spreclib.java.interfaces;

import de.spreclib.java.enums.CentrifugationBraking;
import de.spreclib.java.enums.CentrifugationTemperature;
import de.spreclib.java.spreclib.CentrifugationType;

public interface ICentrifugation {
	
	CentrifugationType getCentrifugationType();
	CentrifugationTemperature getCentrifugationTemperature();
	CentrifugationTime getCentrifugationTime();
	CentrifugationBraking getCentrifugationBraking();
	
}
