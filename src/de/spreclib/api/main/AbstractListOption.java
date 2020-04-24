package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IListOption;
import de.spreclib.model.interfaces.IListProvideable;
import java.util.Locale;
import java.util.ResourceBundle;

public abstract class AbstractListOption implements IListOption {

  private static final Locale ENGLISH_US = new Locale("en");
  protected static final ResourceBundle NAMES_DEFAULT =
      ResourceBundle.getBundle("names", ENGLISH_US);

  protected abstract IListProvideable getContainedObject();
}
