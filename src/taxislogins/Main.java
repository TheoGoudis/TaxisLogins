package taxislogins;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	//fxml files
	private String mainFxml="/view/MainView.fxml";
	private String clientFxml="/view/ClientView.fxml";
	private String settingsFxml="/view/SettingsView.fxml";
	private String addFxml="/view/AddView.fxml";
	
	private ObservableList<Client> clientData = FXCollections.observableArrayList();
	
	private Stage stage;
	
	@Override
	public void start(Stage stage) {
		try {
			this.stage=stage;
			
			generateData();
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ObservableList<Client> getClientData() {
        return clientData;
    }
	
	private void generateData(){
		clientData.add(new Client("Name1","LastName1","Username1","Password1",1234567890,1234567890));
		clientData.add(new Client("Name2","LastName2","Username2","Password2",1234567890,1234567890));
		clientData.add(new Client("Name3","LastName3","Username3","Password3",1234567890,1234567890));
		clientData.add(new Client("Name4","LastName4","Username4","Password4",1234567890,1234567890));
		clientData.add(new Client("Name5","LastName5","Username5","Password5",1234567890,1234567890));
		clientData.add(new Client("Name6","LastName6","Username6","Password6",1234567890,1234567890));
		clientData.add(new Client("Name7","LastName7","Username7","Password7",1234567890,1234567890));
		clientData.add(new Client("Name8","LastName8","Username8","Password8",1234567890,1234567890));
		clientData.add(new Client("Name9","LastName9","Username9","Password9",1234567890,1234567890));
		clientData.add(new Client("Name0","LastName0","Username0","Password0",1234567890,1234567890));
	}


	private void initRootLayout() {
		try{
			stage.setTitle("Taxisnet logins");
			FXMLLoader loader=new FXMLLoader();
			Parent root= loader.load(getClass().getResource(mainFxml));
			Scene scene=new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			this.stage.setScene(scene);
			this.stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
