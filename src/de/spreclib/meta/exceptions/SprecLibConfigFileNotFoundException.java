package de.spreclib.meta.exceptions;

public class SprecLibConfigFileNotFoundException extends RuntimeException {

  private final String message = "SprecLib Configuration File could not be found. Make sure there is a spreclib_config folder at the same level as the library and the config.properties file is placed there. Read the manual at GitHub for further information.";

  public String getMessage(){
    return this.message;
  }
}
