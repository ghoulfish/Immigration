package app.model;


import app.model.algorithm.Constants;
import app.model.algorithm.FactorA;
import app.model.algorithm.FactorB;
import app.model.algorithm.FactorC;
import app.model.algorithm.FactorD;
import app.model.algorithm.LangScore;

public class Client {
	
	private int score;
	private boolean married;
	private Spouse spouse;
	private int age;
	private int eduLevel;
	private LangScore langFirst;
	private LangScore langSecond;
	private int canadianWorkExp;
	private int foreignWorkExp;
	private boolean cert;
	private boolean broOrSis;
	private int eduInCA;
	private String LMIA;
	private boolean nom;
	
	
	public Client() {
		this.score = 0;
	}
	
	public Client(
			int age,
			int eduLevel,
			LangScore langFirst,
			LangScore langSecond,
			int canadianWorkExp,
			int foreignWorkExp,
			boolean cert,
			boolean broOrSis,
			int eduInCA,
			String LMIA,
			boolean nom) {
		this.score = 0;
		this.married = false;
		this.spouse = null;
		this.age = age;
		this.eduLevel = eduLevel;
		this.langFirst = langFirst;
		this.langSecond = langSecond;
		this.canadianWorkExp = canadianWorkExp;
		this.foreignWorkExp = foreignWorkExp;
		this.cert = cert;
		this.broOrSis = broOrSis;
		this.eduInCA = eduInCA;
		this.LMIA = LMIA;
		this.nom = nom;
	}

	public Client(
			Spouse spouse,
			int age,
			int eduLevel,
			LangScore langFirst,
			LangScore langSecond,
			int canadianWorkExp,
			int foreignWorkExp,
			boolean cert,
			boolean broOrSis,
			int eduInCA,
			String LMIA,
			boolean nom) {
		this(age, eduLevel, langFirst, langSecond, canadianWorkExp, foreignWorkExp, cert, broOrSis, eduInCA, LMIA, nom);
		this.married = true;
		this.spouse = spouse;
	}

	public int getScore() {
		return score;
	}

	public void setScore() {
		int score = FactorA.getFactorAScore(this) + FactorB.getFactorBScore(this);
		if (score > Constants.AB_MAX) {
			score = Constants.AB_MAX;
		}
		score += FactorC.getFactorCScore(this);
		if (score > Constants.ABC_MAX) {
			score = Constants.ABC_MAX;
		}
		score += FactorD.getFactorDScore(this);
		if (score > Constants.ABCD_MAX) {
			score = Constants.ABCD_MAX;
		}
		this.score = score;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws NotValidInputException {
		if (age >= 0 && age <= 100) {
			this.age = age;
		} else {
			throw new NotValidInputException("请输入正确的年龄");
		}
	}
	
	public int getEduLevel() {
		return eduLevel;
	}

	public void setEduLevel(int eduLevel) throws NotValidInputException {
		if (eduLevel >= 0 && eduLevel <= 7) {
			this.eduLevel = eduLevel;
		} else {
			throw new NotValidInputException("请输入正确的学历");
		}
	}

	public LangScore getLangFirst() {
		return langFirst;
	}

	public void setLangFirst(LangScore langFirst) throws NotValidInputException {
		for (String k : langFirst.getLangScore().keySet()) {
			double v = langFirst.getLangScore().get(k);
			if (v < 0) {
				throw new NotValidInputException("请输入正确的分数");
			}
		}
		this.langFirst = langFirst;
	}

	public LangScore getLangSecond() {
		return langSecond;
	}

	public void setLangSecond(LangScore langSecond) throws NotValidInputException {
		for (String k : langSecond.getLangScore().keySet()) {
			double v = langSecond.getLangScore().get(k);
			if (v < 0) {
				throw new NotValidInputException("请输入正确的分数");
			}
		}
		this.langSecond = langSecond;
	}

	public int getCanadianWorkExp() {
		return canadianWorkExp;
	}

	public void setCanadianWorkExp(int canadianWorkExp) throws NotValidInputException {
		if (canadianWorkExp >= 0) {
			this.canadianWorkExp = canadianWorkExp;
		} else {
			throw new NotValidInputException("请输入正确的在加拿大工作时间");
		}
	}

	public int getForeignWorkExp() {
		return foreignWorkExp;
	}

	public void setForeignWorkExp(int foreignWorkExp) throws NotValidInputException {
		if (foreignWorkExp >= 0) {
			this.foreignWorkExp = foreignWorkExp;
		} else {
			throw new NotValidInputException("请输入正确的海外工作时间");
		}
	}

	public boolean isCert() {
		return cert;
	}

	public void setCert(boolean cert) {
		this.cert = cert;
	}

	public boolean isBroOrSis() {
		return broOrSis;
	}

	public void setBroOrSis(boolean broOrSis) {
		this.broOrSis = broOrSis;
	}

	public int getEduInCA() {
		return eduInCA;
	}

	public void setEduInCA(int eduInCA) throws NotValidInputException {
		if( eduInCA >= 0) {
			this.eduInCA = eduInCA;
		} else {
			throw new NotValidInputException("请输入正确的加拿大学历");
		}
	}

	public String getLMIA() {
		return LMIA;
	}

	public void setLMIA(String LMIA) throws NotValidInputException {
		if (LMIA == "00" || LMIA == "0" || LMIA == "A" || LMIA == "B" || LMIA == "C" || LMIA == "D" || LMIA == null) {
			this.LMIA = LMIA;
		} else {
			throw new NotValidInputException("请输入正确的雇主担保类型");
		}
	}

	public boolean isNom() {
		return nom;
	}

	public void setNom(boolean nom) {
		this.nom = nom;
	}
	
}
