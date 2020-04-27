package de.spreclib.model.sprec;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CodePartTest {

  CodePart codePart;

  @Before
  public void setUp() {

    this.codePart = new CodePart("A");
  }

  @Test
  public void testGetStringRepresentation() {
    assertEquals("A", codePart.getStringRepresentation());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testWithIllegalArgument() {

    new CodePart("AA");
  }
}
