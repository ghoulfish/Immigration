package app.model.algorithm;

import app.model.Client;

public class FactorD {

	public static int getBroOrSisScore(Client client) {
		int broOrSisScore = 0;
		if (client.isBroOrSis()) {
			broOrSisScore = Constants.D_BRO_OR_SIS;
		}
		return broOrSisScore;
	}
	
	public static int getFrenchScore(Client client) {
		int frenchScore = 0;
		LangScore langFirst = client.getLangFirst();
		LangScore langSecond = client.getLangSecond();
		if (langSecond.getLangScore().get("reading") >= 7 &&
				langSecond.getLangScore().get("writing") >= 7 &&
				langSecond.getLangScore().get("speaking") >= 7 &&
				langSecond.getLangScore().get("listening") >= 7) {
			if (langFirst.getLangScore().get("reading") <= 4 &&
					langFirst.getLangScore().get("writing") <= 4 &&
					langFirst.getLangScore().get("speaking") <= 4 &&
					langFirst.getLangScore().get("listening") <= 4) {
				frenchScore = Constants.D_LANG_NCLC_7;
			} else if (langFirst.getLangScore().get("reading") >= 5 &&
					langFirst.getLangScore().get("writing") >= 5 &&
					langFirst.getLangScore().get("speaking") >= 5 &&
					langFirst.getLangScore().get("listening") >= 5) {
				frenchScore = Constants.D_LANG_NCLC_7_CLB_5;
			}
		}
		return frenchScore;
	}
	
	public static int getEduInCAScore(Client client) {
		int eduInCAScore = 0;
		if (client.getEduInCA() == 1 | client.getEduInCA() == 2) {
			eduInCAScore = Constants.D_EDU_1Y_2Y;
		} else if (client.getEduInCA() >= 3) {
			eduInCAScore = Constants.D_EDU_3Y;
		}
		return eduInCAScore;
	}
	
	public static int getLMIAScore(Client client) {
		int LMIAScore = 0;
		if (client.getLMIA() == "00") {
			LMIAScore = Constants.D_NOC_00;
		} else if (client.getLMIA() == "0" || client.getLMIA() == "A" ||client.getLMIA() == "B") {
			LMIAScore = Constants.D_NOC_0_A_B;
		} else if (client.getLMIA() == null) {
			LMIAScore = Constants.D_NOC_MIN;
		}
		return LMIAScore;
	}
	
	public static int getNomScore(Client client) {
		int nomScore = 0;
		if (client.isNom()) {
			nomScore = Constants.D_PN_NOMINATION;
		}
		return nomScore;
	}
	
	public static int getFactorDScore(Client client) {
		int factorDScore = getBroOrSisScore(client) +
				getFrenchScore(client) +
				getEduInCAScore(client) +
				getLMIAScore(client) +
				getNomScore(client);
		if (factorDScore >= Constants.D_MAX) {
			factorDScore = Constants.D_MAX;
		}
		return factorDScore;
	}
}
