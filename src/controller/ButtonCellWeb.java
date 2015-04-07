package controller;

import dataaccess.ClientModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonCellWeb extends TableCell<ClientModel, Boolean>{
	private final Button cellButton = new Button();
	
	ButtonCellWeb(TabPane tabPane){
		//TODO: FIX EMPTY NULL POINTER tabPane
		//cell style
		cellButton.setStyle("-fx-background-color:transparent");
		cellButton.setPadding(new Insets(0,0,0,0));
		ImageView btnImage = new ImageView(new Image(getClass().getResourceAsStream("/resources/web.png")));
		cellButton.setGraphic(btnImage);
		cellButton.setAlignment(Pos.CENTER);
		
		//event handler : open new browser tab
		cellButton.setOnAction(new EventHandler<ActionEvent>(){	
			@Override
			public void handle(ActionEvent t) {
				try{
					FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/BrowserView.fxml"));
					loader.setController(new controller.BrowserController());
					controller.BrowserController browserController=loader.<controller.BrowserController>getController();
					browserController.setId(((ClientModel) getTableRow().getItem()).getId());
					//((ClientModel) getTableRow().getItem()).getFirstName()+" "+((ClientModel) getTableRow().getItem()).getLastName() or browserController.getTitle()
					Tab tab=new Tab(browserController.getTitle());
					tab.setContent(loader.load());
					tabPane.getTabs().add(tab);
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Display button if the row is not empty
	@Override
	protected void updateItem(Boolean t, boolean empty) {
		super.updateItem(t, empty);
		if(!empty){
			setGraphic(cellButton);
			}
		}
}
