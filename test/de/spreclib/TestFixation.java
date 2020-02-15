package de.spreclib;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import de.spreclib.enums.Fixation;
import de.spreclib.interfaces.ISprecPart;

class TestFixation {

  @Test
  void shouldReturnCorrectCodePart() {
    Fixation fixation = Fixation.ALCOHOL_BASED;
    String part = fixation.getCodePart();
    System.out.println(part);
    assertEquals("ETH", part);
  }

  /*
   @Test
   void shouldReturnCorrectSprecPart() {
     String part = Fixation.getSprecPart();
     System.out.println(part);
     assertEquals(Fixation.ALCOHOL_BASED.getCodePart(), part);
   }
  */

}
