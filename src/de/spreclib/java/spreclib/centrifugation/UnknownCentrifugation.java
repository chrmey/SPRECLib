package de.spreclib.java.spreclib;

public class UnknownCentrifugation extends MyCentrifugation {

	@Override
	public CentrifugationType getCentrifugationType() {
		return CentrifugationType.UNKNOWN;
	}
}
