package de.spreclib.api.lists.options;

import de.spreclib.api.lists.interfaces.IListOption;
import java.util.Locale;
import java.util.ResourceBundle;

public abstract class AbstractListOption implements IListOption {

  private static final Locale ENGLISH_US = new Locale("en");
  protected static final ResourceBundle NAMES_DEFAULT =
      ResourceBundle.getBundle("names", ENGLISH_US);
}
