package app.model.algorithm;

import java.util.HashMap;

public class LangScore {

	private HashMap<String, Double> langScore;
	
	public LangScore() {
		this.langScore = new HashMap<>();
		langScore.put("reading", 0.0);
		langScore.put("writing", 0.0);
		langScore.put("speaking", 0.0);
		langScore.put("listening", 0.0);
	}
	
	public LangScore(double reading, double writing, double speaking, double listening, String type) {
		this();
		if (type == "CELPIP") {
			setReadingScore(reading);
			setWritingScore(writing);
			setSpeakingScore(speaking);
			setListeningScore(listening);
		} else if (type == "IELTS") {
			transferIELTS(reading, writing, speaking, listening);
		} else if (type == "TEF") {
			transferTEF(reading, writing, speaking, listening);
		}
	}

	public HashMap<String, Double> getLangScore() {
		return langScore;
	}

	public void setReadingScore(double value) {
		langScore.replace("reading", value);
	}
	
	public void setWritingScore(double value) {
		langScore.replace("writing", value);
	}
	
	public void setSpeakingScore(double value) {
		langScore.replace("speaking", value);
	}
	
	public void setListeningScore(double value) {
		langScore.replace("listening", value);
	}
	
	public void transferIELTS(double reading, double writing, double speaking, double listening) {
		if (reading < 3.5) {
			setReadingScore(0);
		} else if (reading >= 3.5 && reading < 4) {
			setReadingScore(4);
		} else if (reading >= 4 && reading < 5) {
			setReadingScore(5);
		} else if (reading >= 5 && reading < 6) {
			setReadingScore(6);
		} else if (reading >= 6 && reading < 6.5) {
			setReadingScore(7);
		} else if (reading >= 6.5 && reading < 7) {
			setReadingScore(8);
		} else if (reading >= 7 && reading < 8) {
			setReadingScore(9);
		}  else if (reading >= 8) {
			setReadingScore(10);
		}
		
		if (writing < 4) {
			setWritingScore(0);
		} else if (writing >= 4 && writing < 5) {
			setWritingScore(4);
		} else if (writing >= 5 && writing < 5.5) {
			setWritingScore(5);
		} else if (writing >= 5.5 && writing < 6) {
			setWritingScore(6);
		} else if (writing >= 6 && writing < 6.5) {
			setWritingScore(7);
		} else if (writing >= 6.5 && writing < 7) {
			setWritingScore(8);
		} else if (writing >= 7 && writing < 7.5) {
			setWritingScore(9);
		} else if (writing >= 7.5) {
			setWritingScore(10);
		}
		
		if (listening < 4.5) {
			setListeningScore(0);
		} else if (listening >= 4.5 && listening < 5) {
			setListeningScore(4);
		} else if (listening >= 5 && listening < 5.5) {
			setListeningScore(5);
		} else if (listening >= 5.5 && listening < 6) {
			setListeningScore(6);
		} else if (listening >= 6 && listening < 7.5) {
			setListeningScore(7);
		} else if (listening >= 7.5 && listening < 8) {
			setListeningScore(8);
		} else if (listening >= 8 && listening < 8.5) {
			setListeningScore(9);
		} else if (listening >= 8.5) {
			setListeningScore(10);
		}
		
		if (speaking < 4) {
			setSpeakingScore(0);
		} else if (speaking >= 4 && speaking < 5) {
			setSpeakingScore(4);
		} else if (speaking >= 5 && speaking < 5.5) {
			setSpeakingScore(5);
		} else if (speaking >= 5.5 && speaking < 6) {
			setSpeakingScore(6);
		} else if (speaking >= 6 && speaking < 6.5) {
			setSpeakingScore(7);
		} else if (speaking >= 6.5 && speaking < 7) {
			setSpeakingScore(8);
		} else if (speaking >= 7 && speaking < 7.5) {
			setSpeakingScore(9);
		} else if (speaking >= 7.5) {
			setSpeakingScore(10);
		}
	}
	
	public void transferTEF(double reading, double writing, double speaking, double listening) {
		if (reading < 121) {
			setReadingScore(0);
		} else if (reading >= 121 && reading <= 150) {
			setReadingScore(4);
		} else if (reading >= 151 && reading <= 180) {
			setReadingScore(5);
		} else if (reading >= 181 && reading <= 206) {
			setReadingScore(6);
		} else if (reading >= 207 && reading <= 232) {
			setReadingScore(7);
		} else if (reading >= 233 && reading <= 247) {
			setReadingScore(8);
		} else if (reading >= 248 && reading <= 262) {
			setReadingScore(9);
		}  else if (reading >= 263 && reading <= 277) {
			setReadingScore(10);
		}
		
		if (writing < 181) {
			setWritingScore(0);
		} else if (writing >= 181 && writing <= 225) {
			setWritingScore(4);
		} else if (writing >= 226 && writing <= 270) {
			setWritingScore(5);
		} else if (writing >= 271 && writing <= 309) {
			setWritingScore(6);
		} else if (writing >= 310 && writing <= 348) {
			setWritingScore(7);
		} else if (writing >= 349 && writing <= 370) {
			setWritingScore(8);
		} else if (writing >= 371 && writing <= 392) {
			setWritingScore(9);
		} else if (writing >= 393 && writing <= 415) {
			setWritingScore(10);
		}
		
		if (listening < 145) {
			setListeningScore(0);
		} else if (listening >= 145 && listening <= 180) {
			setListeningScore(4);
		} else if (listening >= 181 && listening <= 216) {
			setListeningScore(5);
		} else if (listening >= 217 && listening <= 248) {
			setListeningScore(6);
		} else if (listening >= 249 && listening <= 279) {
			setListeningScore(7);
		} else if (listening >= 280 && listening <= 297) {
			setListeningScore(8);
		} else if (listening >= 298 && listening <= 315) {
			setListeningScore(9);
		} else if (listening >= 316 && listening <= 333) {
			setListeningScore(10);
		}
		
		if (speaking < 181) {
			setSpeakingScore(0);
		} else if (speaking >= 181 && speaking <= 225) {
			setSpeakingScore(4);
		} else if (speaking >= 226 && speaking <= 270) {
			setSpeakingScore(5);
		} else if (speaking >= 271 && speaking <= 309) {
			setSpeakingScore(6);
		} else if (speaking >= 310 && speaking <= 348) {
			setSpeakingScore(7);
		} else if (speaking >= 349 && speaking <= 370) {
			setSpeakingScore(8);
		} else if (speaking >= 371 && speaking <= 392) {
			setSpeakingScore(9);
		} else if (speaking >= 393 && speaking <= 415) {
			setSpeakingScore(10);
		}
	}
}
