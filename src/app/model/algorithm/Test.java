package app.model.algorithm;

import app.model.Client;
import app.model.NotValidInputException;
import app.model.Spouse;

public class Test {
	public static void main(String[] args) throws NotValidInputException {

		int age = 27;
		int eduLevel = 4;
		LangScore first = new LangScore(7, 7, 7, 7, "IELTS");
		LangScore second = new LangScore();
		int canadianWorkExp = 1;
		int foreignWorkExp = 0;
		boolean cert = false;
		boolean broOrSis = false;
		int eduInCA = 3;
		String LMIA = null;
		boolean nom = false;
		Client sm = new Client(age, eduLevel, first, second, canadianWorkExp, foreignWorkExp,
				cert, broOrSis, eduInCA, LMIA, nom);
		
		Spouse s = new Spouse(4, first, 2);
		Client sm2 =  new Client(s, age, eduLevel, first, second, canadianWorkExp, foreignWorkExp,
				cert, broOrSis, eduInCA, LMIA, nom);
		
		System.out.println("a: " + FactorA.getFactorAScore(sm));
		System.out.println("b: " + FactorB.getFactorBScore(sm));
		System.out.println("c: " + FactorC.getFactorCScore(sm));
		System.out.println("d: " + FactorD.getFactorDScore(sm));
		sm.setScore();
		System.out.println("total: " + sm.getScore());
		System.out.println("-------------------------------");
		System.out.println("a: " + FactorA.getFactorAScore(sm2));
		System.out.println("b: " + FactorB.getFactorBScore(sm2));
		System.out.println("c: " + FactorC.getFactorCScore(sm2));
		System.out.println("d: " + FactorD.getFactorDScore(sm2));
		sm2.setScore();
		System.out.println(sm2.getScore());
	
		String str = "";
		System.out.println(str.matches("[0-9]+"));
		str = null;
		System.out.println(str == null);
		System.out.println("-------------------------------");

		Client c = new Client();
		System.out.println("age: "+c.getAge());
		System.out.println("edulevel: "+c.getEduLevel());
		System.out.println("langfirst: "+c.getLangFirst());
		System.out.println("langsecond: "+c.getLangSecond());
		System.out.println("Cexp: "+c.getCanadianWorkExp());
		System.out.println("Fexp: "+c.getForeignWorkExp());
		System.out.println("cert: "+c.isCert());
		System.out.println("brosis: "+c.isBroOrSis());
		System.out.println("eduinCA: "+c.getEduInCA());
		System.out.println("LMIA: "+c.getLMIA());
		System.out.println("nom: "+c.isNom());
		
	}
}
