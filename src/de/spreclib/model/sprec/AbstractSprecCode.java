package de.spreclib.model.sprec;

import de.spreclib.model.sprec.interfaces.ISprecCode;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractSprecCode implements ISprecCode {

  private Properties properties = new Properties();
  protected final String placeholderOneCharacter;
  protected final String placeholderThreeCharacters;

  protected AbstractSprecCode() {

    loadProperties();

    this.placeholderOneCharacter = readPlaceHolderOneCharacter();
    this.placeholderThreeCharacters = readPlaceHolderThreeCharacters();
  }

  private void loadProperties() {

    try (InputStream inputStream = new FileInputStream("./config/config.properties")) {

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
