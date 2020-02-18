package de.spreclib.java.spreclib.precentrifugation;

import de.spreclib.java.enums.precentrifugation.PreCentrifugationType;
import de.spreclib.java.interfaces.ICodePart;

public class UnknownPreCentrifugation extends PreCentrifugation{
	
	public UnknownPreCentrifugation(ICodePart codePart) {
		super(codePart);
	}
	
	@Override 
	public PreCentrifugationType getPreCentrifugationType() {
		return PreCentrifugationType.UNKNOWN;
	}
	
	
}
