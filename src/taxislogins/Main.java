package taxislogins;

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
	
	private String mainFxml="/view/MainView.fxml";
	
	@FXML
	private TextField mainFieldName;
	@FXML
	private TextField mainFieldLastname;
	@FXML
	private TextField mainFieldAfm;
	@FXML
	private TextField mainFieldUsername;
	@FXML
	private Button mainBtnAdd;
	@FXML
	private Button mainBtnShowAll;
	@FXML
	private Button mainBtnAdd1;
	@FXML
	private Button mainBtnSettings;
	@FXML
	private TabPane tabPane;
	
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
			
			Parent root= FXMLLoader.load(getClass().getResource(mainFxml));

			Scene scene=new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/view/application.css").toExternalForm());
			stage.setScene(scene);
			
			stage.show();
			System.out.println("DEBUG! Class:Main Method:initRootLayout > Stage shown");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addWebTab(){
		try{
			//test code
			System.out.println("DEBUG! Class:Main Method:addWebTab > method called");
			String name="Όνομα Επίθετο";
			String id="0000000000";
			Tab tab=new Tab(name);
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/BrowserView.fxml"));
			loader.setController(new controller.BrowserController());
			controller.BrowserController controller=loader.<controller.BrowserController>getController();
			controller.setId(id);
			tab.setContent(loader.load());
			tabPane.getTabs().add(tab);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
			
}
