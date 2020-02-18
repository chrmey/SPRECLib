package de.spreclib.java.enums;

import static org.junit.Assert.*;

import org.junit.Test;

import de.spreclib.java.interfaces.ISprecPart;

public class TestColdIschemiaTime {

  @Test
  public void test() {
	  ColdIschemiaTime lessThanTwoMinutes = ColdIschemiaTime.LESS_THAN_TWO_MINUTES;
	  
	  assertTrue(lessThanTwoMinutes instanceof ISprecPart);
	  
	  assertEquals(SprecPartType.COLD_ISCHEMIA_TIME, lessThanTwoMinutes.getSprecPartType());
  }
}
