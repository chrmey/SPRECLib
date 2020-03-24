package de.spreclib.api.sprec;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import de.spreclib.api.lists.FluidSampleTypeListProvider;
import de.spreclib.api.lists.PreCentrifugationListProvider;
import de.spreclib.api.lists.PrimaryContainerListProvider;
import de.spreclib.api.lists.interfaces.IListOption;
import de.spreclib.model.enums.FluidSampleType;
import de.spreclib.model.enums.PrimaryContainer;

public class FluidSampleSprecTest {

  ArrayList<IListOption> fluidSampleTypeList = new ArrayList<IListOption>();
  ArrayList<IListOption> primaryContainerList = new ArrayList<IListOption>();
  ArrayList<IListOption> preCentrifugationList = new ArrayList<IListOption>();
  FluidSprecSample sample0;

  @Before
  public void setUp() {
    sample0 = new FluidSprecSample();

    FluidSampleTypeListProvider fluidSampleTypeProvider = new FluidSampleTypeListProvider();
    fluidSampleTypeList = fluidSampleTypeProvider.getList();

    PrimaryContainerListProvider primaryContainerListProvider = new PrimaryContainerListProvider();
    primaryContainerList = primaryContainerListProvider.getList();

    PreCentrifugationListProvider preCentrifugationListProvider =
        new PreCentrifugationListProvider();
    preCentrifugationList = preCentrifugationListProvider.getList();
  }

  @Test
  public void testWithFluidSampleType() {
    FluidSampleType expected;
    for (int i = 0; i < fluidSampleTypeList.size(); i++) {
      sample0.withFluidSampleType((FluidSampleTypeOption) fluidSampleTypeList.get(i));
      expected = FluidSampleType.values()[i];

      assertEquals(
          expected.getCodeFromSprecPart().getStringRepresentation(),
          sample0.getSprecCode().getFluidSampleType().getStringRepresentation());
    }
  }

  @Test
  public void testWithPrimaryContainer() {
    PrimaryContainer expected;
    for (int i = 0; i < primaryContainerList.size(); i++) {
      sample0.withPrimaryContainer((PrimaryContainerOption) primaryContainerList.get(i));
      expected = PrimaryContainer.values()[i];

      assertEquals(
          expected.getCodeFromSprecPart().getStringRepresentation(),
          sample0.getSprecCode().getPrimaryContainer().getStringRepresentation());
    }
  }

  @Test
  public void testWithPreCentrifugationOption() {
    // Vielleicht doch keine Sets nutzen? Sondern irgendwas anderes? ArrayList zum Beispiel?
    // Aber muss ich denn auf den Index Zugreifen? Ich kenne das Objekt ja. Ein get bräuchte ich
    // hier nur beim testen
    sample0.withPreCentrifugation((PreCentrifugationOption) preCentrifugationList.get(0));

    System.out.println(sample0.getSprecCode().getPreCentrifugation().getStringRepresentation());

    sample0.withPreCentrifugation((PreCentrifugationOption) preCentrifugationList.get(1));

    System.out.println(sample0.getSprecCode().getPreCentrifugation().getStringRepresentation());

    sample0.withPreCentrifugation((PreCentrifugationOption) preCentrifugationList.get(2));

    System.out.println(sample0.getSprecCode().getPreCentrifugation().getStringRepresentation());
  }
}
	