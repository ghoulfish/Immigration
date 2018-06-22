package app.model.algorithm;

import app.model.Client;

public class FactorB {

	public static int getEduScore(Client client) {
		int eduScore = 0;
		if (client.getSpouse() == null) {
			return 0;
		}
		int edu = client.getSpouse().getEduLevel();
		if (edu == 0) {
			eduScore = Constants.B_P_EDU_MIN;
		} else if (edu == 1) {
			eduScore = Constants.B_P_EDU_SECONDARY;
		} else if (edu == 2) {
			eduScore = Constants.B_P_EDU_1Y;
		} else if (edu == 3) {
			eduScore = Constants.B_P_EDU_2Y;
		} else if (edu == 4) {
			eduScore = Constants.B_P_EDU_BACHELOR_OR_3Y;
		} else if (edu == 5) {
			eduScore = Constants.B_P_EDU_2_OR_MORE;
		} else if (edu == 6) {
			eduScore = Constants.B_P_EDU_MASTER_OR_PROFESSIONAL;
		} else if (edu == 7) {
			eduScore = Constants.B_P_EDU_PHD;
		}
		if (eduScore > Constants.B_P_EDU_MAX) {
			eduScore = Constants.B_P_EDU_MAX;
		}
		return eduScore;
	}
	
	public static int getLangScore(Client client) {
		int langScore = 0;
		if (client.getSpouse() == null) {
			return 0;
		}
		LangScore lang = client.getSpouse().getLangFirst();
		for (String k : lang.getLangScore().keySet()) {
			double v = lang.getLangScore().get(k);
			if (v <= 4) {
				langScore += Constants.B_P_LANG_MIN;
			} else if (v == 5 || v == 6) {
				langScore += Constants.B_P_LANG_5_6;
			} else if (v == 7 || v == 8) {
				langScore += Constants.B_P_LANG_7_8;
			} else if (v >= 9) {
				langScore += Constants.B_P_LANG_9;
			}
		}
		if (langScore > Constants.B_P_LANG_MAX) {
			langScore = Constants.B_P_LANG_MAX;
		}
		return langScore;
	}
	
	public static int getExpScore(Client client) {
		int expScore = 0;
		if (client.getSpouse() == null) {
			return 0;
		}
		int exp = client.getSpouse().getCanadianWorkExp();
		if (exp == 0) {
			expScore = Constants.B_P_EXP_MIN;
		} else if (exp == 1) {
			expScore = Constants.B_P_EXP_1Y;
		} else if (exp == 2) {
			expScore = Constants.B_P_EXP_2Y;
		} else if (exp == 3) {
			expScore = Constants.B_P_EXP_3Y;
		} else if (exp == 4) {
			expScore = Constants.B_P_EXP_4Y;
		} else if (exp >= 5) {
			expScore = Constants.B_P_EXP_5Y;
		}
		if (expScore > Constants.B_P_EXP_MAX) {
			expScore = Constants.B_P_EXP_MAX;
		}
		return expScore;
	}
	
	public static int getFactorBScore(Client client) {
		if (client.getSpouse() == null) {
			return 0;
		}
		int factorBScore = getEduScore(client)
				+ getLangScore(client)
				+ getExpScore(client);
		if (factorBScore > Constants.B_MAX) {
			factorBScore = Constants.B_MAX;
		}
		return factorBScore;
	}
}
