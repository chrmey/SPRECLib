package de.spreclib.meta.spreccode;

import de.spreclib.meta.spreccode.interfaces.ISprecCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractSprecCode implements ISprecCode {

  private Properties properties = new Properties();
  final String placeholderOneCharacter;
  final String placeholderThreeCharacters;

  protected AbstractSprecCode() {

    loadProperties();

    this.placeholderOneCharacter = readPlaceHolderOneCharacter();
    this.placeholderThreeCharacters = readPlaceHolderThreeCharacters();
  }

  private void loadProperties() {

    try {

      InputStream inputStream =
          getClass().getClassLoader().getResourceAsStream("config.properties");

      properties.load(inputStream);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private String readPlaceHolderOneCharacter() {
    return properties.getProperty("placeholder.onecharacter");
  }

  private String readPlaceHolderThreeCharacters() {
    return properties.getProperty("placeholder.threecharacters");
  }
}
