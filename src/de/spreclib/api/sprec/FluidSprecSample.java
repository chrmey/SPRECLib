package de.spreclib.api.sprec;

import de.spreclib.api.sprec.interfaces.IPreCentrifugationParameter;
import de.spreclib.api.sprec.interfaces.ISprecSample;
import de.spreclib.model.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.model.interfaces.ICodePart;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugation;
import de.spreclib.model.spreclib.precentrifugation.PreCentrifugationList;

public class FluidSprecSample implements ISprecSample {

  private FluidSprecCode fluidSprecCode = new FluidSprecCode();


  public FluidSprecSample withFluidSampleType(FluidSampleTypeOption sampleType) {
    this.fluidSprecCode.setFluidSampleType(sampleType.getCodePartFromOption());
    return this;
  }

  public FluidSprecSample withPrimaryContainer(PrimaryContainerOption primaryContainer) {
    this.fluidSprecCode.setPrimaryContainer(primaryContainer.getCodePartFromOption());
    return this;
  }

  public FluidSprecSample withPreCentrifugation(PreCentrifugationOption preCentrifugation) {
    this.fluidSprecCode.setPreCentrifugation(preCentrifugation.getCodePartFromOption());
    return this;
  }

  public FluidSprecSample withPreCentrifugation(IPreCentrifugationParameter param) {
    return this;
  }

  public FluidSprecSample withOtherPreCentrifugation() {
    ICodePart codePart = null;
    for (PreCentrifugation preCentrifugation : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      if (preCentrifugation.getPreCentrifugationType().equals(PreCentrifugationType.OTHER)) {
        codePart = preCentrifugation.getCodeFromSprecPart();
      }
    }
    this.fluidSprecCode.setPreCentrifugation(codePart);
    return this;
  }

  public FluidSprecSample withUnknownPreCentrifugation() {
    ICodePart codePart = null;
    for (PreCentrifugation preCentrifugation : PreCentrifugationList.PRE_CENTRIFUGATIONS) {
      if (preCentrifugation.getPreCentrifugationType().equals(PreCentrifugationType.UNKNOWN)) {
        codePart = preCentrifugation.getCodeFromSprecPart();
      }
    }
    this.fluidSprecCode.setPreCentrifugation(codePart);
    return this;
  }

  @Override
  public FluidSprecCode getSprecCode() {
    return this.fluidSprecCode;
  }
}
