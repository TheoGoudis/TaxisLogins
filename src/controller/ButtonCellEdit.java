package controller;

import dataaccess.ClientModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ButtonCellEdit extends TableCell<ClientModel, Boolean>{
	final Button cellButton = new Button();
	
	ButtonCellEdit(){
		try{
			cellButton.setStyle("-fx-background-color:transparent");
			cellButton.setPadding(new Insets(0,0,0,0));
			ImageView btnImage = new ImageView(new Image(getClass().getResourceAsStream("/resources/edit.png")));
			cellButton.setGraphic(btnImage);
			cellButton.setAlignment(Pos.CENTER);
			
			cellButton.setOnAction(new EventHandler<ActionEvent>(){
				
				@Override
				public void handle(ActionEvent t) {
					System.out.println("Edit: Cell Button pressed "+((ClientModel) getTableRow().getItem()).getId());
				}
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
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
