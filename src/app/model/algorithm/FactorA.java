package app.model.algorithm;

import app.model.Client;

public class FactorA {

	public static int getAgeScore(Client client) {
		int age = client.getAge();
		int ageScore = 0;
		if (client.isMarried()) {
			if (age <= 17 || age >= 45) {
				ageScore = Constants.A_AGE_MIN;
				} else if (age == 18) {
					ageScore = Constants.A_AGE_18_P;
				} else if (age == 19) {
					ageScore = Constants.A_AGE_19_P;
				} else if (age >= 20 && age <= 29) {
					ageScore = Constants.A_AGE_20_to_29_P;
				} else if (age == 30) {
					ageScore = Constants.A_AGE_30_P;
				} else if (age == 31) {
					ageScore = Constants.A_AGE_31_P;
				} else if (age == 32) {
					ageScore = Constants.A_AGE_32_P;
				} else if (age == 33) {
					ageScore = Constants.A_AGE_33_P;
				} else if (age == 34) {
					ageScore = Constants.A_AGE_34_P;
				} else if (age == 35) {
					ageScore = Constants.A_AGE_35_P;
				} else if (age == 36) {
					ageScore = Constants.A_AGE_36_P;
				} else if (age == 37) {
					ageScore = Constants.A_AGE_37_P;
				} else if (age == 38) {
					ageScore = Constants.A_AGE_38_P;
				} else if (age == 39) {
					ageScore = Constants.A_AGE_39_P;
				} else if (age == 40) {
					ageScore = Constants.A_AGE_40_P;
				} else if (age == 41) {
					ageScore = Constants.A_AGE_41_P;
				} else if (age == 42) {
					ageScore = Constants.A_AGE_42_P;
				} else if (age == 43) {
					ageScore = Constants.A_AGE_43_P;
				} else if (age == 44) {
					ageScore = Constants.A_AGE_44_P;
				}
			if (ageScore > Constants.A_AGE_P_MAX) {
				ageScore = Constants.A_AGE_P_MAX;
			}
		} else {
			if (age <= 17 || age >= 45) {
				ageScore = Constants.A_AGE_MIN;
				} else if (age == 18) {
					ageScore = Constants.A_AGE_18_NP;
				} else if (age == 19) {
					ageScore = Constants.A_AGE_19_NP;
				} else if (age >= 20 && age <= 29) {
					ageScore = Constants.A_AGE_20_to_29_NP;
				} else if (age == 30) {
					ageScore = Constants.A_AGE_30_NP;
				} else if (age == 31) {
					ageScore = Constants.A_AGE_31_NP;
				} else if (age == 32) {
					ageScore = Constants.A_AGE_32_NP;
				} else if (age == 33) {
					ageScore = Constants.A_AGE_33_NP;
				} else if (age == 34) {
					ageScore = Constants.A_AGE_34_NP;
				} else if (age == 35) {
					ageScore = Constants.A_AGE_35_NP;
				} else if (age == 36) {
					ageScore = Constants.A_AGE_36_NP;
				} else if (age == 37) {
					ageScore = Constants.A_AGE_37_NP;
				} else if (age == 38) {
					ageScore = Constants.A_AGE_38_NP;
				} else if (age == 39) {
					ageScore = Constants.A_AGE_39_NP;
				} else if (age == 40) {
					ageScore = Constants.A_AGE_40_NP;
				} else if (age == 41) {
					ageScore = Constants.A_AGE_41_NP;
				} else if (age == 42) {
					ageScore = Constants.A_AGE_42_NP;
				} else if (age == 43) {
					ageScore = Constants.A_AGE_43_NP;
				} else if (age == 44) {
					ageScore = Constants.A_AGE_44_NP;
				}
			if (ageScore > Constants.A_AGE_NP_MAX) {
				ageScore = Constants.A_AGE_NP_MAX;
			}
		}
		return ageScore;
	}
	
