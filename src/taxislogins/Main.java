package taxislogins;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private Stage primaryStage;
	
	private ObservableList<Person> personData = FXCollections.observableArrayList();
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage=primaryStage;
			this.primaryStage.setTitle("Taxisnet logins");
			
			initRootLayout();
			//showPersonList();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void showPersonList() {
		try{
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private void initRootLayout() {
		try{
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("TlFxml.fxml"));
			Scene scene = new Scene(root,900,480);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		launch(args);
		
	}
}
