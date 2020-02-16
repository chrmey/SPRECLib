package de.spreclib.java.enums;

public enum CentrifugationSpeed {
	LESS_THREETHOUSAND_G(0, 3000),
	THREETHOUSAND_TO_SIXTHOUSAND_G(3000, 6000),
	SIXTHOUSAND_TO_TENTHOUSAND_G(6000,10000),
	GREATER_TENTHOUSAND_G(10000, 99999),
	LESS_THOUSAND_G(0, 1000);

  CentrifugationSpeed(int lowerBound, int upperBound) {
    // TODO Auto-generated constructor stub
  }
	
}
