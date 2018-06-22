package app.model;

import app.model.algorithm.LangScore;

public class Spouse extends Client{
	
	public Spouse() {
		
	}
	
	public Spouse(int eduLevel, LangScore langFirst, int canadianWorkExp) throws NotValidInputException {
		super();
		super.setEduLevel(eduLevel);
		super.setLangFirst(langFirst);
		super.setCanadianWorkExp(canadianWorkExp);
	}
}
