package de.spreclib.api.lists;

import de.spreclib.model.enums.SolidSampleType;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SolidSampleTypeOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.SolidSampleTypeOption
 */
public final class SolidSampleTypeListProvider extends AbstractListProvider<SolidSampleTypeOption> {

  public SolidSampleTypeListProvider() {
    super();
  }

  @Override
  protected List<SolidSampleTypeOption> generateList() {
    List<SolidSampleTypeOption> solidSampleTypeOptions = new ArrayList<>();
    for (SolidSampleType solidSampleType : SolidSampleType.values()) {
      SolidSampleTypeOption solidSampleTypeOption = new SolidSampleTypeOption(solidSampleType);
      solidSampleTypeOptions.add(solidSampleTypeOption);
    }
    return solidSampleTypeOptions;
  }
}
