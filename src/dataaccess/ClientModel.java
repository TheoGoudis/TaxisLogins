package dataaccess;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class ClientModel {
	
	private final SimpleLongProperty id;	
	private final SimpleStringProperty firstName;
	private final SimpleStringProperty lastName;
	private final SimpleStringProperty afm;
	private final SimpleStringProperty amka;
	private final SimpleStringProperty username;
	private final SimpleStringProperty password;
	private final SimpleStringProperty category;
	
	
	public ClientModel(long id, String firstName, String lastName, String username, String password, String afm, String amka, String category) {
		this.id=new SimpleLongProperty(id);
		this.firstName=new SimpleStringProperty(firstName);
		this.lastName=new SimpleStringProperty(lastName);
		this.username=new SimpleStringProperty(username);
		this.password=new SimpleStringProperty(password);
		this.afm=new SimpleStringProperty(afm);
		this.amka=new SimpleStringProperty(amka);
		this.category=new SimpleStringProperty(category);
	}
	
	//GETters
	
	public long getId(){
		return id.get();
	}
	
	public String getFirstName(){
		return firstName.get();
	}
	
	public String getLastName(){
		return lastName.get();
	}

	
	public String getUsername(){
		return username.get();
	}
	
	public String getPassword(){
		return password.get();
	}
	
	public String getAfm(){
		return afm.get();
	}
	
	public String getAmka(){
		return amka.get();
	}
	
	public String getCategory(){
		return category.get();
	}
	
	//SETters
	
	public void setId(long id){
		this.id.set(id);
	}
	
	public void setFirstName(String firstName){
		this.firstName.set(firstName);
	}
	
	public void setLastName(String lastName){
		this.lastName.set(lastName);
	}
	
	public void setUsername(String username){
		this.username.set(username);
	}
	
	public void setPassword(String password){
		this.password.set(password);
	}
	
	public void setAfm(String afm){
		this.afm.set(afm);
	}
	
	public void setAmka(String amka){
		this.amka.set(amka);
	}
	
	public void setCategory(String category){
		this.category.set(category);
	}
}