	public static int getEduScore(Client client) {
		int eduScore = 0;
		int edu = client.getEduLevel();
		if (client.isMarried()) {
			if (edu == 0) {
				eduScore = Constants.A_EDU_MIN;
			} else if (edu == 1) {
				eduScore = Constants.A_EDU_SECONDARY_P;
			} else if (edu == 2) {
				eduScore = Constants.A_EDU_1Y_P;
			} else if (edu == 3) {
				eduScore = Constants.A_EDU_2Y_P;
			} else if (edu == 4) {
				eduScore = Constants.A_EDU_BACHELOR_OR_3Y_P;
			} else if (edu == 5) {
				eduScore = Constants.A_EDU_2_OR_MORE_P;
			} else if (edu == 6) {
				eduScore = Constants.A_EDU_MASTER_OR_PROFESSIONAL_P;
			} else if (edu == 7) {
				eduScore = Constants.A_EDU_PHD_P;
			}
			if (eduScore > Constants.A_EDU_P_MAX) {
				eduScore = Constants.A_EDU_P_MAX;
			}
		} else {
			if (edu == 0) {
				eduScore = Constants.A_EDU_MIN;
			} else if (edu == 1) {
				eduScore = Constants.A_EDU_SECONDARY_NP;
			} else if (edu == 2) {
				eduScore = Constants.A_EDU_1Y_NP;
			} else if (edu == 3) {
				eduScore = Constants.A_EDU_2Y_NP;
			} else if (edu == 4) {
				eduScore = Constants.A_EDU_BACHELOR_OR_3Y_NP;
			} else if (edu == 5) {
				eduScore = Constants.A_EDU_2_OR_MORE_NP;
			} else if (edu == 6) {
				eduScore = Constants.A_EDU_MASTER_OR_PROFESSIONAL_NP;
			} else if (edu == 7) {
				eduScore = Constants.A_EDU_PHD_NP;
			}
			if (eduScore > Constants.A_EDU_NP_MAX) {
				eduScore = Constants.A_EDU_NP_MAX;
			}
		}
		return eduScore;
	}
	
	public static int getFirstLangScore(Client client) {
		int langFirstScore = 0;
		LangScore langFirst = client.getLangFirst();
		if (client.isMarried()) {
			for (String k : langFirst.getLangScore().keySet()) {
				double v = langFirst.getLangScore().get(k);
				if (v < 4) {
					langFirstScore += Constants.A_LANG_MIN;
				} else if (v == 4 || v == 5) {
					langFirstScore += Constants.A_LANG_4_5_P;
				} else if (v == 6) {
					langFirstScore += Constants.A_LANG_6_P;
				} else if (v == 7) {
					langFirstScore += Constants.A_LANG_7_P;
				} else if (v == 8) {
					langFirstScore += Constants.A_LANG_8_P;
				} else if (v == 9) {
					langFirstScore += Constants.A_LANG_9_P;
				} else if (v >= 10) {
					langFirstScore += Constants.A_LANG_10_P;
				}
			}
			if (langFirstScore > Constants.A_LANG_P_MAX) {
				langFirstScore = Constants.A_LANG_P_MAX;
			}
		} else {
			for (String k : langFirst.getLangScore().keySet()) {
				double v = langFirst.getLangScore().get(k);
				if (v < 4) {
					langFirstScore += Constants.A_LANG_MIN;
				} else if (v == 4 || v == 5) {
					langFirstScore += Constants.A_LANG_4_5_NP;
				} else if (v == 6) {
					langFirstScore += Constants.A_LANG_6_NP;
				} else if (v == 7) {
					langFirstScore += Constants.A_LANG_7_NP;
				} else if (v == 8) {
					langFirstScore += Constants.A_LANG_8_NP;
				} else if (v == 9) {
					langFirstScore += Constants.A_LANG_9_NP;
				} else if (v >= 10) {
					langFirstScore += Constants.A_LANG_10_NP;
				}
			}
			if (langFirstScore > Constants.A_LANG_NP_MAX) {
				langFirstScore = Constants.A_LANG_NP_MAX;
			}
		}
		return langFirstScore;
	}
	
