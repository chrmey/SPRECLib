package de.spreclib.java.spreclib.postcentrifugation;

import de.spreclib.java.enums.postcentrifugation.PostCentrifugationDelay;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationTemperature;
import de.spreclib.java.enums.postcentrifugation.PostCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class NormalPostCentrifugation extends PostCentrifugation {

  private PostCentrifugationDelay postCentrifugationDelay;
  private PostCentrifugationTemperature postCentrifugationTemperature;

  public NormalPostCentrifugation(
      PostCentrifugationType postCentrifugationType,
      PostCentrifugationDelay postCentrifugationDelay,
      PostCentrifugationTemperature postCentrifugationTemperature,
      ICodePart codePart) {
    super(postCentrifugationType, codePart);
    this.postCentrifugationDelay = postCentrifugationDelay;
    this.postCentrifugationTemperature = postCentrifugationTemperature;
  }


  public PostCentrifugationDelay getPostCentrifugationDelay() {
    return this.postCentrifugationDelay;
  }

 
  public PostCentrifugationTemperature getPostCentrifugationTemperature() {
    return this.postCentrifugationTemperature;
  }
}
