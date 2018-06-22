package app.view;


import app.MainApp;
import app.model.Client;
import app.model.NotValidInputException;
import app.model.Spouse;
import app.model.algorithm.LangScore;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class ClientOverviewController {

	private MainApp mainApp;
	
	ObservableList<String> eduLevelList = FXCollections
			.observableArrayList("高中以下", "高中", "1年大专", "2年大专", "3年以上大专或本科", "双学位(3年以上+1年以上)", "硕士学位或专业学位", "博士学位");
	
	ObservableList<String> langFirstList = FXCollections
			.observableArrayList("雅思-IELTS", "思培-CELPIP", "TEF", "无");
	
	ObservableList<String> langSecondList = FXCollections
			.observableArrayList("雅思-IELTS", "思培-CELPIP", "TEF", "无");
	
	ObservableList<String> eduInCAList = FXCollections
			.observableArrayList("无", "1-2年的加拿大学历", "3年及以上的加拿大学历");
	
	ObservableList<String> LMIAList = FXCollections
			.observableArrayList("无", "0, A, B类雇主担保", "00类雇主担保");
	
	ObservableList<String> spouseEduList = FXCollections
			.observableArrayList("高中以下", "高中", "1年大专", "2年大专", "3年以上大专或本科", "双学位(3年以上+1年以上)", "硕士学位或专业学位", "博士学位");
	
	ObservableList<String> spouseLangList = FXCollections
			.observableArrayList("雅思-IELTS", "思培-CELPIP", "TEF", "无");
	@FXML
	private TextField age;
	
	@FXML
	private ChoiceBox<String> eduLevelBox;
	
	@FXML
	private ChoiceBox<String> langFirstBox;
	
	@FXML
	private TextField langFirstListening;
	
	@FXML
	private TextField langFirstSpeaking;
	
	@FXML
	private TextField langFirstReading;
	
	@FXML
	private TextField langFirstWriting;
	
	@FXML
	private ChoiceBox<String> langSecondBox;
	
	@FXML
	private TextField langSecondListening;
	
	@FXML
	private TextField langSecondSpeaking;
	
	@FXML
	private TextField langSecondReading;
	
	@FXML
	private TextField langSecondWriting;
	
	@FXML
	private TextField canadianWorkExp;
	
	@FXML
	private TextField foreignWorkExp;
	
	@FXML
	private CheckBox cert;
	
	@FXML
	private CheckBox broOrSis;
	
	@FXML
	private ChoiceBox<String> eduInCABox;
	
	@FXML
	private ChoiceBox<String> LMIABox;
	
	@FXML
	private CheckBox nom;
	
	@FXML
	private CheckBox married;
	
	@FXML
	private ChoiceBox<String> spouseEduBox;
	
	@FXML
	private ChoiceBox<String> spouseLangBox;
	
	@FXML
	private TextField spouseLangListening;
	
	@FXML
	private TextField spouseLangSpeaking;
	
	@FXML
	private TextField spouseLangReading;
	
	@FXML
	private TextField spouseLangWriting;
	
	@FXML
	private TextField spouseWorkExp;
	
	@FXML
	private Button submitButton;

	public ClientOverviewController() {
	}
	
	@FXML
	private void initialize() {
		eduLevelBox.setItems(eduLevelList);
		langFirstBox.setItems(langFirstList);
		langSecondBox.setItems(langSecondList);
		eduInCABox.setItems(eduInCAList);
		LMIABox.setItems(LMIAList);
		spouseEduBox.setItems(spouseEduList);
		spouseLangBox.setItems(spouseLangList);
	}
	
	@FXML
	private void goSubmit() throws NumberFormatException, NotValidInputException {
		Client temp = new Client();
		
		if (!age.getText().trim().isEmpty()) {
			temp.setAge(Integer.parseInt(age.getText()));
		}
		
		if (!eduLevelBox.getSelectionModel().isEmpty()) {
			temp.setEduLevel(eduLevelBox.getSelectionModel().getSelectedIndex());
		}
		
		LangScore first = new LangScore();
		LangScore second = new LangScore();
		if (langFirstListening.getText().trim().isEmpty()) {
			langFirstListening.setText("0");
		}
		if (langFirstSpeaking.getText().trim().isEmpty()) {
			langFirstSpeaking.setText("0");
		}if (langFirstReading.getText().trim().isEmpty()) {
			langFirstReading.setText("0");
		}if (langFirstWriting.getText().trim().isEmpty()) {
			langFirstWriting.setText("0");
		}
		if (langFirstBox.getSelectionModel().getSelectedIndex() == 0) {
			first.transferIELTS(Double.parseDouble(langFirstReading.getText()),
					Double.parseDouble(langFirstWriting.getText()),
					Double.parseDouble(langFirstSpeaking.getText()),
					Double.parseDouble(langFirstListening.getText()));
		} else if (langFirstBox.getSelectionModel().getSelectedIndex() == 1) {
			first.setReadingScore(Double.parseDouble(langFirstReading.getText()));
			first.setWritingScore(Double.parseDouble(langFirstWriting.getText()));
			first.setSpeakingScore(Double.parseDouble(langFirstSpeaking.getText()));
			first.setListeningScore(Double.parseDouble(langFirstListening.getText()));
		} else if (langFirstBox.getSelectionModel().getSelectedIndex() == 2) {
			first.transferTEF(Double.parseDouble(langFirstReading.getText()),
					Double.parseDouble(langFirstWriting.getText()),
					Double.parseDouble(langFirstSpeaking.getText()),
					Double.parseDouble(langFirstListening.getText()));
		}
		temp.setLangFirst(first);
		
		if (langSecondListening.getText().trim().isEmpty()) {
			langSecondListening.setText("0");
		}
		if (langSecondSpeaking.getText().trim().isEmpty()) {
			langSecondSpeaking.setText("0");
		}if (langSecondReading.getText().trim().isEmpty()) {
			langSecondReading.setText("0");
		}if (langSecondWriting.getText().trim().isEmpty()) {
			langSecondWriting.setText("0");
		}
		if (langSecondBox.getSelectionModel().getSelectedIndex() == 0) {
			second.transferIELTS(Double.parseDouble(langSecondReading.getText()),
					Double.parseDouble(langSecondWriting.getText()),
					Double.parseDouble(langSecondSpeaking.getText()),
					Double.parseDouble(langSecondListening.getText()));
		} else if (langFirstBox.getSelectionModel().getSelectedIndex() == 1) {
			second.setReadingScore(Double.parseDouble(langSecondReading.getText()));
			second.setWritingScore(Double.parseDouble(langSecondWriting.getText()));
			second.setSpeakingScore(Double.parseDouble(langSecondSpeaking.getText()));
			second.setListeningScore(Double.parseDouble(langSecondListening.getText()));
		} else if (langFirstBox.getSelectionModel().getSelectedIndex() == 2) {
			second.transferTEF(Double.parseDouble(langSecondReading.getText()),
					Double.parseDouble(langSecondWriting.getText()),
					Double.parseDouble(langSecondSpeaking.getText()),
					Double.parseDouble(langSecondListening.getText()));
		}
		temp.setLangSecond(second);
		
		if (!canadianWorkExp.getText().trim().isEmpty()) {
			temp.setCanadianWorkExp(Integer.parseInt(canadianWorkExp.getText()));
		}
		
		if (!foreignWorkExp.getText().trim().isEmpty()) {
			temp.setForeignWorkExp(Integer.parseInt(foreignWorkExp.getText()));
		}

		temp.setCert(cert.isSelected());

		temp.setBroOrSis(broOrSis.isSelected());
		
		if (eduInCABox.getSelectionModel().getSelectedIndex() == 1) {
			temp.setEduInCA(2);
		} else if (eduInCABox.getSelectionModel().getSelectedIndex() == 2) {
			temp.setEduInCA(3);
		}
		
		if (LMIABox.getSelectionModel().getSelectedIndex() == 1) {
			temp.setLMIA("0");
		} else if (LMIABox.getSelectionModel().getSelectedIndex() == 2) {
			temp.setLMIA("00");
		}
		
		temp.setNom(nom.isSelected());
		
		if (married.isSelected()) {
			temp.setMarried(true);
			Spouse spouse = new Spouse();
			
			if (!spouseEduBox.getSelectionModel().isEmpty()) {
				spouse.setEduLevel(spouseEduBox.getSelectionModel().getSelectedIndex());
			}
			
			LangScore spouseLang = new LangScore();
			
			if (spouseLangListening.getText().trim().isEmpty()) {
				spouseLangListening.setText("0");
			}
			if (spouseLangSpeaking.getText().trim().isEmpty()) {
				spouseLangSpeaking.setText("0");
			}if (spouseLangReading.getText().trim().isEmpty()) {
				spouseLangReading.setText("0");
			}if (spouseLangWriting.getText().trim().isEmpty()) {
				spouseLangWriting.setText("0");
			}
			if (spouseLangBox.getSelectionModel().getSelectedIndex() == 0) {
				spouseLang.transferIELTS(Double.parseDouble(spouseLangReading.getText()),
						Double.parseDouble(spouseLangWriting.getText()),
						Double.parseDouble(spouseLangSpeaking.getText()),
						Double.parseDouble(spouseLangListening.getText()));
			} else if (spouseLangBox.getSelectionModel().getSelectedIndex() == 1) {
				spouseLang.setReadingScore(Double.parseDouble(spouseLangReading.getText()));
				spouseLang.setWritingScore(Double.parseDouble(spouseLangWriting.getText()));
				spouseLang.setSpeakingScore(Double.parseDouble(spouseLangSpeaking.getText()));
				spouseLang.setListeningScore(Double.parseDouble(spouseLangListening.getText()));
			} else if (spouseLangBox.getSelectionModel().getSelectedIndex() == 2) {
				spouseLang.transferTEF(Double.parseDouble(spouseLangReading.getText()),
						Double.parseDouble(spouseLangWriting.getText()),
						Double.parseDouble(spouseLangSpeaking.getText()),
						Double.parseDouble(spouseLangListening.getText()));
			}
			spouse.setLangFirst(spouseLang);
			
			if (!spouseWorkExp.getText().trim().isEmpty()) {
				spouse.setCanadianWorkExp(Integer.parseInt(spouseWorkExp.getText()));
			}
			
			temp.setSpouse(spouse);
		}
		mainApp.showResultDialog(temp);
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
}
