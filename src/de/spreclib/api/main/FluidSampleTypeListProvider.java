package de.spreclib.api.main;

import de.spreclib.api.main.interfaces.IFactorListProvider;
import de.spreclib.model.fluidsampletype.FluidSampleType;
import java.util.ArrayList;
import java.util.List;

/**
 * ListProvider for FixationOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.model.fixation.lists.Fixation
 */
public final class FluidSampleTypeListProvider extends AbstractListProvider<FluidSampleTypeOption>
    implements IFactorListProvider<FluidSampleTypeOption> {

  public FluidSampleTypeListProvider() {
    super();
  }

  @Override
  List<FluidSampleTypeOption> generateList() {
    List<FluidSampleTypeOption> fluidSampleTypeOptions = new ArrayList<>();
    for (FluidSampleType fluidSampleType : FluidSampleType.values()) {
      FluidSampleTypeOption fluidSampleTypeOption = new FluidSampleTypeOption(fluidSampleType);
      fluidSampleTypeOptions.add(fluidSampleTypeOption);
    }
    return fluidSampleTypeOptions;
  }

  @Override
public FluidSampleTypeOption getOptionFromCodeString(String codeString) {
    for (FluidSampleTypeOption fluidSampleTypeOption : this.listOptions) {
      if (fluidSampleTypeOption.hasCodeString(codeString)) {
        return fluidSampleTypeOption;
      }
    }
    return null;
  }
}
