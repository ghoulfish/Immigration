package app.model.algorithm;

public class Constants {
	/* A. Core/human capital factors
	With/Without a spouse or common-law partner (Maximum 460/500 points)
	*/
	public static final int A_P_MAX = 460;
	public static final int A_NP_MAX = 500;
	
	// 1. Age with/without a spouse or common-law partner (Maximum 100/110 points)
	public static final int A_AGE_P_MAX = 100;
	public static final int A_AGE_NP_MAX = 110;
	public static final int A_AGE_MIN = 0;
	public static final int A_AGE_18_P = 90;
	public static final int A_AGE_18_NP = 99;
	public static final int A_AGE_19_P = 95;
	public static final int A_AGE_19_NP = 105;
	public static final int A_AGE_20_to_29_P = 100;
	public static final int A_AGE_20_to_29_NP = 110;
	public static final int A_AGE_30_P = 95;
	public static final int A_AGE_30_NP = 105;
	public static final int A_AGE_31_P = 90;
	public static final int A_AGE_31_NP = 99;
	public static final int A_AGE_32_P = 85;
	public static final int A_AGE_32_NP = 94;
	public static final int A_AGE_33_P = 80;
	public static final int A_AGE_33_NP = 88;
	public static final int A_AGE_34_P = 75;
	public static final int A_AGE_34_NP = 83;
	public static final int A_AGE_35_P = 70;
	public static final int A_AGE_35_NP = 77;
	public static final int A_AGE_36_P = 65;
	public static final int A_AGE_36_NP = 72;
	public static final int A_AGE_37_P = 60;
	public static final int A_AGE_37_NP = 66;
	public static final int A_AGE_38_P = 55;
	public static final int A_AGE_38_NP = 61;
	public static final int A_AGE_39_P = 50;
	public static final int A_AGE_39_NP = 55;
	public static final int A_AGE_40_P = 45;
	public static final int A_AGE_40_NP = 50;
	public static final int A_AGE_41_P = 35;
	public static final int A_AGE_41_NP = 39;
	public static final int A_AGE_42_P = 25;
	public static final int A_AGE_42_NP = 28;
	public static final int A_AGE_43_P = 15;
	public static final int A_AGE_43_NP = 17;
	public static final int A_AGE_44_P = 5;
	public static final int A_AGE_44_NP = 6;
	
	// 2. Level of education with/without a spouse or common-law partner (Maximum 140/150 points)
	public static final int A_EDU_P_MAX = 140;
	public static final int A_EDU_NP_MAX = 150;
	public static final int A_EDU_MIN = 0;
	public static final int A_EDU_SECONDARY_P = 28;
	public static final int A_EDU_SECONDARY_NP = 30;
	public static final int A_EDU_1Y_P = 84;
	public static final int A_EDU_1Y_NP = 90;
	public static final int A_EDU_2Y_P = 91;
	public static final int A_EDU_2Y_NP = 98;
	public static final int A_EDU_BACHELOR_OR_3Y_P = 112;
	public static final int A_EDU_BACHELOR_OR_3Y_NP = 120;
	public static final int A_EDU_2_OR_MORE_P = 119;
	public static final int A_EDU_2_OR_MORE_NP = 128;
	public static final int A_EDU_MASTER_OR_PROFESSIONAL_P = 126;
	public static final int A_EDU_MASTER_OR_PROFESSIONAL_NP = 135;
	public static final int A_EDU_PHD_P = 140;
	public static final int A_EDU_PHD_NP = 150;

	// 3. Official languages proficiency with/without a spouse or common-law partner (Maximum 150/160 points)
	public static final int A_LANG_P_MAX = 128;
	public static final int A_LANG_NP_MAX = 136;
	public static final int A_LANG_MIN = 0;
	public static final int A_LANG_4_5_P = 6;
	public static final int A_LANG_4_5_NP = 6;
	public static final int A_LANG_6_P = 8;
	public static final int A_LANG_6_NP = 9;
	public static final int A_LANG_7_P = 16;
	public static final int A_LANG_7_NP = 17;
	public static final int A_LANG_8_P = 22;
	public static final int A_LANG_8_NP = 23;
	public static final int A_LANG_9_P = 29;
	public static final int A_LANG_9_NP = 31;
	public static final int A_LANG_10_P = 32;
	public static final int A_LANG_10_NP = 34;
	public static final int A_LANG_SEC_P_MAX = 22;
	public static final int A_LANG_SEC_NP_MAX = 24;
	public static final int A_LANG_SEC_MIN = 0;
	public static final int A_LANG_SEC_5_6_P = 1;
	public static final int A_LANG_SEC_5_6_NP = 1;
	public static final int A_LANG_SEC_7_8_P = 3;
	public static final int A_LANG_SEC_7_8_NP = 3;
	public static final int A_LANG_SEC_9_P = 6;
	public static final int A_LANG_SEC_9_NP = 6;

