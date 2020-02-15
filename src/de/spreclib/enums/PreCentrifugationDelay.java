package de.spreclib.enums;

public enum PreCentrifugationDelay {
  LESS_TWO_HOURS(0, 2),
  TWO_TO_FOUR_HOURS(2, 4),
  FOUR_TO_EIGHT_HOURS(4, 8),
  EIGHT_TO_TWELVE_HOURS(8, 12),
  TWELVE_TO_TWENTYFOUR_HOURS(12, 24),
  TWENTYFOUR_TO_EIGHTYFOUR_HOURS(24, 48),
  GREATER_EIGHTYFOUR_HOURS(48, 99999);

  private int lower;
  private int upper;

  PreCentrifugationDelay(int lowerBound, int upperBound) {
    this.lower = lowerBound;
    this.upper = upperBound;
  }
  
  
  public static PreCentrifugationDelay getPreCentrifugationDelay(int delay) {
	    for (PreCentrifugationDelay pcd : PreCentrifugationDelay.values()) {
	    	if (delay >= pcd.lower && delay < pcd.upper) {
	    		return pcd;
	    	}   		
	    }
	  return null;
  }
  
  
}
