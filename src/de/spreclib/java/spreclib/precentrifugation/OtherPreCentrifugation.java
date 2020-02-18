package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class OtherPreCentrifugation extends PreCentrifugation {
	
	public OtherPreCentrifugation(ICodePart codePart) {
		super(codePart);
	}
	
	@Override 
	public PreCentrifugationType getPreCentrifugationType() {
		return PreCentrifugationType.OTHER;
	}
}
