# SPRECLIB

A Java library for the SamplePREAnalyticalCode from the [ISBER](https://www.isber.org/page/SPREC?&hhsearchterms=%22sprec%22)


## Getting Started

Use maven to include the library into your project.

```
Maven dependency
```

Alternatively just download the .jar and add it to your build. 

### Prerequisites

Java8


## Getting started

### Getting SPREC Values as Lists

To obtain lists of the SPREC values for each Parameter you can call the static ListProviders. There is a ListProvider for every Part of SPREC and also for each part of a part if the part is made up of multiple values. The contents of the ListProviders are called ListOptions, with a prefix depending on the ListProvider that they come from.

```
FluidSampleTypeProvider provides an ArrayList of FluidSampleTypeOptions
```

To get a list of FluidSampleTypeOptions:

```
ArrayList<FluidSampleTypeOption> fluidSampleTypeOptions = FluidSampleTypeListProvider.getList();
```

To get the english name of a ListOption, e.g. to use it in a GUI, call ```.getStringRepresentation();`` on the ```ListOption```

```
String nameInEnglish = fluidSampleTypeOption.getStringRepresentation();

```


### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management 

## Authors

* **Christohper Meyer* - [Chris2996](https://github.com/chris2996)


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details



