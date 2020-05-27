package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.model.solidsampletype.SolidSampleType;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for SolidSampleTypeOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.main.SolidSampleTypeOption
 */
public final class SolidSampleTypeListProvider extends AbstractListProvider<SolidSampleTypeOption>
    implements IFactorListProvider<SolidSampleTypeOption> {

  public SolidSampleTypeListProvider() {
    super();
  }

  @Override
  List<SolidSampleTypeOption> generateList() {
    List<SolidSampleTypeOption> solidSampleTypeOptions = new ArrayList<>();
    for (SolidSampleType solidSampleType : SolidSampleType.values()) {
      SolidSampleTypeOption solidSampleTypeOption = new SolidSampleTypeOption(solidSampleType);
      solidSampleTypeOptions.add(solidSampleTypeOption);
    }
    return solidSampleTypeOptions;
  }

  @Override
public SolidSampleTypeOption getOptionFromCodeString(String codeString) {
    for (SolidSampleTypeOption solidSampleTypeOption : this.listOptions) {
      if (solidSampleTypeOption.hasCodeString(codeString)) {
        return solidSampleTypeOption;
      }
    }
    return null;
  }
}
