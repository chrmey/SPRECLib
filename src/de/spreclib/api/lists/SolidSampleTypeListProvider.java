package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SolidSampleTypeOption;
import de.spreclib.model.enums.SolidSampleType;
import java.util.ArrayList;

/**
 * ListProvider for SolidSampleTypeOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SolidSampleTypeOption
 */
public final class SolidSampleTypeListProvider {

  private static final ArrayList<SolidSampleTypeOption> SOLID_SAMPLE_TYPE_OPTIONS;

  static {
    SOLID_SAMPLE_TYPE_OPTIONS = new ArrayList<>();
    for (SolidSampleType solidSampleType : SolidSampleType.values()) {
      SolidSampleTypeOption solidSanpleTypeOption = new SolidSampleTypeOption(solidSampleType);
      SOLID_SAMPLE_TYPE_OPTIONS.add(solidSanpleTypeOption);
    }
  }

  public static ArrayList<SolidSampleTypeOption> getList() {
    return SOLID_SAMPLE_TYPE_OPTIONS;
  }
}
