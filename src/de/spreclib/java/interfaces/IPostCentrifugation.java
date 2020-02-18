package de.spreclib.java.interfaces;

import de.spreclib.java.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;

public interface IPostCentrifugation {

  PostCentrifugationType getPostCentrifugationType();

  PostCentrifugationDelay getPostCentrifugationDelay();

  PostCentrifugationTemperature getPostCentrifugationTemperature();
}
