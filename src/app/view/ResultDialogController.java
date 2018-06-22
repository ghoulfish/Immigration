package app.view;


import app.MainApp;
import app.model.Client;
import app.model.algorithm.FactorA;
import app.model.algorithm.FactorB;
import app.model.algorithm.FactorC;
import app.model.algorithm.FactorD;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ResultDialogController {

	private MainApp mainApp;
	
	@FXML
	private Label totalScore;
	
	@FXML
	private Label factorAScore;
	
	@FXML
	private Label ageScore;
	
	@FXML
	private Label eduLevelScore;
	
	@FXML
	private Label langFirstScore;
	
	@FXML
	private Label langSecondScore;
	
	@FXML
	private Label canadianWorkExpScore;
	
	@FXML
	private Label factorBScore;
	
	@FXML
	private Label spouseEduScore;
	
	@FXML
	private Label spouseLangScore;
	
	@FXML
	private Label spouseWorkExpScore;
	
	@FXML
	private Label factorCScore;
	
	@FXML
	private Label eduLangScore;
	
	@FXML
	private Label eduExpScore;
	
	@FXML
	private Label foreighExpLangScore;
	
	@FXML
	private Label foreignExpExpScore;
	
	@FXML
	private Label certScore;
	
	@FXML
	private Label factorDScore;
	
	@FXML
	private Label broOrSisScore;
	
	@FXML
	private Label frenchScore;
	
	@FXML
	private Label eduInCAScore;
	
	@FXML
	private Label LMIAScore;
	
	@FXML
	private Label nomScore;
	
	@FXML
	private Button backButton;
	
	@FXML
	private void initialize() {
	}

	public void setClient(Client client) {
		client.setScore();
		totalScore.setText(String.valueOf(client.getScore()));
		factorAScore.setText(String.valueOf(FactorA.getFactorAScore(client)));
		ageScore.setText(String.valueOf(FactorA.getAgeScore(client)));
		eduLevelScore.setText(String.valueOf(FactorA.getEduScore(client)));
		langFirstScore.setText(String.valueOf(FactorA.getFirstLangScore(client)));
		langSecondScore.setText(String.valueOf(FactorA.getSecondLangScore(client)));
		canadianWorkExpScore.setText(String.valueOf(FactorA.getExpScore(client)));
		factorBScore.setText(String.valueOf(FactorB.getFactorBScore(client)));	
		spouseEduScore.setText(String.valueOf(FactorB.getEduScore(client)));
		spouseLangScore.setText(String.valueOf(FactorB.getLangScore(client)));
		spouseWorkExpScore.setText(String.valueOf(FactorB.getExpScore(client)));
		factorCScore.setText(String.valueOf(FactorC.getFactorCScore(client)));
		eduLangScore.setText(String.valueOf(FactorC.getEduLangScore(client)));
		eduExpScore.setText(String.valueOf(FactorC.getEduExpScore(client)));
		foreighExpLangScore.setText(String.valueOf(FactorC.getForeignExpLangScore(client)));
		foreignExpExpScore.setText(String.valueOf(FactorC.getForeignExpExpScore(client)));
		certScore.setText(String.valueOf(FactorC.getCertScore(client)));
		factorDScore.setText(String.valueOf(FactorD.getFactorDScore(client)));
		broOrSisScore.setText(String.valueOf(FactorD.getBroOrSisScore(client)));
		frenchScore.setText(String.valueOf(FactorD.getFrenchScore(client)));
		eduInCAScore.setText(String.valueOf(FactorD.getEduInCAScore(client)));
		LMIAScore.setText(String.valueOf(FactorD.getLMIAScore(client)));
		nomScore.setText(String.valueOf(FactorD.getNomScore(client)));
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	@FXML
	private void back(){
		mainApp.showClientOverview();
	}

	
}
