package controller;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class BrowserController{
	
	@FXML private WebView browserWebView;
	@FXML private Label browserLabelFirstname;
	@FXML private Label browserLabelLastname;
	@FXML private Label browserLabelUsername;
	@FXML private Label browserLabelPassword;
	@FXML private Label browserLabelAfm;
	@FXML private Label browserLabelAmka;
	
	private long user_id=0;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String afm;
	private String amka;
	private WebEngine engine=new WebEngine();	
	private dataaccess.DaoImpl daoImpl=new dataaccess.DaoImpl();
	
	@FXML
	private void initialize(){
		try{
			getData();
			setLabelTexts();
			addHandlers();
			engine = browserWebView.getEngine();
	        engine.load("https://www1.gsis.gr/taxisnet/mytaxisnet");
	        engine.setJavaScriptEnabled(true);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private void getData() throws Exception{
		dataaccess.ClientModel client=daoImpl.findById(user_id);
		firstName=client.getFirstName();
		lastName=client.getLastName();
		username=client.getUsername();
		password=client.getPassword();
		afm=client.getAfm();
		amka=client.getAmka();
	}
	private void setLabelTexts(){
		browserLabelFirstname.setText(firstName);
		browserLabelLastname.setText(lastName);
		browserLabelUsername.setText(username);
		browserLabelPassword.setText(password);
		browserLabelAfm.setText(afm);
		browserLabelAmka.setText(amka);
	}
	
	private void addHandlers(){
		browserLabelFirstname.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				copyToClipboard(firstName);
			}
		});
		browserLabelLastname.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				copyToClipboard(lastName);
			}
		});
		browserLabelUsername.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				copyToClipboard(username);
			}
		});
		browserLabelPassword.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				copyToClipboard(password);
			}
		});
		browserLabelAfm.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				copyToClipboard(afm);
			}
		});
		browserLabelAmka.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				copyToClipboard(amka);
			}
		});
	}
	
	private static void copyToClipboard(String text)
    {
		final Clipboard clipboard = Clipboard.getSystemClipboard();
		final ClipboardContent content = new ClipboardContent();
		content.putString(text);
		clipboard.setContent(content);
    }
	
	public void setId(long user_id){
		try{
			this.user_id=user_id;
			System.out.println("DEBUG! Class:BrowserController Method:setId > Got user_id = "+this.user_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getTitle(){
		return(firstName+" "+lastName);
	}
	
}