	// 4. Canadian work experience with/without a spouse or common-law partner (Maximum 70/80 points)
	public static final int A_EXP_P_MAX = 70;
	public static final int A_EXP_NP_MAX = 80;
	public static final int A_EXP_MIN = 0;
	public static final int A_EXP_1Y_P = 35;
	public static final int A_EXP_1Y_NP = 40;
	public static final int A_EXP_2Y_P = 46;
	public static final int A_EXP_2Y_NP = 53;
	public static final int A_EXP_3Y_P = 56;
	public static final int A_EXP_3Y_NP = 64;
	public static final int A_EXP_4Y_P = 63;
	public static final int A_EXP_4Y_NP = 72;
	public static final int A_EXP_5Y_P = 70;
	public static final int A_EXP_5Y_NP = 80;
	
	
	/* B. Spouse or common-law partner factors (Maximum 40 points)
	A + B Maximum 500 points
	*/
	public static final int AB_MAX = 500;
	public static final int B_MAX = 40;
	
	public static final int B_P_EDU_MAX = 10;
	public static final int B_P_EDU_MIN = 0;
	public static final int B_P_EDU_SECONDARY = 2;
	public static final int B_P_EDU_1Y = 6;
	public static final int B_P_EDU_2Y = 7;
	public static final int B_P_EDU_BACHELOR_OR_3Y = 8;
	public static final int B_P_EDU_2_OR_MORE = 9;
	public static final int B_P_EDU_MASTER_OR_PROFESSIONAL = 10;
	public static final int B_P_EDU_PHD = 10;
	
	public static final int B_P_LANG_MAX = 20;
	public static final int B_P_LANG_MIN = 0;
	public static final int B_P_LANG_5_6 = 1;
	public static final int B_P_LANG_7_8 = 3;
	public static final int B_P_LANG_9 = 5;
	
	public static final int B_P_EXP_MAX = 10;
	public static final int B_P_EXP_MIN = 0;
	public static final int B_P_EXP_1Y = 5;
	public static final int B_P_EXP_2Y = 7;
	public static final int B_P_EXP_3Y = 8;
	public static final int B_P_EXP_4Y = 9;
	public static final int B_P_EXP_5Y = 10;

	
	/* C. Skill Transferability factors (Maximum 100 points)
	A + B + C Maximum 600 points
	 */
	public static final int ABC_MAX = 600;
	public static final int C_MAX = 100;
	
	// 1. Education (Maximum 50 points)
	public static final int C_EDU_CROSS_MAX = 50;
	
	public static final int C_EDU_LANG_7_MAX = 25;
	public static final int C_EDU_LANG_9_MAX = 50;
	public static final int C_EDU_LANG_MIN = 0;
	public static final int C_EDU_1Y_LANG_7 = 13;
	public static final int C_EDU_2_OR_MORE_LANG_7 = 25;
	public static final int C_EDU_1Y_LANG_9 = 25;
	public static final int C_EDU_2_OR_MORE_LANG_9 = 50;
	
	public static final int C_EDU_EXP_1Y_MAX = 25;
	public static final int C_EDU_EXP_2Y_MAX = 50;
	public static final int C_EDU_EXP_MIN = 0;
	public static final int C_EDU_1Y_EXP_1Y = 13;
	public static final int C_EDU_2_OR_MORE_EXP_1Y = 25;
	public static final int C_EDU_1Y_EXP_2Y = 25;
	public static final int C_EDU_2_OR_MORE_EXP_2Y = 50;
	
	// 2. Foreign work experience (Maximum 50 points)
	public static final int C_FOREIGN_EXP_CROSS_MAX = 50;
	
	public static final int C_FOREIGN_EXP_LANG_7_MAX = 25;
	public static final int C_FOREIGN_EXP_LANG_9_MAX = 50;
	public static final int C_FOREIGN_EXP_LANG_MIN = 0;
	public static final int C_FOREIGN_EXP_1Y_2Y_LANG_7 = 13;
	public static final int C_FOREIGN_EXP_3Y_LANG_7 = 25;
	public static final int C_FOREIGN_EXP_1Y_2Y_LANG_9 = 25;
	public static final int C_FOREIGN_EXP_3Y_LANG_9 = 50;
	
	public static final int C_FOREIGN_EXP_EXP_1Y_MAX = 25;
	public static final int C_FOREIGN_EXP_EXP_2Y_MAX = 50;
	public static final int C_FOREIGN_EXP_EXP_MIN = 0;
	public static final int C_FOREIGN_EXP_1Y_2Y_EXP_1Y = 13;
	public static final int C_FOREIGN_EXP_3Y_EXP_1Y = 25;
	public static final int C_FOREIGN_EXP_1Y_2Y_EXP_2Y = 25;
	public static final int C_FOREIGN_EXP_3Y_EXP_2Y = 50;
	
	// 3. Certificate of qualification (for people in trade occupations, maximum 50 points)
	public static final int C_CERT_CROSS_MAX = 50;
	public static final int C_CERT_LANG_5 = 25;
	public static final int C_CERT_LANG_7 = 50;
	

	/* D. Additional points (Maximum 600 points)
	Total A + B + C + D Maximum 1200 points
	*/
	public static final int ABCD_MAX = 1200;
	public static final int D_MAX = 600;
	
	public static final int D_BRO_OR_SIS = 15;
	public static final int D_LANG_NCLC_7 = 15;
	public static final int D_LANG_NCLC_7_CLB_5 = 30;
	public static final int D_EDU_1Y_2Y = 15;
	public static final int D_EDU_3Y = 30;
	public static final int D_NOC_00 = 200;
	public static final int D_NOC_0_A_B = 50;
	public static final int D_NOC_MIN = 0;
	public static final int D_PN_NOMINATION = 600;
}
