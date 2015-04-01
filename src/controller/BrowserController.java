package controller;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class BrowserController{
	
	private String user_id="none";
	private int loadedLogin=0;
	private WebEngine engine=new WebEngine();	
//	private String username="username";
//	private String password="password";
	
	@FXML
    private WebView browserWebView;
	
	@FXML
	private void initialize(){
		try{
			engine = browserWebView.getEngine();
	        engine.load("https://www1.gsis.gr/taxisnet/mytaxisnet");
	        engine.setJavaScriptEnabled(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	private void handleOnMouseEntered(MouseEvent event){
		if(loadedLogin==0){
			engine.executeScript(scriptGen());
			loadedLogin=1;
			System.out.println("DEBUG! Class:BrowserController Method:handleOnMouseEntered > Handled onMouseEntered event. user_id = "+this.user_id);
		}
	}
	
	private static String scriptGen(){
		String script="function setLoginInfo(){"
				+ "}";
		return script;
	}
	
	public void setId(String user_id){
		try{
			this.user_id=user_id;
			System.out.println("DEBUG! Class:BrowserController Method:setId > Got user_id = "+this.user_id);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
