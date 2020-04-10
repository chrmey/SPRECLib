package de.spreclib.api.parameters;

public class Temperature {

  private float temperatureCelsius;

  public Temperature(float temperatureCelsius) {
    this.temperatureCelsius = temperatureCelsius;
  }
  
  
  public float getTemperatureCelsius() {
    return this.temperatureCelsius;
  }
  
}