	public static int getSecondLangScore(Client client) {
		int langSecondScore = 0;
		LangScore langSecond = client.getLangSecond();
		if (client.isMarried()) {
			for (String k : langSecond.getLangScore().keySet()) {
				double v = langSecond.getLangScore().get(k);
				if (v <= 4) {
					langSecondScore += Constants.A_LANG_SEC_MIN;
				} else if (v == 5 || v == 6) {
					langSecondScore += Constants.A_LANG_SEC_5_6_P;
				} else if (v == 7 || v == 8) {
					langSecondScore += Constants.A_LANG_SEC_7_8_P;
				} else if (v >= 9) {
					langSecondScore += Constants.A_LANG_SEC_9_P;
				}
			}
			if (langSecondScore > Constants.A_LANG_SEC_P_MAX) {
				langSecondScore = Constants.A_LANG_SEC_P_MAX;
			}
		} else {
			for (String k : langSecond.getLangScore().keySet()) {
				double v = langSecond.getLangScore().get(k);
				if (v <= 4) {
					langSecondScore += Constants.A_LANG_SEC_MIN;
				} else if (v == 5 || v == 6) {
					langSecondScore += Constants.A_LANG_SEC_5_6_NP;
				} else if (v == 7 || v == 8) {
					langSecondScore += Constants.A_LANG_SEC_7_8_NP;
				} else if (v >= 9) {
					langSecondScore += Constants.A_LANG_SEC_9_NP;
				}
			}
			if (langSecondScore > Constants.A_LANG_SEC_NP_MAX) {
				langSecondScore = Constants.A_LANG_SEC_NP_MAX;
			}
		}
		return langSecondScore;
	}
	
	public static int getExpScore(Client client) {
		int expScore = 0;
		int exp = client.getCanadianWorkExp();
		if (client.isMarried()) {
			if (exp == 0) {
				expScore = Constants.A_EXP_MIN;
			} else if (exp == 1) {
				expScore = Constants.A_EXP_1Y_P;
			} else if (exp == 2) {
				expScore = Constants.A_EXP_2Y_P;
			} else if (exp == 3) {
				expScore = Constants.A_EXP_3Y_P;
			} else if (exp == 4) {
				expScore = Constants.A_EXP_4Y_P;
			} else if (exp >= 5) {
				expScore = Constants.A_EXP_5Y_P;
			}
			if (expScore > Constants.A_EXP_P_MAX) {
				expScore = Constants.A_EXP_P_MAX;
			}
		} else {
			if (exp == 0) {
				expScore = Constants.A_EXP_MIN;
			} else if (exp == 1) {
				expScore = Constants.A_EXP_1Y_NP;
			} else if (exp == 2) {
				expScore = Constants.A_EXP_2Y_NP;
			} else if (exp == 3) {
				expScore = Constants.A_EXP_3Y_NP;
			} else if (exp == 4) {
				expScore = Constants.A_EXP_4Y_NP;
			} else if (exp >= 5) {
				expScore = Constants.A_EXP_5Y_NP;
			}
			if (expScore > Constants.A_EXP_NP_MAX) {
				expScore = Constants.A_EXP_NP_MAX;
			}
		}
		return expScore;
	}
	
	public static int getFactorAScore(Client client) {
		
		int factorAScore = getAgeScore(client)
				+ getEduScore(client)
				+ getFirstLangScore(client)
				+ getSecondLangScore(client)
				+ getExpScore(client);
		if (client.isMarried() && factorAScore > Constants.A_P_MAX) {
			factorAScore = Constants.A_P_MAX;
		}
		if (!client.isMarried() && factorAScore > Constants.A_NP_MAX) {
			factorAScore = Constants.A_NP_MAX;
		}
		return factorAScore;
	}
}
