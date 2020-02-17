package de.spreclib.java.spreclib;

import java.util.ArrayList;
import java.util.List;

import de.spreclib.java.enums.CentrifugationBraking;
import de.spreclib.java.enums.CentrifugationTemperature;
import de.spreclib.java.interfaces.CentrifugationTime;
import de.spreclib.java.interfaces.ICentrifugation;
import de.spreclib.java.interfaces.ICodePart;

public class MyCentrifugation implements ICentrifugation {

	protected static final List<ICentrifugation> centrifugations;

	static {
		centrifugations = new ArrayList<>();
		centrifugations.add(new NoCentrifugation());
		centrifugations.add(new UnknownCentrifugation());
		centrifugations.add(new OtherCentrifugation());
	}

	private CentrifugationType centrifugationDetail;
    private CentrifugationTemperature centrifugationTemperature;
    private CentrifugationTime centrifugationTime;
    private CentrifugationBraking centrifugationBraking;
    private ICodePart codePart;

	public MyCentrifugation(
      CentrifugationType centrifugationDetail,
      CentrifugationTemperature centrifugationTemperature,
      CentrifugationTime centrifugationTime,
      CentrifugationBraking centrifugationBraking,
      ICodePart codePart) {
    super();
    this.centrifugationDetail = centrifugationDetail;
    this.centrifugationTemperature = centrifugationTemperature;
    this.centrifugationTime = centrifugationTime;
    this.centrifugationBraking = centrifugationBraking;
    this.codePart = codePart;
  }

  @Override
	public CentrifugationType getCentrifugationType() {
		return centrifugationDetail;
	}

	@Override
	public CentrifugationTemperature getCentrifugationTemperature() {
		return centrifugationTemperature;
	}

	@Override
	public CentrifugationTime getCentrifugationTime() {
		return centrifugationTime;
	}

	@Override
	public CentrifugationBraking getCentrifugationBraking() {
		return centrifugationBraking;
	}

}
