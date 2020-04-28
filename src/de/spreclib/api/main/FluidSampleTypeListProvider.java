package de.spreclib.api.main;

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
public final class FluidSampleTypeListProvider extends AbstractListProvider<FluidSampleTypeOption> {

  public FluidSampleTypeListProvider() {
    super();
  }

  @Override
  protected List<FluidSampleTypeOption> generateList() {
    List<FluidSampleTypeOption> FLUID_SAMPLE_TYPE_OPTIONS = new ArrayList<>();
    for (FluidSampleType fluidSampleType : FluidSampleType.values()) {
      FluidSampleTypeOption fluidSampleTypeOption = new FluidSampleTypeOption(fluidSampleType);
      FLUID_SAMPLE_TYPE_OPTIONS.add(fluidSampleTypeOption);
    }
    return FLUID_SAMPLE_TYPE_OPTIONS;
  }
}
