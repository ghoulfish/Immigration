package app;

import java.io.IOException;

import app.model.Client;
import app.view.ClientOverviewController;
import app.view.ResultDialogController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
	private AnchorPane ClientOverview;
	private AnchorPane ResultDialog;
	
	public MainApp() {
	}

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("安省移民分数计算器");
		
		showClientOverview();
	}

	public void showClientOverview() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("view/ClientOverview.fxml"));
			ClientOverview = (AnchorPane)loader.load();
			primaryStage.setScene(new Scene(ClientOverview));
			primaryStage.show();
			
			ClientOverviewController controller = loader.getController();
			controller.setMainApp(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	
	public void showResultDialog(Client client) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("view/ResultDialog.fxml"));
			ResultDialog = (AnchorPane)loader.load();
			primaryStage.setScene(new Scene(ResultDialog));
			primaryStage.show();
			
			ResultDialogController controller = loader.getController();
			controller.setMainApp(this);
			controller.setClient(client);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
