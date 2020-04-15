# SPRECLib

![Build Java](https://github.com/Chris2996/SPRECLib/workflows/Build%20Java/badge.svg)

A Java library for the SamplePREAnalyticalCode Version 2 from the [ISBER](https://www.isber.org/page/SPREC?&hhsearchterms=%22sprec%22)


## Getting SPRECLib

Download the latest release jar and include it to your build. 

(Using Maven Central is planned)

### Prerequisites

Java8


## Getting started

### Terminology in SPRECLib


The elements of a SPREC code in SPRECLib are called Parts. FluidSampleType, TypeOfCollection, etc. are parts. Each part has a defined set of values, each one of them with a one or three character code (called CodePart). Seven parts make up the full code of a sample. 

SPRECLib also allows to "build up" a part from it's single values, that means you can use a temperature (degrees celsius) and a time value(minutes or two timestamps in milliseconds) and combine them to a PreCentrifugation. 


### Getting SPREC Values as Lists

To obtain lists of the SPREC values for each Parameter you need to instantiate the ListProvider for that Part. There is a ListProvider for every part of SPREC and also for each part of a part if the part is made up of multiple values. The contents of the ListProviders are called ListOptions, with a prefix depending on the ListProvider that they come from.

```
FluidSampleTypeProvider provides a List of FluidSampleTypeOptions, PrimaryContainerListProvider provides a List of PrimaryContainerOptions...
```

To get a list of FluidSampleTypeOptions:

```
FluidSampleTypeListProvider fluidSampleTypeListProvider = new FluidSampleTypeListProvider();
ArrayList<FluidSampleTypeOption> fluidSampleTypeOptions = fluidSampleTypeListProvider.getList();
```

To get the english name of a ListOption, e.g. to use it in a GUI, call ```.getStringRepresentation();``` on the ```ListOption```

```
String nameInEnglish = fluidSampleTypeOption.getStringRepresentation();
```

### Getting the SPREC Code of a Sample

After you obtained the ListOptios for the sample, use either ```FluidSampleSprec``` or ```SolidSampleSprec``` to get the SPREC Code. These classes provide a fluent interface to build the samples.

Example for a fluid sample:

```
  FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
  FluidSprecCode fluidSprecCode = fluidSampleSprec
    .withFluidSampleType(FluidSampleTypeOption)
    .withPrimaryContainer(PrimaryContainerOption)
    .withPreCentrifugation(PreCentrifugationOption)
    .withFirstCentrifugation(FirstCentrifugationOption)
    .withSecondCentrifugation(FirstSecondOption)
    .withPreCentrifugation(PostCentrifugationOption)
    .withLongTermStorage(LongTermStorageOption)
    .getSprecCode();
```

Example for a solid Sample:


```
  SolidSampleSprec solidSampleSprec = new SolidSampleSprec();

  SolidSprecCode solidSprecCode = solidSampleSprec
    .withSolidSampleType(SolidSampleTypeOption)
    .withTypeOfCollection(TypeOfColletionOption)
    .withWarmIschemiaTime(WarmIschemiaTimeOption)
    .withColdIschemiaTime(ColdIschemiaTimeOption)
    .withFixation(FixationOption)
    .withFixationTime(FixationTimeOption)
    .withLongTermStorage(LongTermStorageOption)
    .getSprecCode();
```

You can pass null values as Option, this will lead to the code for that part to be replaced by "?" if you print the full code for that sample.

Calling ```.getSprecCode()``` will return a FluidSprecCode / SolidSprecCode object. To get the full SPREC code use:
```
String sprecCode = fluidSprecCode.getStringRepresentation();
```

To get the code for a specific part:
Warning: This will return null if the part has not been set!

```
  FluidSampleSprec fluidSampleSprec = new FluidSampleSprec();
  
  FluidSprecCode sprecCode = fluidSampleSprec
    .withFluidSampleType(FluidSampleTypeOption)
    .getSprecCode();

ICodePart fluidSampleTypeCode = sprecCode.getFluidSampleTypeCode();
String fluidSampleTypeCodeString = fluidSampleTypeCode.getStringRepresentation();
```

```Passing values to SPRECLib```

## CodeStyle
Uses Google Java Styleguide


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management 

## Authors

* *Christopher Meyer* - [Chris2996](https://github.com/chris2996)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details



