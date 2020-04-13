package de.spreclib.api.lists;

import de.spreclib.api.lists.options.FluidSampleTypeOption;
import de.spreclib.model.enums.FluidSampleType;
import java.util.ArrayList;

/**
 * ListProvider for FixationOptions.
 *
 * @author Christopher Meyer
 * @version 1.0
 * @see de.spreclib.api.lists.Fixation
 */
public final class FluidSampleTypeListProvider {

  private static final ArrayList<FluidSampleTypeOption> FLUID_SAMPLE_TYPE_OPTIONS;

  static {
    FLUID_SAMPLE_TYPE_OPTIONS = new ArrayList<>();
    for (FluidSampleType fluidSampleType : FluidSampleType.values()) {
      FluidSampleTypeOption fluidSampleTypeOption = new FluidSampleTypeOption(fluidSampleType);
      FLUID_SAMPLE_TYPE_OPTIONS.add(fluidSampleTypeOption);
    }
  }

  public static ArrayList<FluidSampleTypeOption> getList() {
    return FLUID_SAMPLE_TYPE_OPTIONS;
  }
}
