package de.spreclib.api.lists;

import de.spreclib.api.lists.options.SolidSampleTypeOption;
import de.spreclib.model.enums.SolidSampleType;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SolidSampleTypeOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.options.SolidSampleTypeOption
 */
public final class SolidSampleTypeListProvider {

  private final List<SolidSampleTypeOption> solidSampleTypeOptions;

  public SolidSampleTypeListProvider() {
    this.solidSampleTypeOptions = generateList();
  }

  private List<SolidSampleTypeOption> generateList() {
    List<SolidSampleTypeOption> solidSampleTypeOptions = new ArrayList<>();
    for (SolidSampleType solidSampleType : SolidSampleType.values()) {
      SolidSampleTypeOption solidSanpleTypeOption = new SolidSampleTypeOption(solidSampleType);
      solidSampleTypeOptions.add(solidSanpleTypeOption);
    }
    return solidSampleTypeOptions;
  }

  public List<SolidSampleTypeOption> getList() {
    return this.solidSampleTypeOptions;
  }
}
