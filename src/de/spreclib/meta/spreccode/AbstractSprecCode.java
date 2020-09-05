package de.spreclib.meta.spreccode;

import de.spreclib.meta.exceptions.SprecLibConfigFileNotFoundException;
import de.spreclib.meta.spreccode.interfaces.ISprecCode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractSprecCode implements ISprecCode {

  static final String CODESYSTEM = "SPREC";
  static final String CODESYSTEM_VERSION = "2.0";
  final String placeholderOneCharacter;
  final String placeholderThreeCharacters;
  private Properties properties = new Properties();

  protected AbstractSprecCode() {

    loadProperties();

    this.placeholderOneCharacter = readPlaceHolderOneCharacter();
    this.placeholderThreeCharacters = readPlaceHolderThreeCharacters();
  }

  private void loadProperties() {

    try {

      InputStream inputStream =
          getClass().getClassLoader().getResourceAsStream("config.properties");

      if (inputStream == null) {

        throw new SprecLibConfigFileNotFoundException();

      } else {

        properties.load(inputStream);
      }
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

  public static String getCodesystemVersion() {
    return CODESYSTEM_VERSION;
  }

  public static String getCodesystem() {
    return CODESYSTEM;
  }
}
