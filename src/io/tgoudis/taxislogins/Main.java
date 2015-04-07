package io.tgoudis.taxislogins;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;

public class Main extends Application {
		
	@FXML private TextField mainFieldName;
	@FXML private TextField mainFieldLastname;
	@FXML private TextField mainFieldAfm;
	@FXML private TextField mainFieldUsername;
	@FXML private Button mainBtnAdd;
	@FXML private Button mainBtnShowAll;
	@FXML private Button mainBtnAdd1;
	@FXML private Button mainBtnSettings;
	@FXML private TabPane tabPane;
		
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		try {
			initRootLayout(stage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void initRootLayout(Stage stage) {
		try{
			stage.setTitle("Taxisnet logins");
			Parent root= FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
			Scene scene=new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/view/application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			System.out.println("DEBUG! Class:Main Method:initRootLayout > Stage shown");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	public void addWebTab(Tab tab){
		try{
			tabPane.getTabs().add(tab);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
			
}
