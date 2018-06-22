package app.model.algorithm;

import app.model.Client;

public class FactorC {

	public static int getEduLangScore(Client client) {
		int eduLangScore = 0;
		LangScore lang = client.getLangFirst();
		if (lang.getLangScore().get("reading") >= 9 &&
				lang.getLangScore().get("writing") >= 9 &&
				lang.getLangScore().get("speaking") >= 9 &&
				lang.getLangScore().get("listening") >= 9) {
			if (client.getEduLevel() <= 1) {
				eduLangScore = Constants.C_EDU_LANG_MIN;
			} else if (client.getEduLevel() <= 4) {
				eduLangScore = Constants.C_EDU_1Y_LANG_9;
			} else if (client.getEduLevel() >= 5) {
				eduLangScore = Constants.C_EDU_2_OR_MORE_LANG_9;
			}
			if (eduLangScore > Constants.C_EDU_LANG_9_MAX) {
				eduLangScore = Constants.C_EDU_LANG_9_MAX;
			}
		} else if (lang.getLangScore().get("reading") >= 7 &&
				lang.getLangScore().get("writing") >= 7 &&
				lang.getLangScore().get("speaking") >= 7 &&
				lang.getLangScore().get("listening") >= 7) {
			if (client.getEduLevel() <= 1) {
				eduLangScore = Constants.C_EDU_LANG_MIN;
			} else if (client.getEduLevel() <= 4) {
				eduLangScore = Constants.C_EDU_1Y_LANG_7;
			} else if (client.getEduLevel() >= 5) {
				eduLangScore = Constants.C_EDU_2_OR_MORE_LANG_7;
			}
			if (eduLangScore > Constants.C_EDU_LANG_7_MAX) {
				eduLangScore = Constants.C_EDU_LANG_7_MAX;
			}
		} else {
			eduLangScore = Constants.C_EDU_LANG_MIN;
		}
		return eduLangScore;
	}
	
	public static int getEduExpScore(Client client) {
		int eduExpScore = 0;
		if (client.getCanadianWorkExp() == 0) {
			eduExpScore = Constants.C_EDU_EXP_MIN;
		} else if (client.getCanadianWorkExp() == 1) {
			if (client.getEduLevel() <= 1) {
				eduExpScore = Constants.C_EDU_EXP_MIN;
			} 
			else if (client.getEduLevel() <= 4) {
				eduExpScore = Constants.C_EDU_1Y_EXP_1Y;
			}
			else if (client.getEduLevel() >= 5) {
				eduExpScore = Constants.C_EDU_2_OR_MORE_EXP_1Y;
			}
			if (eduExpScore > Constants.C_EDU_EXP_1Y_MAX) {
				eduExpScore = Constants.C_EDU_EXP_1Y_MAX;
			}
		} else if (client.getCanadianWorkExp() >= 2) {
			if (client.getEduLevel() <= 1) {
				eduExpScore = Constants.C_EDU_EXP_MIN;
			} 
			else if (client.getEduLevel() <= 4) {
				eduExpScore = Constants.C_EDU_1Y_EXP_2Y;
			}
			else if (client.getEduLevel() >= 5) {
				eduExpScore = Constants.C_EDU_2_OR_MORE_EXP_2Y;
			}
			if (eduExpScore > Constants.C_EDU_EXP_2Y_MAX) {
				eduExpScore = Constants.C_EDU_EXP_2Y_MAX;
			}
		}
		return eduExpScore;
	}
	
