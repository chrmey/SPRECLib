package de.spreclib.java.spreclib;

public class NoCentrifugation extends MyCentrifugation {
	
	@Override
	  public CentrifugationType getCentrifugationType() {
		return CentrifugationType.NO;
	  }
}
