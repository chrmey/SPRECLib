package de.spreclib.model.interfaces;

import de.spreclib.model.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.model.enums.postcentrifugation.PostCentrifugationType;

public interface IPostCentrifugation {

  PostCentrifugationType getPostCentrifugationType();

  PostCentrifugationDelay getPostCentrifugationDelay();

  PostCentrifugationTemperature getPostCentrifugationTemperature();
}