	public static int getForeignExpLangScore(Client client) {
		int foreignExpLangScore = 0;
		LangScore lang = client.getLangFirst();
		if (lang.getLangScore().get("reading") >= 9 &&
				lang.getLangScore().get("writing") >= 9 &&
				lang.getLangScore().get("speaking") >= 9 &&
				lang.getLangScore().get("listening") >= 9) {
			if (client.getForeignWorkExp() == 0) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_LANG_MIN;
			} else if (client.getForeignWorkExp() < 3) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_1Y_2Y_LANG_9;
			} else if (client.getForeignWorkExp() >= 3) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_3Y_LANG_9;
			}
			if (foreignExpLangScore > Constants.C_FOREIGN_EXP_LANG_9_MAX) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_LANG_9_MAX;
			}
		} else if (lang.getLangScore().get("reading") >= 7 &&
				lang.getLangScore().get("writing") >= 7 &&
				lang.getLangScore().get("speaking") >= 7 &&
				lang.getLangScore().get("listening") >= 7) {
			if (client.getForeignWorkExp() == 0) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_LANG_MIN;
			} else if (client.getForeignWorkExp() < 3) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_1Y_2Y_LANG_7;
			} else if (client.getForeignWorkExp() >= 3) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_3Y_LANG_7;
			}
			if (foreignExpLangScore > Constants.C_FOREIGN_EXP_LANG_7_MAX) {
				foreignExpLangScore = Constants.C_FOREIGN_EXP_LANG_7_MAX;
			}
		} else {
			foreignExpLangScore = Constants.C_FOREIGN_EXP_LANG_MIN;
		}
		return foreignExpLangScore;
	}
	
	public static int getForeignExpExpScore(Client client) {
		int foreignExpExpScore = 0;
		if (client.getCanadianWorkExp() == 0) {
			foreignExpExpScore = Constants.C_FOREIGN_EXP_EXP_MIN;
		} else if (client.getCanadianWorkExp() == 1) {
			if (client.getForeignWorkExp() == 0) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_EXP_MIN;
			} else if (client.getForeignWorkExp() < 3) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_1Y_2Y_EXP_1Y;
			} else if (client.getForeignWorkExp() >= 3) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_3Y_EXP_1Y;
			}
			if (foreignExpExpScore >= Constants.C_FOREIGN_EXP_EXP_1Y_MAX) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_EXP_1Y_MAX;
			}
		} else if (client.getCanadianWorkExp() >= 2) {
			if (client.getForeignWorkExp() == 0) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_EXP_MIN;
			} else if (client.getForeignWorkExp() < 3) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_1Y_2Y_EXP_2Y;
			} else if (client.getForeignWorkExp() >= 3) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_3Y_EXP_2Y;
			}
			if (foreignExpExpScore >= Constants.C_FOREIGN_EXP_EXP_2Y_MAX) {
				foreignExpExpScore = Constants.C_FOREIGN_EXP_EXP_2Y_MAX;
			}
		}
		return foreignExpExpScore;
	}
	
	public static int getCertScore(Client client) {
		int certScore = 0;
		LangScore lang = client.getLangFirst();
		if (client.isCert()) {
			if (lang.getLangScore().get("reading") >= 7 &&
					lang.getLangScore().get("writing") >= 7 &&
					lang.getLangScore().get("speaking") >= 7 &&
					lang.getLangScore().get("listening") >= 7) {
				certScore = Constants.C_CERT_LANG_7;
			} else if (lang.getLangScore().get("reading") >= 5 &&
					lang.getLangScore().get("writing") >= 5 &&
					lang.getLangScore().get("speaking") >= 5 &&
					lang.getLangScore().get("listening") >= 5) {
				certScore = Constants.C_CERT_LANG_5;
			}
		}
		if (certScore >= Constants.C_CERT_CROSS_MAX) {
			certScore = Constants.C_CERT_CROSS_MAX;
		}
		return certScore;
	}
	
	public static int getFactorCScore(Client client) {
		int factorCScore = 0;
		int eduLangScore = getEduLangScore(client);
		int eduExpScore = getEduExpScore(client);
		int foreignExpLangScore = getForeignExpLangScore(client);
		int foreignExpExpScore = getForeignExpExpScore(client);
		int certScore = getCertScore(client);
		if (eduLangScore + eduExpScore >= Constants.C_EDU_CROSS_MAX) {
			factorCScore += Constants.C_EDU_CROSS_MAX;
		} else {
			factorCScore += eduLangScore + eduExpScore;
		}
		if (foreignExpLangScore + foreignExpExpScore >= Constants.C_FOREIGN_EXP_CROSS_MAX) {
			factorCScore += Constants.C_FOREIGN_EXP_CROSS_MAX;
		} else {
			factorCScore += foreignExpLangScore + foreignExpExpScore;
		}
		if (certScore >= Constants.C_CERT_CROSS_MAX) {
			factorCScore += certScore;
		}
		if (factorCScore >= Constants.C_MAX) {
			factorCScore = Constants.C_MAX;
		}
		return factorCScore;
	}
}
